//package code2022;
//
////package com.kkr.web.servlet;
//
//import java.io.IOException;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//import java.util.Timer;
//import java.util.TimerTask;
//import java.util.concurrent.ConcurrentHashMap;
//
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.web.context.support.WebApplicationContextUtils;
//
//import com.kkr.app.service.ITaskService;
//import com.kkr.app.task.BaseTask;
//import com.kkr.common.model.TaskDto;
//import com.kkr.common.model.TaskLogDto;
//import com.kkr.common.util.CommonUtils;
//import com.kkr.common.util.Constants;
//
//import net.sf.ehcache.CacheManager;
//
//@SuppressWarnings("serial")
//public class InitServlet extends HttpServlet {
//
//    private static Log logger = LogFactory.getLog(InitServlet.class);
//    public static boolean isServerStarted = true;
//    public static Map<Long, BaseTask> baseTaskMap = new HashMap<Long, BaseTask>();
//    public static Map<Long, Boolean> activeTaskMap = new ConcurrentHashMap<Long, Boolean>();
//    public static boolean isAnotherACLRunning = false;
//
//    public InitServlet() {
//        super();
//    }
//
//    public void init(ServletConfig servletConfig) throws ServletException {
//        super.init(servletConfig);
//
//        Timer timer = new Timer("Init Tasks", true);
//        logger.info("Init servlet called....");
//        timer.scheduleAtFixedRate(new TaskThread(), 0, 4*60*1000);
//        (new Thread(new RunnableTaskThread())).start();
//        isServerStarted = false;
//    }
//
//    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.service(request, response);
//    }
//
//    public void destroy(){
//        super.destroy();
//        CacheManager.getInstance().shutdown();
//    }
//
//    private class RunnableTaskThread implements Runnable{
//
//        @Override
//        public void run() {
//            ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
//            ITaskService service = (ITaskService) ctx.getBean("taskService");
//            while(true) {
//                for(Entry<Long, BaseTask> bTMEntry : baseTaskMap.entrySet()) {
//                    try {
//                        Long tId = bTMEntry.getKey();
//                        BaseTask bTask = bTMEntry.getValue();
//                        TaskDto bTDTO = bTask.getTask();
//                        Boolean active = activeTaskMap.get(tId);
//
//                        if (active != null) {
//                            if (active && (tId < 22 || tId > 26)) {
//                                if(bTDTO != null && !bTDTO.getLastRunStatus().equals(Constants.SCHED_STAT_RUNNING)
//                                        && !bTDTO.getLastRunStatus().equals(Constants.LAST_RUN_lOAD_SUCCESS)) {
//                                    if(bTDTO.getForce_run()) {
//                                        new Thread(bTask).start();
//                                        markTaskRun(tId, service, bTDTO.getRunType());
//                                        service.resetForceRunForTask(tId);
//                                        activeTaskMap.put(tId, false);
//                                    }
//                                    String[] skipDays = bTDTO.getSkipDays() != null ? bTDTO.getSkipDays().split(",") : new String[0];
//                                    Calendar c = Calendar.getInstance();
//                                    c.setTime(new Date());
//                                    Boolean flagToRun = true;
//                                    for (String day : skipDays) {
//                                        if(c.get(Calendar.DAY_OF_WEEK) == Long.parseLong(day)) {
//                                            flagToRun = false;
//                                            break;
//                                        }
//                                    }
//                                    if(CommonUtils.isHoliday(bTDTO.getTaskId())) {
//                                        flagToRun = false;
//                                    }
//                                    if(bTDTO.getCheckMarketOpen()) {
//                                        List<Date> holidayList = service.getHolidaysList();
//                                        if(bTDTO.getTaskId()==37) {
//                                            if(!CommonUtils.checkPrePostTime(holidayList)) {
//                                                flagToRun=false;
//                                            }
//                                        }
//                                        else if(!CommonUtils.checkIsMarketTime(holidayList)) {
//                                            flagToRun = false;
//                                        }
//                                    }
//                                    if(bTDTO.getSchedule_type().equalsIgnoreCase(Constants.Scheduled_continuous) && flagToRun) {
//                                        if(((new Date().getTime() - (CommonUtils.formatDate(bTDTO.getLastRunCompleteTime(), Constants.DATETIME_MYSQL_FORMAT).getTime()))/(1000*60))
//                                                >= bTDTO.getFrequencyMinutes()) {
//                                            new Thread(bTask).start();
//                                            markTaskRun(tId, service, bTDTO.getRunType());
//                                            activeTaskMap.put(tId, false);
//                                        }
//                                    }
//                                    if(bTDTO.getSchedule_type().equalsIgnoreCase(Constants.Scheduled_Daily)) {
//                                        if(flagToRun) {
//                                            Calendar cScheduled = Calendar.getInstance();
//                                            cScheduled.setTime(new Date());
//                                            cScheduled.set(Calendar.HOUR_OF_DAY, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[0]));
//                                            cScheduled.set(Calendar.MINUTE, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[1]));
//                                            cScheduled.set(Calendar.SECOND, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[2]));
//
//                                            Calendar cal = Calendar.getInstance();
//                                            cal.setTime(CommonUtils.formatDate(bTDTO.getLastRunStartTime(), Constants.DATETIME_MYSQL_FORMAT));
//                                            cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[0]));
//                                            cal.set(Calendar.MINUTE, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[1]));
//                                            cal.set(Calendar.SECOND, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[2]));
//                                            if(CommonUtils.getDaysDifference(new Date(), cal.getTime()) > 1
//                                                    && (new Date().getTime() > cScheduled.getTimeInMillis())){
//                                                new Thread(bTask).start();
//                                                markTaskRun(tId, service, bTDTO.getRunType());
//                                                activeTaskMap.put(tId, false);
//                                            }
//                                        }
//                                    }
//                                    if(bTDTO.getSchedule_type().equalsIgnoreCase(Constants.Scheduled_Weekly)) {
//                                        String dayOfWeek = bTDTO.getDayOfWeek();
//                                        Calendar cal = Calendar.getInstance();
//                                        cal.setTime(new Date());
//                                        Calendar cScheduled = Calendar.getInstance();
//                                        cScheduled.setTime(new Date());
//                                        cScheduled.set(Calendar.HOUR_OF_DAY, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[0]));
//                                        cScheduled.set(Calendar.MINUTE, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[1]));
//                                        cScheduled.set(Calendar.SECOND, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[2]));
//                                        if((cal.get(Calendar.DAY_OF_WEEK) == Long.parseLong(dayOfWeek))
//                                                && CommonUtils.getDaysDifference(new Date(), (CommonUtils.formatDate(bTDTO.getLastRunStartTime(), Constants.DATETIME_MYSQL_FORMAT))) > 1
//                                                && (new Date().getTime() > cScheduled.getTimeInMillis())){
//                                            new Thread(bTask).start();
//                                            markTaskRun(tId, service, bTDTO.getRunType());
//                                            activeTaskMap.put(tId, false);
//                                        }
//                                    }
//                                    if(bTDTO.getSchedule_type().equalsIgnoreCase(Constants.Scheduled_Monthly)) {
//                                        String scheduleDay = bTDTO.getSchdeuledDate();
//                                        Calendar cal = Calendar.getInstance();
//                                        cal.setTime(new Date());
//                                        cal.set(Calendar.DAY_OF_WEEK, Integer.parseInt(scheduleDay));
//                                        cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
//                                        Calendar cToday = Calendar.getInstance();
//                                        cToday.setTime(new Date());
//                                        Calendar cScheduled = Calendar.getInstance();
//                                        cScheduled.setTime(new Date());
//                                        cScheduled.set(Calendar.HOUR_OF_DAY, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[0]));
//                                        cScheduled.set(Calendar.MINUTE, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[1]));
//                                        cScheduled.set(Calendar.SECOND, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[2]));
//                                        if((cToday.get(Calendar.DAY_OF_MONTH) == cal.get(Calendar.DATE))
//                                                && CommonUtils.getDaysDifference(new Date(), (CommonUtils.formatDate(bTDTO.getLastRunStartTime(), Constants.DATETIME_MYSQL_FORMAT))) > 1
//                                                && (new Date().getTime() > cScheduled.getTimeInMillis())){
//                                            new Thread(bTask).start();
//                                            markTaskRun(tId, service, bTDTO.getRunType());
//                                            activeTaskMap.put(tId, false);
//                                        }
//                                    }
//                                }
//                            } else if(active && tId >= 22 && tId <=26 && !isAnotherACLRunning) {
//                                if(bTDTO != null && !bTDTO.getLastRunStatus().equals(Constants.SCHED_STAT_RUNNING) && !bTDTO.getLastRunStatus().equals(Constants.LAST_RUN_lOAD_SUCCESS)) {
//                                    if(bTDTO.getForce_run()) {
//                                        new Thread(bTask).start();
//                                        markTaskRun(tId, service, bTDTO.getRunType());
//                                        service.resetForceRunForTask(tId);
//                                        activeTaskMap.put(tId, false);
//                                    }
//                                    String[] skipDays = bTDTO.getSkipDays() != null ? bTDTO.getSkipDays().split(",") : new String[0];
//                                    Calendar c = Calendar.getInstance();
//                                    c.setTime(new Date());
//                                    Boolean flagToRun = true;
//                                    for (String day : skipDays) {
//                                        if(c.get(Calendar.DAY_OF_WEEK) == Long.parseLong(day)) {
//                                            flagToRun = false;
//                                            break;
//                                        }
//                                    }
//
////									if(CommonUtils.isHoliday()) {
////										flagToRun = false;
////									}
//                                    if(bTDTO.getCheckMarketOpen()) {
//                                        List<Date> holidayList = service.getHolidaysList();
//                                        if(bTDTO.getTaskId()==37) {
//                                            if(!CommonUtils.checkPrePostTime(holidayList)) {
//                                                flagToRun=false;
//                                            }
//                                        }
//                                        else if(!CommonUtils.checkIsMarketTime(holidayList)) {
//                                            flagToRun = false;
//                                        }
//                                    }
//                                    if(bTDTO.getSchedule_type().equalsIgnoreCase(Constants.Scheduled_continuous) && flagToRun) {
//                                        if(((new Date().getTime() - (CommonUtils.formatDate(bTDTO.getLastRunCompleteTime(), Constants.DATETIME_MYSQL_FORMAT).getTime()))/(1000*60))
//                                                >= bTDTO.getFrequencyMinutes()) {
//                                            new Thread(bTask).start();
//                                            markTaskRun(tId, service, bTDTO.getRunType());
//                                            activeTaskMap.put(tId, false);
//                                        }
//                                    }
//                                    if(bTDTO.getSchedule_type().equalsIgnoreCase(Constants.Scheduled_Daily)) {
//                                        if(flagToRun) {
//                                            Calendar cScheduled = Calendar.getInstance();
//                                            cScheduled.setTime(new Date());
//                                            cScheduled.set(Calendar.HOUR_OF_DAY, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[0]));
//                                            cScheduled.set(Calendar.MINUTE, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[1]));
//                                            cScheduled.set(Calendar.SECOND, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[2]));
//
//                                            if(CommonUtils.getDaysDifference(new Date(), (CommonUtils.formatDate(bTDTO.getLastRunStartTime(), Constants.DATETIME_MYSQL_FORMAT))) > 1
//                                                    && (new Date().getTime() > cScheduled.getTimeInMillis())){
//                                                new Thread(bTask).start();
//                                                markTaskRun(tId, service, bTDTO.getRunType());
//                                                activeTaskMap.put(tId, false);
//                                            }
//                                        }
//                                    }
//                                    if(bTDTO.getSchedule_type().equalsIgnoreCase(Constants.Scheduled_Weekly)) {
//                                        String dayOfWeek = bTDTO.getDayOfWeek();
//                                        Calendar cal = Calendar.getInstance();
//                                        cal.setTime(new Date());
//                                        Calendar cScheduled = Calendar.getInstance();
//                                        cScheduled.setTime(new Date());
//                                        cScheduled.set(Calendar.HOUR_OF_DAY, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[0]));
//                                        cScheduled.set(Calendar.MINUTE, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[1]));
//                                        cScheduled.set(Calendar.SECOND, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[2]));
//                                        if((cal.get(Calendar.DAY_OF_WEEK) == Long.parseLong(dayOfWeek))
//                                                && CommonUtils.getDaysDifference(new Date(), (CommonUtils.formatDate(bTDTO.getLastRunStartTime(), Constants.DATETIME_MYSQL_FORMAT))) > 1
//                                                && (new Date().getTime() > cScheduled.getTimeInMillis())){
//                                            new Thread(bTask).start();
//                                            markTaskRun(tId, service, bTDTO.getRunType());
//                                            activeTaskMap.put(tId, false);
//                                        }
//                                    }
//                                    if(bTDTO.getSchedule_type().equalsIgnoreCase(Constants.Scheduled_Monthly)) {
//                                        String scheduleDay = bTDTO.getSchdeuledDate();
//                                        Calendar cal = Calendar.getInstance();
//                                        cal.setTime(new Date());
//                                        cal.set(Calendar.DAY_OF_WEEK, Integer.parseInt(scheduleDay));
//                                        cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
//                                        Calendar cToday = Calendar.getInstance();
//                                        cToday.setTime(new Date());
//                                        Calendar cScheduled = Calendar.getInstance();
//                                        cScheduled.setTime(new Date());
//                                        cScheduled.set(Calendar.HOUR_OF_DAY, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[0]));
//                                        cScheduled.set(Calendar.MINUTE, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[1]));
//                                        cScheduled.set(Calendar.SECOND, Integer.parseInt(bTDTO.getSchdeuledTime().split(":")[2]));
//                                        if((cToday.get(Calendar.DAY_OF_MONTH) == cal.get(Calendar.DATE))
//                                                && CommonUtils.getDaysDifference(new Date(), (CommonUtils.formatDate(bTDTO.getLastRunStartTime(), Constants.DATETIME_MYSQL_FORMAT))) > 1
//                                                && (new Date().getTime() > cScheduled.getTimeInMillis())){
//                                            new Thread(bTask).start();
//                                            markTaskRun(tId, service, bTDTO.getRunType());
//                                            activeTaskMap.put(tId, false);
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    } catch (Exception e) {
//                        CommonUtils.sendMail(null, e.getMessage(), "Task Running Failed");
//                        e.printStackTrace();
//                    }
//                }
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    logger.error("Error while Thread.sleep:", e);
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    private void markTaskRun(Long tId, ITaskService service, String runType){
//        try {
//            if(runType.equals(Constants.RUN_TYPE_MOVE)) {
//                service.markTaskRunning(tId, false);
//            } else {
//                service.markTaskRunning(tId, true);
//            }
//        } catch (Exception ex) {
//            try {
//                logger.error("Error while running recurring task:", ex);
//                service.markTaskComplete(tId, "ERROR", true);
//                service.logTaskStatus(new TaskLogDto(tId, ex.getMessage()));
//                ex.printStackTrace();
//            } catch (Exception e) {
//                logger.error("Error while updating task Failure status.", e);
//                e.printStackTrace();
//            }
//        }
//    }
//
//    private class TaskThread extends TimerTask {
//
//        @Override
//        public void run() {
//            ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
//            ITaskService service = (ITaskService) ctx.getBean("taskService");
//            try {
//                logger.info("updateLongRunningJobs... ");
//                service.updateLongRunningJobs();
//                logger.info("Getting runnable tasks from DB ...");
//                List<TaskDto> tasks = service.getRunnableTasks();
//
//                Set<Long> activeTaskSet = new HashSet<Long>();
//                Set<Long> totalTaskSet = new HashSet<Long>();
//                isAnotherACLRunning = false;
//
//                for(TaskDto task : tasks) {
//                    logger.info("task:" + task.getExecuterClass());
//                    BaseTask thisTask = (BaseTask) Class.forName(task.getExecuterClass()).newInstance();
//                    thisTask.setCtx(ctx);
//                    thisTask.setTask(task);
//                    baseTaskMap.put(task.getTaskId(), thisTask);
//                    activeTaskMap.put(task.getTaskId(), true);
//                    activeTaskSet.add(task.getTaskId());
//                    if(task.getTaskId() >= 22 && task.getTaskId() <=26 && task.getLastRunStatus().equalsIgnoreCase("RUNNING")) {
//                        isAnotherACLRunning = true;
//                    }
//                }
//
//                for(Entry<Long, Boolean> activeTask : activeTaskMap.entrySet()) {
//                    totalTaskSet.add(activeTask.getKey());
//                }
//
//                totalTaskSet.removeAll(activeTaskSet);
//
//                for(Long inactiveTask : totalTaskSet) {
//                    activeTaskMap.put(inactiveTask, false);
//                }
//            } catch (Exception ex) {
//                logger.error("Error while starting runnable tasks: " + ex.getMessage());
//            }
//        }
//    }
//}
//

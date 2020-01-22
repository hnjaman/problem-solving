package hackjava;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JavaDateandTime {
    public static DayOfWeek getDay(String day, String month, String year) {
        int a = Integer.parseInt(day);
        int b = Integer.parseInt(month);
        int c = Integer.parseInt(year);
        LocalDate dt = LocalDate.of(c, b, a);
//        Calendar ca=Calendar.getInstance();
////        Date d1 = new Date(2000, 11, 21);
////        Date d2 = new Date();  // Current date
////        Date d3 = new Date(2010, 1, 3);
//       // Date date2= new Date();
//        String date =new String(day+"/"+month+"/"+year);
//        Date date2= new Date(date);
//       // Date(String date)
//        ca.setTime(date2);
//        int dayOfWeek = ca.get(Calendar.DAY_OF_WEEK);
//
//        switch(dayOfWeek){
//            case 1:
//                return "FRIDAY";
//            case 2:
//                return "SATURDAY";
//               // break;
//            case 3:
//                return "SUNDAY";
//               // break;
//            case 4:
//                return "MONDAY";
//               // break;
//            case 5:
//                return "TUESDAY";
//              //  break;
//            case 6:
//                return "WEDNESDAY";
//               // break;
//            case 7:
//                return "THURSDAY";
//              //  break;
//        }
        return dt.getDayOfWeek();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String month = in.next();
//        String day = in.next();
//        String year = in.next();
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        in.close();

        //System.out.println(getDay(day, month, year));
        LocalDate dt = LocalDate.of(year, month, day);
        System.out.print(dt.getDayOfWeek());
    }
}

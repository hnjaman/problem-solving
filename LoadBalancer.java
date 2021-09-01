import java.util.ArrayList;

class IpInfo {
    public String ip;
    public boolean status;

    public IpInfo(String s, boolean b) {
        this.ip = s;
        this.status = b;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

public class LoadBalancer {
    public static ArrayList<IpInfo> ipList = new ArrayList<>();

    public static String getForwardIp(){
        String ip = null;
        for(int i=0; i<ipList.size(); i++) {
            if (ipList.get(i).isStatus()){
                ip = ipList.get(i).getIp();
                ipList.get(i).setStatus(false);
                if(i==4){
                    ipList.get(0).setStatus(true);
                } else {
                    ipList.get(i + 1).setStatus(true);
                }
                break;
            }
        }
        return ip;
    }

    public static void main(String[] args) {
        ipList.add(new IpInfo("103.144.88.78", false));
        ipList.add(new IpInfo("103.144.88.79", false));
        ipList.add(new IpInfo("103.144.88.80", false));
        ipList.add(new IpInfo("103.144.88.81", false));
        ipList.add(new IpInfo("103.144.88.82", true));

        String ip = getForwardIp();
        System.out.println(ip);
        System.out.println(ipList.get(0).getIp()+"--"+ipList.get(0).isStatus());
        System.out.println(ipList.get(1).getIp()+"--"+ipList.get(1).isStatus());
        System.out.println(ipList.get(2).getIp()+"--"+ipList.get(2).isStatus());
        System.out.println(ipList.get(3).getIp()+"--"+ipList.get(3).isStatus());
        System.out.println(ipList.get(4).getIp()+"--"+ipList.get(4).isStatus());
    }
}
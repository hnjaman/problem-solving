
import java.util.Scanner;

public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        StringBuilder sf = new StringBuilder(first);
        StringBuilder ss = new StringBuilder(second);
        //System.out.println(sf);
       // System.out.println(ss);
        int count = 0;
        for(int i=0;i<sf.length();i++){
            for(int j = 0; j<ss.length();j++){
                if(sf.charAt(i)==ss.charAt(j)){
                    sf.deleteCharAt(i);
                    ss.deleteCharAt(j);
                    count=count+2;
                    break;
                }
            }
        }
        System.out.println(sf);
        System.out.println(ss);
        return sf.length()+ss.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

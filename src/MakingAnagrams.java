import java.util.Scanner;

public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
//        StringBuilder sf = new StringBuilder(first);
//        StringBuilder ss = new StringBuilder(second);
//        System.out.println(sf);
//        System.out.println(ss);
        int count = 0;
        for(int i=0;i<first.length();i++){
            for(int j = 0; j<second.length();j++){
                if(first.charAt(i)==second.charAt(j)){
                    count=count+2;
                }
            }
        }
        return first.length()+second.length()-count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

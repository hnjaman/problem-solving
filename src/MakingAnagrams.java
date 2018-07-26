
import java.util.Scanner;
/*  Input:  cde
*           abc
*
*   output: 4
*   # removed d,e,a,b this 4
* */
public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        StringBuilder sf = new StringBuilder(first);
        StringBuilder ss = new StringBuilder(second);

        int count = 0;
        for(int i=0;i<sf.length();i++){
            int j;
            for( j = 0; j<ss.length();j++){
                if(sf.charAt(i) == ss.charAt(j)){
                    sf.setCharAt(i,'0');
                    ss.setCharAt(j,'0');
                    count=count+2;
                    break;
                }
            }
        }
        return sf.length()+ss.length()-count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

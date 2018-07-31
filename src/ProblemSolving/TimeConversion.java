package ProblemSolving;

import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s) {
        StringBuilder result=new StringBuilder(s.substring(0,s.length()-2));
        //System.out.println(result);
        int h=Integer.parseInt(s.substring(0,2));
        //System.out.println(h);
        String ap=new String(s.substring(s.length()-2,s.length()));
       // System.out.println(ap);

        if(h<12 && ap.equals("PM")){
            h=h+12;
            result.replace(0,2,String.valueOf(h));
        }else if(h==12 && ap.equals("AM")){
            result.replace(0,2,"00");
        }

        String r=new String(result);


        System.out.println(result);

        return r;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
       // BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

//        bw.write(result);
//        bw.newLine();
//
//        bw.close();
    }
}

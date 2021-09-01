import java.util.Scanner;

public class StringInput {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your name");
        String name = in.next();
        System.out.println(name.length());
        char getchar = name.charAt(0);
        System.out.println("sorting.SelectionSort "+getchar+" Good morning");

        if(Character.isDigit(name.charAt(0))){
            System.out.println(" "+name.charAt(0)+" is Digit");
        }

//        for (int i=0;i<name.length();i++){
//            System.out.println(name.charAt(i));
//            for(int j=0;j<10;j++){
//                if(name.charAt(i)==j){
//                    System.out.println(" "+name.charAt(i)+" is Digit");
//                }
//            }
//        }

//        if(name.charAt(0)==name.charAt(name.length()-1) && name.charAt(1)==name.charAt(name.length()-2)){
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }
//        System.out.println("sorting.SelectionSort "+getchar+" Good morning");
    }
}

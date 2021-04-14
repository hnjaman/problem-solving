package code2021;

public class TestCode {
    public static void main(String[] args) {
        String str = "DEF";
//        String str2 = new String(str).intern();
        String str2 = new String("abc");
        System.out.println(str==str2);
//        System.out.println(str.compareTo("C"));
//        System.out.println(str.compareTo("BC"));
//        System.out.println(str.compareToIgnoreCase("abc"));
    }
}

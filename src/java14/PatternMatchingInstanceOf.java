package java14;

public class PatternMatchingInstanceOf {
    public static void main(String[] args) {
        String obj = "jdk14";
        if (obj instanceof String s) {      // instanceof, cast and bind variable in one line.
            if("jdk14".equalsIgnoreCase(s)){
                System.out.println("true");
            }
        }else {
            System.out.println("not a string");
        }
    }
}

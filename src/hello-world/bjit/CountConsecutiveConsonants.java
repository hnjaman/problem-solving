package bjit;

public class CountConsecutiveConsonants {
    public static void main(String[] args) {
        String in = "CountConsecutiveConsonants";

        int count = 0;
        int flag = 0;
        for (int i=0; i<in.length();i++){
            char c = in.charAt(i);
            String s = new String(String.valueOf(c));
            if(s.equalsIgnoreCase("a")
            || s.equalsIgnoreCase("e")
            || s.equalsIgnoreCase("i")
            || s.equalsIgnoreCase("o")
            || s.equalsIgnoreCase("u")){
                flag=0;
            }else {
                flag++;
            }

            if (flag>=3){
                count++;
            }
        }
        System.out.println(count);
    }
}

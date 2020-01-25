package bjit;

public class DigitCount {
    public static void main(String[] args) {
        int a[] ={0,0,0,0,0,0,0,0,0,0}; //new int[10];
        String input = "ssdffgg0123fgghh235";
        String digit= input.replaceAll("\\D+","");
       // System.out.println(input.length());
        for(int i=0; i<=9; i++){
            char n = (char) i;
            for(int j=0; j<digit.length(); j++){
                char c = digit.charAt(j);
                if(c==n){
                    a[i]=a[i]+1;
                }
            }
        }

        for (int i = 0; i <a.length ; i++) {
            System.out.println(i+" -> "+a[i]);
        }
    }
}

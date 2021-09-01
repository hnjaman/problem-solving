package recursion;

public class OneTo100Sum {

    public static int sum(int m){
        int result=0;
        if(m<=5){
            result=m+sum(m+1);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(1));
    }
}

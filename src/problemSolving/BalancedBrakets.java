package problemSolving;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrakets {
    private static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        char[] chars = exp.toCharArray();
        for (char achar : chars){
            if(stack.empty()){
                stack.push(achar);
            }else {
                char peek = stack.peek();
                if(peek=='(' && achar == ')'){
                    stack.pop();
                }else if(peek == '{' && achar == '}'){
                    stack.pop();
                }else if(peek == '[' && achar == ']'){
                    stack.pop();
                }else {
                    stack.push(achar);
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // String[] brackets = {"(()){}()","({})","({}(","){})"};
        int lim = in.nextInt();
        int i=1;
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(i<=lim){
            String brackets = in.nextLine();
            String isBalanced = isBalanced(brackets) ? "YES" : "NO";
            System.out.println(isBalanced);
            //}
            i++;
        }

    }
}

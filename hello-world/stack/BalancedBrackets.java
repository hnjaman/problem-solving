package stack;

import java.util.Stack;

public class BalancedBrackets {

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
        String[] brackets = {"(()){}()","({})","({}(","){})"};
        for(String exp : brackets){
            String isBalanced = isBalanced(exp) ? "Balanced" : "Not Balanced";
            System.out.println(exp + " Is "+ isBalanced);
        }
    }
}

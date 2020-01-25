package collectionframework;

import java.util.Stack;

public class StackBalancedBrachets {


    public static boolean isBalanced( String expression) {
        Stack<Character> stack = new Stack<>();
        char[] chars = expression.toCharArray();
        for (char aChar : chars){
            if(stack.empty()){
                stack.push(aChar);
            }else {
                char peek = stack.peek();
                if(peek=='(' && aChar == ')'){
                    stack.pop();
                } else if(peek=='{' && aChar == '}'){
                    stack.pop();
                } else if(peek=='[' && aChar == ']'){
                    stack.pop();
                }else{
                    stack.push(aChar);
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String[] brachets = {"(()){}()","({})","({}(","){})"};

        for( String exp : brachets){
            String isBalanced = isBalanced(exp) ? "Balanced" : "Not Balanced";
            System.out.println(exp + " is " + isBalanced);
        }
    }
}

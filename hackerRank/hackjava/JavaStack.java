package hackerRank.hackjava;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    private static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        char[] chars = exp.toCharArray();
        for (char achar : chars) {
            if (stack.empty()) {
                stack.push(achar);
            } else {
                char peek = stack.peek();
                if (peek == '(' && achar == ')') {
                    stack.pop();
                } else if (peek == '{' && achar == '}') {
                    stack.pop();
                } else if (peek == '[' && achar == ']') {
                    stack.pop();
                } else {
                    stack.push(achar);
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String[] brackets = {"(()){}()","({})","({}(","){})"};

        while (in.hasNext()) {
            String brackets = in.nextLine();
            // for(String exp : brackets){
            String isBalanced = isBalanced(brackets) ? "true" : "false";
            System.out.println(isBalanced);
            //}
        }

    }
}


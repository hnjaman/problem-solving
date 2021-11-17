package leetcode;

import java.util.Stack;

// 20. Valid Parentheses

public class BalanceBrackets {
    public static void main(String[] args) {
        String brackets = "{()}";
        System.out.println(checkBalanceBrackets(brackets.toCharArray()));
    }

    private static boolean checkBalanceBrackets(char[] charBrackets) {
        if (charBrackets.length == 0)
            return true;
        Stack<Character> stackBrackets = new Stack<>();
        for (char c : charBrackets) {
            if (stackBrackets.empty()) {
                stackBrackets.push(c);
            } else {
                char peek = stackBrackets.peek();
                if ((peek == '{' && c == '}') || (peek == '(' && c == ')' || (peek == '[' && c == ']'))) {
                    stackBrackets.pop();
                } else {
                    stackBrackets.push(c);
                }
            }
        }
        return stackBrackets.empty();
    }
}

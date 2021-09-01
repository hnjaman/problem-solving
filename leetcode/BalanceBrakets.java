package leetcode;

import java.util.Stack;

public class BalanceBrakets {
    public static void main(String[] args) {
        String brakets = "{()}";
        System.out.println(checkBalanceBrakets(brakets.toCharArray()));
    }

    private static boolean checkBalanceBrakets(char[] charBrakets) {
        if (charBrakets.length == 0)
            return true;
        Stack<Character> stackBrakets = new Stack<>();
        for (char c : charBrakets) {
            if (stackBrakets.empty()) {
                stackBrakets.push(c);
            } else {
                char peek = stackBrakets.peek();
                if ((peek == '{' && c == '}') || (peek == '(' && c == ')' || (peek == '[' && c == ']'))) {
                    stackBrakets.pop();
                } else {
                    stackBrakets.push(c);
                }
            }
        }
        return stackBrakets.empty() ? true : false;
    }
}

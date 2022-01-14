package code2022.zalandoCodility;

import java.util.Stack;

/**
 * Created by Lenovo on 14/01/2022.
 */
public class StackStringOperation {
    public static int solution(String S) {
        String[] operations = S.split("\\s");
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            Integer input;
            switch (operations[i]) {
                case "DUP":
                    if (stack.isEmpty())
                        return -1;
                    stack.push(stack.peek());
                    break;
                case "POP":
                    if (stack.isEmpty())
                        return -1;
                    stack.pop();
                    break;
                case "+":
                    if (stack.size() < 1)
                        return -1;
                    input = 0;
                    input += stack.pop();
                    input += stack.pop();
                    stack.push(input);
                    break;
                case "-":
                    if (stack.size() < 2)
                        return -1;
                    input = stack.pop();
                    input -= stack.pop();
                    stack.push(input);
                    break;
                default:
                    stack.push(Integer.parseInt(operations[i]));
                    break;
            }
        }

        if (stack.size() < 1)
            return -1;
        else
            return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println("13 DUP 4 POP 5 DUP + DUP + - ||| " +solution("13 DUP 4 POP 5 DUP + DUP + -"));     // 7
        System.out.println("5 6 + - | " + solution("5 6 + -"));
        System.out.println("4 5 6 - 7 + | " + solution("4 5 6 - 7 +"));    // 8
        System.out.println("3 DUP 5 - - | " + solution("3 DUP 5 - -"));    // -1
        System.out.println("1048575 DUP + | " + solution("1048575 DUP +"));    // -1
    }
}

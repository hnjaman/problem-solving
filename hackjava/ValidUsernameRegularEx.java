package hackjava;

import java.util.Scanner;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    //public static final String regularExpression = "[^0-9_?][a-zA-Z0-9[_]]{7,29}";
    public static final String regularExpression = "[a-zA-Z][a-zA-Z0-9[_]]{7,29}";
}


public class ValidUsernameRegularEx {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

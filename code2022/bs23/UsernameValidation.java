package code2022.bs23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//      length 4 or up
//      no number or _ in beginning
//      no _ at ending
//      _ not more than once

public class UsernameValidation {
    public static boolean validate(String username) {
        if (username.length() >= 4) {
// https://stackoverflow.com/questions/60068785/regex-to-username-that-contains-alphanumeric-characters-and-at-most-one-undersco

//      "^(?![0-9])(?![_])[a-zA-Z0-9_]+(?<![_])$"
//      supports multiple underscore

//      ^(?![0-9])(?![_])[a-zA-Z0-9]*_?[a-zA-Z0-9]+(?<![_])$
//      support only one _

            String regex = "^(?![0-9])(?![_])[a-zA-Z0-9]*_?[a-zA-Z0-9]+(?<![_])$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(username);
            return m.matches();
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(validate("Hasan Jaman"));
        System.out.println(validate("Hasan_Jaman"));
        System.out.println(validate("Hasan_J_aman"));
        System.out.println(validate("Hasan__Jaman"));
    }
}

package code2021;

/**
 * Created by USER on 28-Apr-21.
 */
public class StrongPassword {
    public static void main(String[] args) {

//        ^ represents the starting of the string.
//        (?=.*[a-z]) represent at least one lowercase character.
//        (?=.*[A-Z]) represents at least one uppercase character.
//        (?=.*\\d) represents at least one numeric value.
//        (?=.*[-+_!@#$%^&*., ?]) represents at least one special character.
//        . represents any character except line break.
//        + represents one or more times.

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-+_!@#$%^&*., ?]).+$";
        String str = "#HackerRank";
        System.out.println(str.matches("^(?=.*\\d).+$"));
        System.out.println(str.matches("^(?=.*[A-Z]).+$"));
        System.out.println(str.matches("^(?=.*[a-z]).+$"));
        System.out.println(str.matches("^(?=.*[!@#$%^&*()-+]).+$"));
        int counter = 0;
//        if(!str.matches("^(?=.*\\d).+$"))
//            counter++;
//        if(!str.matches("^(?=.*[A-Z]).+$"))
//            counter++;
//        if(!str.matches("^(?=.*[a-z]).+$"))
//            counter++;
//        if(!str.matches("^(?=.*[!@#$%^&*()-+]).+$"))
//            counter++;

        if (!str.chars().anyMatch(Character::isDigit)) {
            counter++;
        }
        if (!str.chars().anyMatch(Character::isLowerCase)) {
            counter++;
        }
        if (!str.chars().anyMatch(Character::isUpperCase)) {
            counter++;
        }
        if (!str.chars().anyMatch(ch -> "!@#$%^&*()-+".indexOf((char) ch) >= 0)) {
            counter++;
        }
        counter = Math.max(counter, 6 - str.length());

        System.out.println(counter);
    }
}

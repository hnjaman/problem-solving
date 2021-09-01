import java.util.regex.Pattern;

class Regex3 {
    public static void main(String args[]) {
        System.out.println(Pattern.matches("[^amn]", "dbc"));//false (not a or m or n)
        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
        System.out.println(Pattern.matches("[amn]", "na"));//false (m and a comes more than once)
    }
}
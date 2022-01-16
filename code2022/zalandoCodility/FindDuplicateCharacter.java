package code2022.zalandoCodility;

//input -> hello
//output -> l
//
//input -> heoaa
//output -> a
//
//input -> heooaa
//output -> a

public class FindDuplicateCharacter {
    public static String solution(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }

        char targetChar = 'a';      // initially 'a'
        int  mostOccurrences  = 0;

        for (int i = 0; i < 26; i++) {
            if (occurrences[i] > mostOccurrences) {
                targetChar = (char)((int)'a' + i);
                mostOccurrences  = occurrences[i];
            }
        }

        return Character.toString(targetChar);
    }

    public static void main(String[] args) {
        System.out.println(solution("heooaa"));
    }
}

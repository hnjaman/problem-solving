package code2022;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Lenovo on 13/01/2022.
 */
public class ValidAnagram_242 {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Integer> characterMap = new HashMap<>();
        for(char c : s.toCharArray()){
            characterMap.put(c,characterMap.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            if(!characterMap.containsKey(c) || characterMap.get(c) < 1)
                return false;
            characterMap.put(c, characterMap.get(c)-1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("aacc","caac"));
    }
}

package code2022.toptal;

/**
 * input: Codility we test coders,   14
 * output: Codility we
 * */

public class CropStringFromString {
    public static String solution(String message, int k){
        StringBuilder stringBuilder;
        String[] strings = message.split(" ");
        if(strings.length > 0){
            if(strings[0].length() <= k){
                stringBuilder = new StringBuilder(strings[0]);
                for(int i = 1; i<strings.length; i++){
                    if(stringBuilder.length() + strings[i].length() + 1 <= k){
                        stringBuilder.append(" "+strings[i]);
                    } else {
                        return stringBuilder.toString();
                    }
                }
                return stringBuilder.toString();
            }
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(solution("Codility we test coders", 14));
    }
}

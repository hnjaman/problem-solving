package code2022.bigvikings;

public class AvgMarksFromString {
    public static String solution(String[] students){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<students.length; i++){
            String[] strings = students[i].split(" ");
            result.append(strings[0]+" "+strings[1]);
            int sum = 0;
            int count = 0;
            for(int j=2; j<strings.length; j++){
                if(Integer.parseInt(strings[j]) <= 10){
                    sum = sum + Integer.parseInt(strings[j]);
                    count++;
                }
            }
            result.append("-"+sum/count+";");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] string = {"abc asd 5 5 6","xyz xcv 6 7 8"};
        System.out.println(solution(string));
        // output : abc asd-5;xyz xcv-7;
    }
}

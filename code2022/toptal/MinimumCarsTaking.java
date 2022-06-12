package code2022.toptal;

import java.util.Arrays;

public class MinimumCarsTaking {

    public static int solution(int[] persons, int[] seats){
        int extraSeat = Arrays.stream(seats).sum() - Arrays.stream(persons).sum();
        int count=0;
        Arrays.sort(persons);

        for (int i=0; i<persons.length; i++) {
            if(extraSeat-persons[i] >= 0){
                extraSeat = extraSeat - persons[i];
                count++;
            }
        }
        return seats.length == count ? 1 : seats.length - count;
    }

    public static void main(String[] args) {
        int[] persons = {2,3,4,2};
        int[] seats = {2,5,7,2};
        System.out.println(solution(persons, seats));
    }
}

package turing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// In this question, the candidate with the highest number of votes wins
// If two or more candidates have the same number of votes, then the
// candidate whose name appears last alphabetically, wins.
// Consider the following votes : ['Glenn', 'Emily', 'Emily', 'Glenn'].
// Each candidate received 2 votes but Glenn comes later alphabetically
// than Emily, so return Glenn.
// public static String voteWinner(String[] votes);
// function voteWinner should return a string with the name of the winner.

public class VoteCount {
    public static String voteWinner(String[] votes) {

        Map<String, Integer> m1 = new HashMap<>();

        for (String s: votes) {
            if(!m1.containsKey(s)){
                m1.put(s,1);
            }else{
                int count = m1.containsKey(s) ? m1.get(s) : 0;
                m1.put(s, count + 1);
            }
        }

        Map.Entry<String,Integer> max = null;
        for (Map.Entry<String, Integer> m : m1.entrySet()) {
            if(max == null ||( m.getValue().compareTo(max.getValue())>0
                    || m.getKey().toString().compareToIgnoreCase(max.getKey().toString())>0)){
                max=m;
            }
        }

//        System.out.println(m1);
//        System.out.println(max);
        return max.getKey();
    }
    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        int votesCount = reader.nextInt();
//        reader.next();
        String[] votes = {"Glenn","Emily","Emily","Glenn"};
//        for (int i = 0; i < votesCount; i++) {
//            String votesItem = reader.nextLine();
//            votes[i] = votesItem;
//        }


        System.out.println(voteWinner(votes));
    }
}

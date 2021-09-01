package code2021;

import java.util.Arrays;

public class TestCode {
    public static void main(String[] args) {
        System.out.println("Hi");

        int[] intArray = {1,2};
//        int[] intArray = new int[5];

        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
        System.out.println("-----------------");
        for(int element: intArray){
            System.out.println(element);
        }

        System.out.println("Arrays - "+Arrays.binarySearch(intArray, 1));
        Arrays.sort(intArray);

        System.out.println("--------s---------");

        String[] strings = {"hi","bye"};
        Arrays.sort(strings);
//        String[] strings = new String[5];
        for(int i=0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
        System.out.println("-----------------");
        for(String element: strings){
            System.out.println(element);
        }

        System.out.println("--------bool---------");
        boolean[] booleans = new boolean[5];

        for(int i=0; i<booleans.length; i++){
            System.out.println(booleans[i]);
        }
        System.out.println("-----------------");
        for(boolean element: booleans){
            System.out.println(element);
        }
    }
}

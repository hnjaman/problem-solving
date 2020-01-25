package crossover;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DecimalBinarySort {

    /**
     * Complete the function below.
     * DONOT MODIFY anything outside this function!
     */
    static int[] rearrange(String[] elements) {
        for (int i = 0; i < elements.length - 1; i++)
        {
            int index = i;

            for (int j = i + 1; j < elements.length; j++){
                int count1=0;
                int count2=0;
                ArrayList<Integer> zlist1=new ArrayList<Integer>();
                ArrayList<Integer> zlist2=new ArrayList<Integer>();
                zlist1.clear();
                zlist2.clear();

                for(int k=0;k<elements[index].length();k++){
                    if(elements[index].charAt(k)=='1'){
                        count1++;
                    }

                    if(elements[index].charAt(k)=='0'){
                        zlist1.add(k);
                    }
                    //System.out.println(zlist1);
                }
                for(int l=0;l<elements[j].length();l++){
                    if(elements[j].charAt(l)=='1'){
                        count2++;
                    }
                    if(elements[j].charAt(l)=='0'){
                        zlist2.add(l);
                    }
                    //System.out.println(zlist2);
                }

                //int z1=;
                //int z2=;

                //System.out.println(z1);
                //System.out.println(z2);

                if(count2==count1 && elements[j].length() == elements[index].length()){
                    if(zlist2.get(0)<zlist1.get(0)){
                        index = j;
                    }
                }else if(count2==count1 && elements[j].length() < elements[index].length()){
                    index = j;
                }
                else if (count2 < count1){
                    index = j;//searching for lowest index
                }
            }

            String smallerNumber = elements[index];
            elements[index] = elements[i];
            elements[i] = smallerNumber;
        }
        Integer value=0;
        int[] result = new int[elements.length];
        for(int i=0;i<elements.length;i++){
            value = Integer.parseInt(elements[i],2);
            //System.out.println(value);
            result[i]=value;
        }
        return result;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n = 0;
        n = Integer.parseInt(in.nextLine().trim());
        String[] elements = new String[n];
        String element;
        for (int i = 0; i < n; i++) {
            element = Integer.toBinaryString(in.nextInt());
            elements[i] = element;
        }

        // call rearrange function
        int[] results = rearrange(elements);

        for (int i = 0; i < elements.length; i++) {
            //System.out.println(String.valueOf(results[i]));
            System.out.println(results[i]);
        }
    }
}
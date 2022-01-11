package code2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Lenovo on 1/10/2022.
 */

//1
//11
//121
//1331


public class PascalsTriangle_118 {

    public static List<List<Integer>> generate(int numRows) {   // 3
        List<List<Integer>> triangles = new ArrayList<>();
        List<Integer> prev = null;
        for(int i=0; i<numRows; i++){   // 0,1,2,3
            List<Integer> triangle = new ArrayList<>(i+1);  // 1, 2,3
            for(int k=0; k<i+1; k++){       // k=0,1,2 0,1,2<3
                if(k==0 || k==i){   // k=2
                    triangle.add(1);
                } else {
                    triangle.add(prev.get(k-1)+prev.get(k));
                }
            }
            triangles.add(triangle);
            prev = triangle;
        }
        return triangles;
    }

    public static void main(String[] args) {
        System.out.println(generate(4));
    }
}

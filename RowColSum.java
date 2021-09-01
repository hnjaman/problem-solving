//package com.hnj.unittesting.unittesting;

import java.util.ArrayList;

public class RowColSum {
    public static void main(String[] args) {
        int rows, cols, sumRow, sumCol;

        int[][] array = {{1,2,3},
                         {4,5,6}
                        };

        rows = array.length;
        cols = array[0].length;

        ArrayList<Integer> colList = new ArrayList<>(3);
        boolean colInsert = true;

        for(int i = 0; i < rows; i++){
            sumRow = 0;
            for(int j = 0; j < cols; j++){
                sumRow = sumRow + array[i][j];
                if(colInsert){
                    colList.add(array[i][j]);
                } else {
                    colList.set(j, colList.get(j)+array[i][j]);
                }
            }
            colInsert = false;
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);
        }

        for(Integer i : colList){
            System.out.println("Sum of "+colList.indexOf(i)+" col "+ i);
        }
    }
}

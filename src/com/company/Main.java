package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//       int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
      //  int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        int[][] matrix = {{7,8},{1,2}};

        List<Integer> luckynumbers = new ArrayList<>();

        for (int i = 0; i <matrix.length ; i++) {
            int rmin=matrix[i][0];
            int cj=0;
            for (int j = 1; j <matrix[0].length ; j++) {
                if (matrix[i][j] < rmin) {
                    rmin = matrix[i][j];
                    cj=j;
                }
            }

            boolean lucky=true;
            for (int j = 0; j <matrix.length ; j++) {
                if (matrix[j][cj] > rmin) {
                    lucky=false;
                    break;
                }
            }
            if (lucky) {
                luckynumbers.add(rmin);
            }
        }
        for (int a:luckynumbers ) {
            System.out.println(a);
        }
    }
}

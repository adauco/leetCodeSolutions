package AlanCode;

/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
Given a 2D matrix,
find the sum of the elements inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

Matrix = [
  [1, 2, 0, 0, 1],
  [0, 3, 1, 3, 2],
  [0, 3, 1, 3, 2],
  [1, 2, 3, 1, 4],
]
 */

class Alan2 {
    int[][] matrix = {
            {1, 2, 0, 0, 1},
            {0, 3, 1, 3, 2},
            {0, 3, 1, 3, 2},
            {1, 2, 3, 1, 4},
    };
    int[][] cache = null;

    public int sumSubRectangle(int row1, int col1, int row2, int col2) {
        int suma = 0;
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                suma += matrix[i][j];
            }
        }
        System.out.println(suma);
        return suma;
    }

    public void fillCache(){
        int r = matrix.length;
        int c = matrix[0].length;

        cache = new int[r][c];
        cache[0][0] = matrix[0][0];
        for (int i = 1; i < r; i++) {
            cache[i][0] = matrix[i][0] + cache[i-1][0];
        }
        for (int j = 1; j < c; j++) {
            cache[0][j] = matrix[0][j] + cache[0][j-1];
        }

        for(int i = 1; i< r; i++){
            for(int j =1; j < c; j++){
                cache[i][j] = matrix[i][j] +
                        cache[i-1][j] + cache[i][j-1] - cache[i-1][j-1];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(cache[i][j] + " ");
            System.out.println();
        }
    }

    public int getSum(int row1, int col1, int row2, int col2){
        int left=0, up=0, root=0;
        if(row1!=0)
            left = cache[row1-1][col2];
        if(col1 != 0)
            up = cache[row2][col1-1];
        if(col1 != 0 && row1 != 0)
            root = cache[row1-1][col1-1];

        int sum = cache[row2][col2] - left - up + root;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Alan2 al = new Alan2();
        al.fillCache();
        //al.sumSubRectangle(1,1,2,3);
        al.getSum(1,1,2,3);
        al.getSum(1,1,3,2);
        al.getSum(0,0,3,2);
        al.getSum(1,0,3,2);
        al.getSum(0,1,3,2);
        al.getSum(0,0,3,4);





    }
}



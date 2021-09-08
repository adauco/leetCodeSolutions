package apple;

import java.util.Arrays;

public class SubrectangleQueries {

    static int rec[][];

    public SubrectangleQueries(int[][] rectangle) {
        this.rec = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i= row1; i <= row2; i ++) {
            for(int j = col1; j <= col2; j++) {
                this.rec[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rec[row][col];
    }

    public void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int [][] rec2 = {{1,2,1},{4,3,4},{3,2,1},{1,1,1}};
        int [][] rec3 = {{1,1,1},{2,2,2},{3,3,3}};
        int [][] rec4 = {{0,3,0},{1,2,2},{0,3,3}};


        SubrectangleQueries sub = new SubrectangleQueries(rec2);
        System.out.println(sub.getValue(0,2));

        sub.printArray(rec);
        sub.updateSubrectangle(0,0,2,2,99);

        System.out.println(sub.getValue(0,2));
        sub.printArray(rec);
    }
}

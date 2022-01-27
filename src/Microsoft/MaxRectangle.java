package Microsoft;

public class MaxRectangle {

    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        int tempArea = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j]== '1'){
                    //do something
                    tempArea++;
                    maxArea = Math.max(tempArea,maxArea);
                    matrix[i][j] = '0';
                }
            }
        }
        System.out.println(maxArea);
        printMatrix(matrix);
        return maxArea;
    }

    void printMatrix(char[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }


    public static void main (String[] args) {
        char[][] rectangle = {{'1','0','1','0','0'},
                              {'1','0','1','1','1'},
                              {'1','1','1','1','1'},
                              {'1','0','0','1','0'}};
        MaxRectangle sol = new MaxRectangle();
        sol.printMatrix(rectangle);
        sol.maximalRectangle(rectangle);
    }
}

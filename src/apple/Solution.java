package apple;

class Solution {
    static  int[][] matrix;

    public static void populateMatrix(int[][] data) {
        matrix = new int[data.length][data[0].length];
        for(int i =0; i < data.length; i++) {
            for(int j =0; j < data[0].length; j++) {
                matrix[i][j] = data[i][j];
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for(int i =0; i < matrix.length; i++) {
            for(int j =0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Solution sol = new Solution();
        int[][] send = {{2,2},{55,4},{75,76}};
        sol.populateMatrix(send);
        sol.printMatrix(matrix);

    }
}



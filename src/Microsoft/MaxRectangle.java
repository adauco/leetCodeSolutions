package Microsoft;

public class MaxRectangle {


    public int sizeRectangle(char[][] matrix, int x, int y){
        int x2 = x;
        int y2 = y;
        int tempMax = 0;
        int yLength = matrix[0].length;
        //System.out.println("Inicio matrix "+ x + " " + y);
        while(x2 < matrix.length && matrix[x2][y2]=='1'){
            while(y2 < yLength && matrix[x2][y2]=='1'){
                y2++;
                tempMax++;
            }

            x2++;
            yLength = y2;

            if(y2 < yLength) {
                tempMax = tempMax - y2;
            }
            y2 = y;
        }
        //System.out.println("ISLAS " + tempMax);
        return tempMax;
    }

    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        int tempArea = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j]== '1'){
                    tempArea = sizeRectangle(matrix, i, j);
                    maxArea = Math.max(tempArea,maxArea);
                    //matrix[i][j] = '0';
                }
            }
        }
        System.out.println("Area Maxima " + maxArea);
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
        char[][] matrix3 = {{'1','1','1','1','1','1','1','1'},
                            {'1','1','1','1','1','1','1','0'},
                            {'1','1','1','1','1','1','1','0'},
                            {'1','1','1','1','1','0','0','0'},
                            {'0','1','1','1','1','0','0','0'}};

        char[][] matrix = {{'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}};
        char[][] matrix2 = {{'0'}};
        char[][] matrix1 = {{'1'}};

        MaxRectangle sol = new MaxRectangle();

        sol.maximalRectangle(matrix3);

     /*   sol.maximalRectangle(matrix);
        sol.maximalRectangle(matrix1);
        sol.maximalRectangle(matrix2);*/
    }
}

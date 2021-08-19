package data_structure;
//Una matris girada 90 grados
//Input: matrix = [[1,2,3, 4],
//                 [5,6,7, 8],
//                 [9,10,11,12]
//                 [13,14,15,16]]
//Output: [[13,9,5,1],
//         [14,10,6,2],
//         [15,11,7,3]
//         [16,12,8,4]]
// int[][] array voltear 90 grados a la derecha
// Siempre va a ser N * N
// preguntar lo que no entiendo, me hace ver inteligente
// puede tener null? limites inferior superior?
/*
SOLUTION
go a double for to go through the elements in the matrix
Create a second array to store the rotated array
Program will move row to a column, ie, row 0 will be last column,
    colum number will be row number newpos[j][length - 1 - i] = oldpos[i][j]
    and row will be the length of row less the row number you are moving
 */
public class RotateMatrix {

    int[][] turn90(int[][] array) {
        if(array == null)
            return null;
        if(array.length <= 1)
            return array;
        int n = array.length;
        int[][] array2 = new int[n][n];

        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j++) {
                array2[j][n - 1 - i] = array[i][j];
            }
        }
        return array2;
    }// O(N), O(N)

    public static void main(String[] args) {
       int[][] Output= {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
       RotateMatrix ma = new RotateMatrix();
       ma.turn90(Output);
       System.out.println(ma.turn90(Output));
    }
}

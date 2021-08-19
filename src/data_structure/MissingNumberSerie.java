package data_structure;
/*
Function to find the missing number in an array of N-1 elements, where the numbers go from 1 to N.

Input: integer array[N-1], where N is the max number for the serie
       integer N
Output: missing number Integer
Edge Cases:
if entry null, return null
if array size == 0 return 0
if array size == 1 means N is 2, so it can miss 1 or 2
All elements are valid integers from 1 to N
Content it not ordered
Always 1 element will be missing, and only one
SOLUTION:
Sum elements of array, sum elements from 1 to N,
The difference between both is the missing number.
*/

public class MissingNumberSerie {

    public int findMissingNumber(int[] array) {
        int sumN = 0;
        int sumArray = 0;
        int n = array.length +1;
        for(int i = 1; i <= n; i++) {
            sumN += i;
        }
        for(int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }
        return sumN - sumArray;
    }//O(N) complexity, O(1) space

    public static void main(String[] args) {
        int[] array = {4,3,2,5};
        MissingNumberSerie te = new MissingNumberSerie();
        te.findMissingNumber(array);
    }
}

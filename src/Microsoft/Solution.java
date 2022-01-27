package Microsoft;

public class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length+1];
        int j=0;
        result[0] = first;

        for(int i = 1; i < encoded.length + 1; i++) {
            result[i] = result[i-1] ^ encoded[i-1];
        }
        printResult(result);
        return result;
    }

    public void printResult(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Solution sol = new Solution();
        int [] encoded = {1,2,3};
        sol.decode(encoded, 1);


    }
}

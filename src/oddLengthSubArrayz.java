public class oddLengthSubArrayz {

    public static int sumOddLengthSubarrays2(int[] A) {
        int res = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            res += ((i + 1) * (n - i) + 1) / 2 * A[i];
        }
        return res;
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int ans = 0, n = arr.length;
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j <= n; j += 2) {
                ans += prefixSum[j] - prefixSum[i];
            }
        }
        return ans;
    }

    private static int subarraySum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    result += arr[k];
                }
            }
        }
        return result;
    }
    public static void main (String args[]) {
        int[] deck = {1,3,7};
       // System.out.println("Juan " + sumOddLengthSubarrays2(deck));
       // System.out.println("Juan " + sumOddLengthSubarrays(deck));
        System.out.println("Juan " + subarraySum(deck));



    }
}

package apple;

import java.util.Arrays;

public class palindromeNumber {

    public boolean isPalindrome(int x) {
        return new StringBuilder().append(x).reverse().toString().equals(String.valueOf(x));
    }

    public boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }

    public static void main (String args[]) {
        palindromeNumber sol = new palindromeNumber();
       /* System.out.println("is it?  " + sol.isPalindrome(1222332221));
        System.out.println("is it?  " + sol.isPalindrome(-222));
        System.out.println("is it?  " + sol.isPalindrome(21212));
        System.out.println("is it?  " + sol.isPalindrome(9991110));
        System.out.println("is it?  " + sol.isPalindrome2(2929292));*/
       int[] array = {1,2,2,1};
        System.out.println(Arrays.toString(sol.getConcatenation(array)));
    }
}

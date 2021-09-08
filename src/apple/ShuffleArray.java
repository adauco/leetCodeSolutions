package apple;

import java.util.Arrays;

public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length/2; i++){
            ans[i*2] = nums[i];
            ans[i*2+1] = nums[i+n];
        }
        return ans;
    }
    public static void main(String args[]) {
      ShuffleArray shu = new ShuffleArray();
      System.out.println(Arrays.toString(shu.shuffle(new int[]{2,5,1,3,4,7},  3)));
    }
}

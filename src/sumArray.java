import java.util.Arrays;

public class sumArray {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            result[i] = nums[i] + result[i-1];
        }
        return result;
    }

    public static void main(String args[]) {
        int[] nums = {9,0,0,0,0,3,4,55,4,3,33,44,5,6,77565,3,-77734};
        System.out.println(Arrays.toString(runningSum(nums)));

    }
}

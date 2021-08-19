package data_structure;
/* LEET CODE
Given an integer array nums, find the contiguous subarray (containing at least one number)
which has the largest sum and return its sum.

SOLUTION
declare max and current Sum to 0
Do a for loop,
     if current array[i] < than array[i] +  currentTotal, this to identify if current element on array, gets smaller with previous sum
     if is not smaller, then new current sum = curr + array[i]
     if smaller, then currentSum = array[i]
     Then compare with max value so far
 */
public class MaxSubString {
     public int crossSum(int[] nums, int left, int right, int mid) {
            if (left == right)
                return nums[left];

            int leftSubsum = Integer.MIN_VALUE;
            int currSum = 0;
            for(int i = mid; i > left - 1; --i) {
                currSum += nums[i];
                leftSubsum = Math.max(leftSubsum, currSum);
            }

            int rightSubsum = Integer.MIN_VALUE;
            currSum = 0;
            for(int i = mid + 1; i < right + 1; ++i) {
                currSum += nums[i];
                rightSubsum = Math.max(rightSubsum, currSum);
            }

            return leftSubsum + rightSubsum;
        }

        public int helper(int[] nums, int left, int right) {
            if (left == right)
                return nums[left];

            int mid = (left + right) / 2;

            int leftSum = helper(nums, left, mid);
            int rightSum = helper(nums, mid + 1, right);
            int crossSum = crossSum(nums, left, right, mid);

            return Math.max(Math.max(leftSum, rightSum), crossSum);
        }

        public int maxSubArray(int[] nums) {
            return helper(nums, 0, nums.length - 1);
        }

        public int maxSubArray2(int[] nums) {
            int n = nums.length;
            int currSum = nums[0], maxSum = nums[0];

            for(int i = 1; i < n; ++i) {
                currSum = Math.max(nums[i], currSum + nums[i]);
                maxSum = Math.max(maxSum, currSum);
            }
            return maxSum;
        }

        //My solution, brute force
        public int maxArrayME(int[] array) {
         int max = array[0];
         int curr = array[0];

         for(int i = 1; i < array.length; i++) {
             if(array[i] < curr + array[i])
                 curr = curr + array[i];
             else
                 curr = array[i];
             if(curr > max)
             max = curr;

         }
         return max;
         //Big O (n), because it depends on the size of the array
        }

    public static void main(String args[]) {
         MaxSubString m = new MaxSubString();
         int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
       // System.out.println("FIN " + m.maxSubArray(nums));
        System.out.println("EL DE LA PAGINA " + m.maxSubArray2(nums));
        System.out.println("CURRENT ME " + m.maxArrayME(nums));


    }
    }


import java.util.ArrayList;

public class findSum {

    private static int[] findSum(int[] nums, int target)
    {
        int[] result = new int[2];
        if (nums.length >=1)
        {
            System.out.print("Array size less than 2");
            return result;
        }
        for (int i=0; i< nums.length-1; i++)
        {
            int numA = nums[i];
            for(int j=i+1;j< nums.length; j++ )
            {
                int numB = nums[j];
                if((numA + numB) == target)
                {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}

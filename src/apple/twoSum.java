package apple;

import java.util.HashMap;

public class twoSum {

    public int[] twoSumApple(int[] nums, int target) {
        int[] ans = {0,0};
        for(int i=0; i<nums.length-1; i++){
            int result = target - nums[i];
            ans[0] = i;
            for(int j=i+1; j < nums.length; j++){
                if(nums[j]==result) {
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return null;
    }

    public int[] twoSumApp(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int resta = target-nums[i];
            if(map.containsKey(resta)) {
                return new int[] {map.get(resta),i};
            } else {
                map.put(nums[i],i);
            }
        }
        return null;
    }

    public static void main(String args[]){
        twoSum dos = new twoSum();
        int[] nums = {2,24,5,6,3,4,66};
        int target = 29;
       // int[] ans = dos.twoSumApple(nums,target);
        int[] ans2 = dos.twoSumApp(nums,target);

        //System.out.println("SUMA " + ans[0] + " " + ans[1]);
        System.out.println("SUMa " + ans2[0] + " " + ans2[1]);
        ans2 = dos.twoSumApp(nums,11);
        System.out.println("SUMA " + ans2[0] + " " + ans2[1]);
        ans2 = dos.twoSumApp(nums,71);
        System.out.println("SUMA " + ans2[0] + " " + ans2[1]);
    }
}

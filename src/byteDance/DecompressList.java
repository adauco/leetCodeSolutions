package byteDance;

import java.util.Arrays;

public class DecompressList {
    public int[] decompressRLElist(int[] nums) {
        int[] res; int count = 0;
        for(int i = 0; i < nums.length; i=i+2) {
            count = count + nums[i];
        }
        res = new int[count];
        int index = 0;
        for(int i = 0; i < nums.length; i+=2){
            for(int j = 0; j < nums[i]; j++) {
                res[index++]=nums[i+1];
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        DecompressList is = new DecompressList();
        is.decompressRLElist( new int[]{1,2,3,4});
        is.decompressRLElist( new int[]{1,1,2,3});

    }
}

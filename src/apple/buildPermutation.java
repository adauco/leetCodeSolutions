package apple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class buildPermutation {
    String apellido;

    private buildPermutation(String ape) {
        this.apellido = ape;
    }
    private buildPermutation() { this.apellido = "alvarez"; }

    public int testingMap(int i){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("rosy", 39);
        map.put("Lucy", 43);
        map.put("Toyis", 41);
        map.put("lulu", 342);
        for(Map.Entry mo : map.entrySet()) {
            System.out.println(mo.getKey() + " " + mo.getValue() + " " + apellido);
        }

        return 0;
    }

    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] response = new int[n];

        for(int i=0;i<n; i++) {
            response[i] = nums[nums[i]];
        }

        return response;
    }
    public int[] buildArray2(int[] nums) {
        int n = nums.length;
        int[] response = new int[n];
        for (int i = 0; i < n; i++) {
            response[i] = nums[nums[i]];
        }
        return response;
    }

    public void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public String defangIPaddr(String address) {
        String[] def = address.split("\\.");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<def.length-1; i++) {
            result = result.append(def[i]).append("[.]");
        }
        result = result.append(def[def.length-1]);

        return result.toString();
        //return address.replace("\\.", "[.]");
    }


    public static void main(String[] args) {
        buildPermutation bu = new buildPermutation("Maraveles");
        //bu.testingMap(1);
       /* bu.printArray(bu.buildArray(new int[] {5,0,1,2,3,4}));
        System.out.println(": " + Arrays.toString(bu.buildArray(new int[] {5,0,1,2,3,4})));
        bu.printArray(bu.buildArray(new int[] {0,2,1,5,3,4}));
        System.out.println(": " + Arrays.toString(bu.buildArray(new int[] {0,2,1,5,3,4})));
*/
        System.out.println(bu.defangIPaddr("1.1.1.1"));
        System.out.println(bu.defangIPaddr("201.41.31.12"));


    }
}

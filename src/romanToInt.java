import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class romanToInt {

    public static void main(String args[]) {
       // String[] strArray = new String[]{"flower","flow","flight"};
       // System.out.println("Result: " + longestCommonPrefix(strArray));
        int[] i = {3,0,0,2,3,5,3};
        int c = removeElement(i, 3);
        System.out.println("PRINT " + c);
        System.out.println("CADENA " + Arrays.toString(i).substring(0,c+8));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n-1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }


    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    result = strs[0].substring(0, i);
                    return result;
                }
            }
        }
        return result;
    }

    public static int romanToInt2(String s) {
        int val = 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        val += map.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int cur = map.get(s.charAt(i));
            int pre = map.get(s.charAt(i - 1));

            if (pre < cur)
                val += cur - 2 * pre;
            else
                val += cur;
        }
        System.out.println("Roman number " + s + ", Decimal: " + val);
        return val;
    }

    public static int romanToIn(String s) {
        int decResult = 0;
        int i = 0;
        while (i < s.length()) {
            Boolean notEndOfString = i + 1 < s.length();
            String subs = s.substring(i, i + 1);
            switch (subs) {
                case "M":
                    decResult += 1000;
                    break;
                case "D":
                    decResult += 500;
                    break;
                case "C":
                    if (notEndOfString && s.substring(i + 1, i + 2).equals("D")) {
                        decResult += 400;
                        i++;
                    } else if (notEndOfString && s.substring(i + 1, i + 2).equals("M")) {
                        decResult += 900;
                        i++;
                    } else {
                        decResult += 100;
                    }
                    break;
                case "L":
                    decResult += 50;
                    break;
                case "X":
                    if (notEndOfString && s.substring(i + 1, i + 2).equals("L")) {
                        decResult += 40;
                        i++;
                    } else if (notEndOfString && s.substring(i + 1, i + 2).equals("C")) {
                        decResult += 90;
                        i++;
                    } else {
                        decResult += 10;
                    }
                    break;
                case "V":
                    decResult += 5;
                    break;
                case "I":
                    if (notEndOfString && s.substring(i + 1, i + 2).equals("V")) {
                        decResult += 4;
                        i++;
                    } else if (notEndOfString && s.substring(i + 1, i + 2).equals("X")) {
                        decResult += 9;
                        i++;
                    } else {
                        decResult += 1;
                    }
                    break;
                default:
                    System.out.println("Not valid roman number");
            }
            i++;
        }
        System.out.println("Roman number " + s + ", Decimal: " + decResult);
        return (decResult);
    }

}

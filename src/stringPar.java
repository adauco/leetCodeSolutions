import java.util.Arrays;
import java.util.HashMap;

public class stringPar {


    public static void main(String args[]) {
        /*isValid("[{{}}]()");
        isValid("");
        isValid("[{{}}](){");
        isValid("(()])}[}[}[]][}}[}{})][[(]({])])}}(])){)((){");*/
        int[] a = {1,1,2,3,3,3,3,3,3};
        int o = removeDuplicates(a);
        System.out.println("Largo de cadena " + o);


    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static boolean isValid(String s) {
        String opening = "[{(";
        String closing = "]})";
        Boolean value = true;
        if (s.length()==0) {
           value = true;
        } else {
            if(s.length() % 2 == 1 || closing.contains(s.substring(0,1))) {
                value = false;
            } else {
                HashMap<String, String> hmap = new HashMap<String, String>();
                hmap.put("]", "[");
                hmap.put("}", "{");
                hmap.put(")", "(");

                HashMap<Integer, String> temporal = new HashMap<Integer, String>();

                int i = 0;
                while (i < s.length() && value == true) {
                    if (opening.contains(s.substring(i,i+1))) {
                        temporal.put(temporal.size(), s.substring(i, i + 1));
                    } else if (opening.contains(s.substring(i,i+1))) {
                        if (temporal.get(temporal.size() - 1).contains(hmap.get(s.substring(i, i + 1)))) {
                            temporal.remove(temporal.size() - 1);
                        } else {
                            value = false;
                        }
                    }
                    i++;
                }
                if(temporal.size()>0)
                    value = false;
            }
        }
        System.out.println("String " + s + " is " +value);
        return value;
    }
}

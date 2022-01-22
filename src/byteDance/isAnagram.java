package byteDance;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class isAnagram {

    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        s = String.valueOf(chars);
        t = String.valueOf(chart);
        System.out.println(s+ " " + t);
        return s.equals(t);
    }
    public static void main(String[] args) {
        isAnagram is = new isAnagram();
        System.out.println(is.isAnagram("anagram","nagrama"));
        System.out.println(is.isAnagram("rac","tar"));
        System.out.println(is.isAnagram("peterparker","parkerrepet"));
    }
}

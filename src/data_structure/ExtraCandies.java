package data_structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
Given the array data_structure.ExtraCandies and the integer extraCandies, where data_structure.ExtraCandies[i] represents the number of data_structure.ExtraCandies that the ith kid has.

For each kid check if there is a way to distribute extraCandies among the kids
such that he or she can have the greatest number of data_structure.ExtraCandies among them.
Notice that multiple kids can have the greatest number of data_structure.ExtraCandies
 */

public class ExtraCandies {


    public static List<Boolean> kidswithCandies(int[] candies, int extraCandies) {
        int max;
        List<Boolean> Lista = new ArrayList<>();
        max = Arrays.stream(candies).max().getAsInt();

        for(int i = 0; i < candies.length; i++) {
            Lista.add(candies[i] + extraCandies >= max);
        }
        return Lista;
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies).mapToObj(candy -> candy + extraCandies >= max).collect(Collectors.toList());
    }

    public static void main(String args[]) {

        int[] i = {3,0,0,2,3,5,3};
        System.out.println("PRINT " + kidsWithCandies(i,2));
        System.out.println("PRINT " + kidswithCandies(i,2));

    }

}

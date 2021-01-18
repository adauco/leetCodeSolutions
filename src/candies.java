import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class candies {



    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies).mapToObj(candy -> candy + extraCandies >= max).collect(Collectors.toList());
    }

    public static void main(String args[]) {

        int[] i = {3,0,0,2,3,5,3};
        System.out.println("PRINT " + kidsWithCandies(i,2));
    }

}

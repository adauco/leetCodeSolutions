package Microsoft;

import java.util.ArrayList;
import java.util.List;

public class NestedArrayList {

    public static void main(String[] args){
        List<List<Integer>> nestedList = new ArrayList<>();
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        List<Integer> a3 = new ArrayList<>();

        a1.add(1);
        a1.add(2);
        a1.add(3);

        a2.add(4);
        a2.add(5);
        a2.add(6);

        a3.add(7);
        a3.add(8);
        a3.add(9);

        nestedList.add(a1);
        nestedList.add(a2);
        nestedList.add(a3);

        for(List<Integer> obj: nestedList){
            List<Integer> temp = obj;
            for(Integer i: temp){
                System.out.println(i);
            }
            System.out.println();
        }
    }
}

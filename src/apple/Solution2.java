package apple;

import java.util.List;

class Super{
    public  Super(int x){
        int i = x;
    }

}

public class Solution2 {

    List<String> truck1;
    List<String> truck2;
    public void splitHouses(List<String> list, boolean truck) {
        if (list.size() > 0) {
            if(truck == true )
                truck1.add(list.get(0));
                splitHouses(list.subList((1), list.size()), false);
            } else {
                truck2.add(list.get(0));
                splitHouses(list.subList(1, list.size()), true);
            }
    }

    public static void main(String args[]) {
        Super su = new Super(5);
    }
}

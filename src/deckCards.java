import java.util.ArrayList;
import java.util.List;

import static java.sql.Types.NULL;

public  class deckCards {
    public static boolean hasGroupsSizeX(int[] deck) {
        int i;
        int sizeGroup=0;
        int temp =0;

        for(i=0; i+1 < deck.length; i++) {
            if(deck[i] == deck[i+1]){
                temp++;
            } else if(sizeGroup == 0) {
                sizeGroup = temp;
                temp = 1;
            } else {
                if(temp!=sizeGroup){
                    return false;
                } else {
                    temp=0;
                }
            }
        }
        return temp==sizeGroup;
    }

    public static boolean hasGroupsSizeGOOD(int[] deck) {
        int i,j;
        int sizeGroup=NULL;
        int temp =1;
        if(deck.length==1)
            return false;
        if(deck.length%2==1)
            return false;
        for(i=0; i+1 < deck.length; i++) {
            for(j=0; j+1 <= deck.length; j++) {
                if(deck[i] == deck[j]){
                    temp++;
                }
            }
            if(sizeGroup == NULL) {
                sizeGroup = temp;
                temp = 1;
            } else {
                if(temp!=sizeGroup){
                    return false;
                } else {
                    temp=1;
                }
            }
        }
        return true;
    }

        public static boolean hasGroupsSizeXX(int[] deck) {
            int N = deck.length;
            int[] count = new int[10000];
            for (int c: deck)
                count[c]++;

            List<Integer> values = new ArrayList();
            for (int i = 0; i < 10000; ++i)
                if (count[i] > 0)
                    values.add(count[i]);

            search: for (int X = 2; X <= N; ++X)
                if (N % X == 0) {
                    for (int v: values)
                        if (v % X != 0)
                            continue search;
                    return true;
                }

            return false;
        }


    public static void main(String args[]) {
        int[] deck = {1,3,3,1,3,3};
        int[] deck1 = {1,3,1,1,3,3};
        int[] deck2 = {3,3,1,1,3,3,1,1};
        int[] deck3 = {1,3,3,1,1,3,3,4,4,4};
        int[] deck4 = {1,3,3};
        int[] deck5 = {1};
        int[] deck6 = {1,3};

       // System.out.println("RESULTADO " + hasGroupsSizeX(deck);
        System.out.println("RESULTADO TRUE " + hasGroupsSizeXX(deck));
      /*  System.out.println("RESULTADO TRUE " + hasGroupsSizeGOOD(deck1));
        System.out.println("RESULTADO TRUE " + hasGroupsSizeGOOD(deck2));
        System.out.println("RESULTADO false " + hasGroupsSizeGOOD(deck3));
        System.out.println("RESULTADO TRUE " + hasGroupsSizeGOOD(deck4));
        System.out.println("RESULTADO TRUE " + hasGroupsSizeGOOD(deck5));
        System.out.println("RESULTADO TRUE " + hasGroupsSizeGOOD(deck6));*/






    }
}

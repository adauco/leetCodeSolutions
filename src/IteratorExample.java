import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        ArrayList<String> lalista = new ArrayList<>();
        lalista.add("chivas");
        lalista.add("seahawks");
        lalista.add("sounders");
        lalista.add("charros");
        lalista.add(" ");


        lalista.set(4,"Barcelona");

            for(int i = 0; i < lalista.size(); i++) {
                System.out.println("Elemento " + lalista.get(i));
                if(lalista.get(i).contains("s")) {
                    System.out.println(" REMOVED  " );
                    lalista.remove(i);
                    i--;
                }
            }

        Iterator<String> lala =  lalista.iterator();
        System.out.println();
        System.out.println(" ITERATOR ");
        while(lala.hasNext()) {
            System.out.println(lala.next());
        }

    }
}

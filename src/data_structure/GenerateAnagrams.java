package data_structure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
    Problem: Given a dictionary of English words, find all sets of anagrams.
    For instance, “pots”, “stop”, and “tops” are all anagrams of one another
    because each can be formed by permuting the order of the letters.
*/
public class GenerateAnagrams {
    HashMap<String, Set<String>> returnAnagrams(String[] dictionary) {
        HashMap<String, Set<String>> arreglo = new HashMap(0);

         for(int i= 0; i < dictionary.length; i ++) {
            String Word = dictionary[i];
            String orderedWord = Stream.of(Word.split(""))
                                .sorted()
                                .collect(Collectors.joining());

            //orderedWord = orderArray(Word);
            Set<String> Valor = new HashSet();

            if(arreglo.get(orderedWord) == null) {
                Valor.add(Word);
                arreglo.put(orderedWord, Valor);
            } else {
                Valor = arreglo.get(orderedWord);
                Valor.add(Word);
                arreglo.put(orderedWord, Valor);
            }
        }
         printHash(arreglo);
        return arreglo;
    }//O(D * N log n)

    void fillDictionary(String[] array) {
        array[0] = "palabra";
        array[1] = "lapabar";
        array[2] = "alabraap";
        array[3] = "BABA";
        array[4] = "BAAB";
        array[5] = "stop";
        array[6] = "pots";
        array[7] = "sotp";
        array[8] = "polo";
        array[9] = "lopo";
    }

    void printHash(HashMap<String, Set<String>> imprimir) {
        for(Map.Entry<String, Set<String>> entry : imprimir.entrySet()) {
            System.out.println("KEY " + entry.getKey() + " VALUE " + entry.getValue());
        }
    }

  public static void main(String[] args){
    String[] array = new String[10];
    GenerateAnagrams doc = new GenerateAnagrams();
     doc.fillDictionary(array);
     doc.returnAnagrams(array);
      System.out.println(doc.toString());

      Set<String> hash_Set = new HashSet<String>();

      hash_Set.add("Geeks");
      hash_Set.add("For");
      hash_Set.add("Geeks");
      hash_Set.add("Example");
      hash_Set.add("Set");
      hash_Set.add("Set");
      hash_Set.add("Set");

      System.out.println(hash_Set + " " + hash_Set.contains("Set") + hash_Set.contains("SeT"));
      hash_Set.remove("Geeks");
      System.out.println(hash_Set);
  }

}

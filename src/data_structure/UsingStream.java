package data_structure;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStream {
    public static void main (String[] args) {
        String Word2 = "Juan Adauco Quezada Nunez";
        String Word = "AlaaucoQuezadaNanez";




        String orderedWord = Stream.of(Word.split(""))
                .sorted()
                .collect(Collectors.joining());


        String orderedWord2 = Stream.of(Word.split(" "))
                .sorted()
                .collect(Collectors.joining());
        String orderedWord3 = Stream.of(Word.split("a"))
                .sorted().collect(Collectors.joining());
        System.out.println(Word + " " + orderedWord + " " + orderedWord2);

    }
}

package apple;
/*
Write a java method which accepts an input String that contains multiple words and prints the words of that stirng in reverse order. Please ignore the duplicates.
Example: Input: "Apple is  a good   company  good working  is a cat"
  Output should be: "a is working good company Apple"
  */

import java.io.*;
import java.util.*;

class reverseWords {
    static String [] inputs = {
            "Apple is a good company good working is a cat",
            "good good good",
    };
    public static void main(String [] args) {
        for (String input: inputs){
            reverseWords(input);
        }
    }

    public static void reverseWords(String input) {
        /* Write your code here and print the reversed string */
        HashSet<String> set = new HashSet<String>();
        String[] splitStrings = input.split(" ");
        for(int i = splitStrings.length-1; i >= 0; i--) {
            if(!set.contains(splitStrings[i])) {
                set.add(splitStrings[i]);
                System.out.println(splitStrings[i]);
            }
        }
        System.out.println("OK");
    }
}
import AlanCode.FibonacciFind;

import java.util.HashSet;

// Find duplicate characters in a String and count the number of occurrences of the duplicate characters
public class HelloWorld{
    public int duplicate(String str){
        HashSet<Character> set = new HashSet<>();
        int counter = 0;
        System.out.println("Check");
        for(int i = 0; i < str.length(); i++){
            if(set.add(str.charAt(i)) == false){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args){
        FibonacciFind ans = new FibonacciFind();
       // System.out.println(ans.duplicate("aaasssdddssaaassdddghyuj"));
    }
    //Kyle Bolt
}
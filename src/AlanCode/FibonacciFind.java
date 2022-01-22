package AlanCode;

import java.math.BigInteger;

public class FibonacciFind {

    //Write a method to return the index of the N fibonacci number where the first and last digits are the same

    public static int solution(int n){
        int i = 7, nCount=0;
        BigInteger fibCurrent = BigInteger.valueOf(8);
        BigInteger fibPrev = BigInteger.valueOf(5);
        BigInteger fib;

        while(nCount!= n){
            fib = fibCurrent.add(fibPrev);
            String sol = String.valueOf(fib);
            if((sol.charAt(0) == sol.charAt(sol.length() - 1))){
                nCount++;
                System.out.println(fib + " " + i);
                if(nCount == n)
                    break;
            }
            fibPrev = fibCurrent;
            fibCurrent = fib;
            i++;
        }

        return i;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}

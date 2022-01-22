package apple;

public class PrimeNumbers {

    public static void main(String args[]){
        printPrimeNumbers(499979);
    }

    public static void printPrimeNumbers(int n) {
        int total = 1;

        for(int i = 3; i < n; i+=2 ){
            int counter = 0;
            for(int num = 1; num <= i; num++) {
                if(i % num == 0) {
                    counter ++;
                }
            }
            if(counter == 2) {
                System.out.println("Es primo " + i);
                total++;
            }
        }
        System.out.println("TOTAL " + total);
    }


}

package apple;

public class reverseInteger {

    public int reverse(int x) {
        long reversed = 0;
        while(x != 0){
            reversed = (x % 10) + (reversed * 10);
            x = x/10;
        }
        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)reversed;
        }
    }

    public static void main (String args[]) {
        reverseInteger rev = new reverseInteger();
        System.out.println("Print " + rev.reverse(555));
        System.out.println("Print " + rev.reverse(435));
        System.out.println("Print " + rev.reverse(-994433));
        System.out.println("Print " + rev.reverse(-43238787));
        System.out.println("Print " + rev.reverse(1534236469));
        System.out.println("Print " + rev.reverse(1));
        System.out.println("Print " + rev.reverse(-9));

    }
}

package apple;

public class richestCustomer {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0; i < accounts.length; i ++) {
            int temp = 0;
            for(int j=0; j < accounts[0].length; j++) {
                temp = temp + accounts[i][j];
            }
            max = Math.max(max, temp);
        }
        return max;
    }
    public static void main (String args[]){
        richestCustomer rich = new richestCustomer();
        int[][] values = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println("MAX " + rich.maximumWealth(values));
    }
}

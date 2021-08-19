package data_structure;


public class BinarySearch {
     Node root;

    BinarySearch(String key) {
        root = new  Node(key);
    }

    BinarySearch(){
        root = null;
    }
    static void inorder(Node arbol) {
        if(arbol == null)
            return;
        inorder(arbol.left);
        System.out.print(arbol.nombre + " ");
        inorder(arbol.right);
    }

    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxPrice = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < minPrice && i < prices.length-1) {
                minPrice = prices[i];
                maxPrice = minPrice;
            }  else if(prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
            if(profit < maxPrice - minPrice)
                profit = maxPrice - minPrice;
        }

        if(profit > 0)
            return profit;
        return 0;
    }

    public int maxProfit1(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }
        int minPrice = prices[ 0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
     public static void  main (String args[]){
        BinarySearch arbol = new BinarySearch();

         arbol.root = new Node("Juan");
         arbol.root.left = new Node( "Adauco");
         arbol.root.right = new Node("Quezada");
         //arbol.root.left.right = new Node( "Nunez");
         //arbol.root.right.right = new Node( "Junior");

         int[] prices1 = {3,2,6,5,0,3};
         int[] prices2 = {7,6,5,5,3,2};
         int[] prices3 = {2,4,1};
         System.out.println("OUTPUT ");

         int co1 = arbol.maxProfit(prices1);
         int co2 = arbol.maxProfit(prices2);
         int co3 = arbol.maxProfit(prices3);
         int co4 = arbol.maxProfit1(prices3);

         System.out.println("OUTPUT " + co1 + " " + co2 + " " + co3+ " " + co4);
    //     inorder(arbol.root);
     }
}

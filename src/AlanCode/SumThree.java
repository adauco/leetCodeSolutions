package AlanCode;

/*
Si tienes un arbol binario
por ejemplo

     5
    / \
   2   4
  / \   \
15  20   3

Crea un algoritmo que encuentre el "camino" con el mayor valor y regrese el valor de la suma y luego imprimelo en pantalla
en este ejemplo, la solucion seria
  2
 / \
15 20

y la suma seria 37

 /
   2
  /
10

Otro ejemplo seria
la solucion seria

    20
    /\
   15 7

y la suma 42
*/

class Node {

    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
    }
}

class Solution {
    public int max= 0;

    public int recusrsiveMethod(Node nodo){
        int left=0, right =0, total = 0;

        if(nodo == null)
            return 0;

        left = recusrsiveMethod(nodo.left);
        right = recusrsiveMethod(nodo.right);

        total = left + right + nodo.value;
        max = Math.max(max, total);

        return Math.max(nodo.value + right, nodo.value + left);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //Node nodo = new Nodo();

    /*
     -10
      /\
     9  20
        /\
       15 7
   */

        Node node10 = new Node(-10);
        Node node9 = new Node(9);
        Node node20 = new Node(20);
        Node node15 = new Node(15);
        Node node7 = new Node(7);

        node10.left = node9;
        node10.right = node20;
        node20.left = node15;
        node20.right = node7;


        sol.recusrsiveMethod(node10);
        System.out.println(sol.max);
    }
}

package AlanCode;

import java.util.Stack;

public class RanaSalta {
    /*
Tengo una rana que puede brincar 1 espacio o 2 espacios, si yo quiero que la rana llegue a la posicion 5 genera un algoritmo que imprima todas las cambionaciones posibles que la rana puede utilizar para llegar a esta pocision

R -----
Algunas soluciones:
11111 1112 2111 1211 1121 212 122 221
*/


    public void method2(int n, String jump) {
        if(n == 0){
            System.out.println(jump);
        }
        if(n < 0){
            return;
        }

     /*   for(int i = 0; i < m; i++){
            method2(n-i, m,jump + i);
        }*/
        method2(n-1, jump + "1");
        method2(n-2, jump + "2");

    }

    public static void method(int n, Stack<Integer> pila) {
        int total =0;
        for(int x : pila)
            total = total + x;

        if(n == total){
            System.out.println(pila.toString());
            return;
        }

        pila.push(1);
        method(n,pila);
        pila.pop();

        if(n - total == 1)
            return;

        pila.push(2);
        method(n,pila);
        pila.pop();
    }

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        RanaSalta sol = new RanaSalta();
        sol.method(4, pila);
        sol.method2(4,"");
    }
}

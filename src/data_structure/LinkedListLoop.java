package data_structure;
// Escribir una funcion que determine si la lista hace loop
// Circular tail apunta a head
// loop tail, apunta a cualquier nodo
// i.e. 1 -> 2 -> 3 -> 4 -> 2
// Puede ser que tenga null,
// true si es loop
// false si no lo es
// 1 -> 1, es loop
// 1 -> null, no es loop
// Circular es loop, return true
// INT.MIX < data < INT.MAX
// Hay duplicados en los datos?

class Nodo {
    int data;
    Nodo next;
    Nodo(int d)
    {
        data = d;
        next = null;
    }
}
public class LinkedListLoop {

    boolean isLoop(Nodo head) {
        if(head == null)
            return false;

        Nodo pointer = head;
        Nodo pointer2 = head.next;

        while(pointer.next != null && pointer2 != null) {
            pointer = pointer.next;
            pointer2 = pointer2.next.next;
            if(pointer == pointer2)
                return true;
        }
        return false;
    }//O(N) time depende del tamaño de la lista, el peor caso es cuando el ultimo elemento apunta a si mismo
     //O(1) no se agrega nada de nada

    public static void main(String[] args) {
        Nodo head = new Nodo(1);
        head.next= new Nodo(2);
        head.next.next= new Nodo(3);
        head.next.next.next= new Nodo(4);
        head.next.next.next.next =  head.next.next.next;

        LinkedListLoop MA = new LinkedListLoop();

        System.out.println(" IS IT LOOP "+ MA.isLoop(head));
    }
}

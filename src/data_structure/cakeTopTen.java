package data_structure;

import java.util.HashMap;
import java.util.LinkedList;
/* LEETCODE*/

public class cakeTopTen {
    LinkedList<String> lista = new LinkedList();
    HashMap mapa = new HashMap();
    Node head;

    class Node {
        String recipe;
        Node previous;
        Node next;

        Node(String REC) {
            recipe = REC;
        }
    }

    void push(String receta) {
        Node nodo = new Node(receta);
        if(head == null){
            head = nodo;
        } else {
            Node temp = head;
            head = nodo;
            head.next = temp;
            temp.previous = head;
        }
    }

    void addAfter(String newRecipe, Node oldOne) {
        if(oldOne == null || head == null) {
            System.out.println("Nodo esta null");
            return;
        }
        Node newNode = new Node(newRecipe);

        newNode.next = oldOne.next;
        newNode.previous = oldOne;
        oldOne.next = newNode;
        if(newNode.next != null)
            newNode.next.previous = newNode;
    }
    void addToTheLast(String newRecipe) {
        Node newNode = new Node(newRecipe);
        Node lastNode = head;
        while(lastNode.next != null)
            lastNode = lastNode.next;
        lastNode.next = newNode;
        newNode.next = null;
        newNode.previous = lastNode;
    }

    public static void main(String[] args) {
        System.out.println("LISTA ");
        cakeTopTen ca = new cakeTopTen();
        ca.push("pastel");
        ca.push("leche");
        ca.push("agua");
        ca.addAfter("Tres leches", ca.head.next);
    }

}

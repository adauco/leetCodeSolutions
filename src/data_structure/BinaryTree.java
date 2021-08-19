package data_structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    int key;
    String nombre;
    Node left, right;

    public Node(String item) {
        nombre = item;
        left = right = null;
    }

    public Node(int item) {
        key = item;
        left = right = null;
    }
}
public class BinaryTree {

    Node root;

    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree(){
        root = null;
    }

    int maxDepth(Node nodo) {
        if(nodo == null)
            return 0;
        int left = maxDepth(nodo.left);
        int right = maxDepth(nodo.right);
        if(left > right)
            return left + 1;
        else
            return right + 1;
        //Time complexity O(n), because depends on the size of the data sent.
    }

    static void inorder(Node arbol)
    {
        if (arbol == null)
            return;

        inorder(arbol.left);
        System.out.print(arbol.key + " ");
        inorder(arbol.right);
        //O(N) depends on the size of the node
    }

    static void preorder(Node arbol)
    {
        if (arbol == null)
            return;
        System.out.print(arbol.key + " ");
        preorder(arbol.left);
        preorder(arbol.right);
        //O(N) depends on the size of the node

    }

    static void postorder(Node arbol)
    {
        if (arbol == null)
            return;
        postorder(arbol.left);
        postorder(arbol.right);
        System.out.print(arbol.key + " ");
        //O(N) depends on the size of the node
    }

    static void inorderStack(Node arbol)
    {
        Stack<Node> pila = new Stack<Node>();
        Node current = arbol;

        while(current != null || !pila.empty()){
            while(current != null) {
                pila.push(current);
                current = current.left;
            }
                current = pila.pop();
                System.out.print(current.key + " ");
                current = current.right;
        }
        //O(N) depends on the size of the node
    }

    static void preorderStack(Node arbol)
    {
        Stack<Node> pila = new Stack<Node>();
        Node current = arbol;

        while(current != null || !pila.empty()){
            while(current != null) {
                pila.push(current);
                System.out.print(current.key + " ");
                current = current.left;
            }
            current = pila.pop();
            current = current.right;
        }
        //O(N) depends on the size of the node
    }

    static void postorderStack(Node arbol) {
        Stack<Node> pila = new Stack<Node>();
        pila.push(arbol);
        int i =0;
        while (!pila.isEmpty()) {
            i++;
            Node current = pila.peek();
            if (current.left == null && current.right == null) {
                Node node = pila.pop();
                System.out.printf("%s ", node.key);
            } else {
                if (current.right != null) {
                    pila.push(current.right);
                    current.right = null;
                }
                if (current.left != null) {
                    pila.push(current.left);
                    current.left = null;
                }
            }
        }
        System.out.println("QUANTITY " + i);
    }

    void insert(Node arbol, int key) {
        if(arbol == null) {
            root = new Node(key);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(arbol);

        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            arbol = q.peek();
            q.remove();

            if (arbol.left == null) {
                arbol.left = new Node(key);
                break;
            }
            else
                q.add(arbol.left);

            if (arbol.right == null) {
                arbol.right = new Node(key);
                break;
            }
            else
                q.add(arbol.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree arbol = new BinaryTree();

        arbol.root = new Node(1);
        arbol.root.left = new Node(2);
        arbol.root.right = new Node(3);
        arbol.root.left.left = new Node(4);
        arbol.root.left.right = new Node(5);
        arbol.root.right.left = new Node(6);
        arbol.root.right.right = new Node(7);

        //System.out.println("MAX DEPTH " + arbol.maxDepth(arbol.root));
       /* System.out.println(
                "Inorder traversal before insertion: ");
        inorder(arbol.root);
        System.out.println();

        System.out.println(
                "Inorder STACK traversal before insertion: ");
        inorderStack(arbol.root);
        System.out.println();

        System.out.println(
                "Preorder traversal before insertion: ");
        preorder(arbol.root);
        System.out.println();
        System.out.println(
                "Preorder STACK traversal before insertion: ");
        preorderStack(arbol.root);
        System.out.println();
*/
        System.out.println(
                "Postorder traversal before insertion: ");
        postorder(arbol.root);
        System.out.println();

        System.out.println(
                "Postorder STACK traversal before insertion: ");
        postorderStack(arbol.root);
        System.out.println();

        /*int key = 12;
        arbol.insert(arbol.root, key);

        System.out.print(
                "\nInorder traversal after insertion:");
        inorder(arbol.root);*/

    }
}

package data_structure;

// Recursive Java program for level
// order traversal of Binary Tree

/* Class containing left and right child of current
node and key value*/

public class PrintLevel
{
    Node root;

    public PrintLevel() {
        root = null;
    }

    /* function to print level order traversal of tree*/
    void printLevelOrder() {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++) {
            printGivenLevel(root, i);
            System.out.println();
        }
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node root) {
        if (root == null)
            return 0;
        else {
            /* compute height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }

    /* Print nodes at the given level */
    void printGivenLevel (Node root ,int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.key + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        PrintLevel tree = new PrintLevel();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);
        tree.root.right.left= new Node(6);
        tree.root.right.right= new Node(7);
        tree.root.right.right.right= new Node(77);


        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
        tree.printGivenLevel(tree.root,2);
    }
}

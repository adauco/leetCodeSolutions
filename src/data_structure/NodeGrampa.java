package data_structure;

// Java program to print nodes with grandchildren
class NodeGrampa{

    static class node {
        node left, right;
        int key;
    };

    static node newNode(int key) {
        node temp = new node();
        temp.key = key;
        temp.left = temp.right = null;
        return temp;
    }

    // Function to print the nodes of the Binary Tree having a grandchild
    static void cal(node root) {
        boolean grand = false;
        // Base case to check if the tree exists
        if (root == null)
            return;
        if (root.left != null) {
            // Check for grandchildren
            if (root.left.left != null || root.left.right != null) {
                grand = true;
                // System.out.print(root.key + " ");
            }
        }
        if (root.right != null) {
            // Check for grandchildren
            if (root.right.left != null || root.right.right != null) {
                //System.out.print(root.key + " ");
                grand = true;
            }
        }
        if (grand)
            System.out.print(root.key + " ");
        cal(root.left);
        cal(root.right);

    }
    // Driver Code
    public static void main(String[] args) {
        // Given Tree
        node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.right.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.left.right.left = newNode(6);
        root.right.right.left = newNode(7);


        // Function call
        cal(root);
    }
}

package data_structure;



public class MaxNumberBTree {

    Node root;
    int max = Integer.MIN_VALUE;

    int returnMaxRecursive(Node root) {
        int currMax =0;
        if(root == null){
            return 0;
        }
        if(root.right == null && root.left == null) {
            return root.key;
        }
        int left = returnMaxRecursive(root.left);
        int right = returnMaxRecursive(root.right);

            if(root.key > root.key + left + right){
                currMax = root.key;
            } else {
                currMax = Math.max(left, right);
            }

        if(root.key + left > (root.key + left + right)) {
            currMax = root.key + left;
        } else if(root.key + right > (root.key + left + right)) {
            currMax = root.key + right;
        } else {
            currMax = root.key + left + right;
        }
        max = (currMax>max)?currMax:max;
        return currMax;
    }

    int returnMax(Node root) {
        int curr = returnMaxRecursive(root);
        int ans = max>curr?max:curr;
        return ans;
    }

    public static void main(String [] args) {
        // you can write to stdout for debugging purposes, e.g.
        MaxNumberBTree ma = new MaxNumberBTree();

        ma.root= new Node(1);
        ma.root.left= new Node(-2);
        ma.root.right= new Node(-3);
        ma.root.left.left= new Node(-4);
        ma.root.left.right= new Node(-11);
        //ma.root.right.left= new Node(6);
       // ma.root.right.right= new Node(7);
        //ma.root.right.right.right= new Node(77);

        System.out.println("This is the max SUM " + ma.returnMax(ma.root));
    }
}


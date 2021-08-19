package data_structure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(
            int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

        public TreeNode invertTree(TreeNode root) {
            if(root == null)
                return null;
            TreeNode temp = new TreeNode();
            temp.val = root.val;

            if(root.left != null || root.right != null) {
                temp.left = root.right;
                temp.right = root.left ;
            }
            if(temp.left != null)
                temp.left = invertTree(temp.left);
            if(temp.right != null)
                temp.right = invertTree(temp.right);
            return temp;
        }

        public TreeNode invertTree2(TreeNode root) {
        if(root == null)
            return null;
        TreeNode right = invertTree2(root.right);
        TreeNode left = invertTree2(root.left);
        root.left = right;
        root.right = left;
        return root;

        }

    public boolean canPermutePalindrome(String s) {
        ArrayList<Character> lista = new ArrayList<>(s.length());

        Set<Character> set = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++) {
            if(!set.add(s.charAt(i)))
                set.remove(s.charAt(i));
        }
        return set.size() <= 1;
    }

    public static void main(String args[]) {
        TreeNode NODO = new TreeNode();
        NODO = new TreeNode(4);
        NODO.left = new TreeNode(2);
        NODO.right = new TreeNode(7);
        NODO.left.left = new TreeNode(1);
        NODO.left.right = new TreeNode(3);
        NODO.right.left = new TreeNode(6);
        NODO.right.right = new TreeNode(9);
        System.out.println("aab TRUE -- " + NODO.canPermutePalindrome("aab"));
        System.out.println("code FALSE -- " + NODO.canPermutePalindrome("code"));

        //NODO = NODO.invertTree(NODO);
        //TreeNode nodos = NODO.invertTree2(NODO);
        System.out.println("PRINT HERE");
    }
}

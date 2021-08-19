package data_structure;

import java.util.Arrays;

class Leaf{
    int value = 0;
    Leaf right;
    Leaf left;
    Leaf() {
        value = 0;
        right = left = null;
    }
    Leaf(int val) {
        value = val;
        right = left = null;
    }
}

public class TestDock {
    public Leaf createBST(int[] nums, int start, int end){
            int mid = (start+end)/2;
            Leaf nodo = new Leaf(nums[mid]);
            System.out.print(nodo.value);
            if(start!= mid){//Left
                nodo.left = createBST(nums, start, mid);
            }
            if(mid+1 != end) {//Right
                nodo.right = createBST(nums, mid + 1, end);
            }
            return nodo;
    }

    public Leaf createBSTSubArray(int[] nums){
        int end = nums.length;
        int mid = (end)/2;
        Leaf nodo = new Leaf(nums[mid]);
        System.out.print(nodo.value);
        int[] left = Arrays.copyOfRange(nums, 0,mid);
        int[] rigth = Arrays.copyOfRange(nums, mid+1,end);

        if(0!= mid){//Left
            nodo.left = createBSTSubArray(left);
        }
        if(mid+1 != end) {//Right
            nodo.right = createBSTSubArray(rigth);
        }
        return nodo;
    }

    int max;

    public int diameterOfBinaryTree(Leaf root) {
        max=1;
        otro(root);
        System.out.println("Max path " + (max -1));
        return max -1;
    }

    public int otro(Leaf root) {
        if(root== null)
            return 0;
        int l = otro(root.left);
        int r = otro(root.right);
        max = Math.max(max, l+r+1);
        return Math.max(l,r) +1;
    }
    public static void main(String args[]) {
        TestDock doc = new TestDock();
        int[] nums= {-1,0,2,3,4,5,7,8,9,10,22};
       // Leaf lea = doc.createBST(nums, 0, nums.length);
        int i = 8/10;
        int j = 8%10;
        System.out.println(i + " " + j);
        //doc.createBSTSubArray(nums);
        //doc.diameterOfBinaryTree(lea);

    }
}
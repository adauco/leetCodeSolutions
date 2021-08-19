package data_structure;
/**
 * Definition for singly-linked list.
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example 1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 *
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 *
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class SumLists {
        ListNode head;
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int sum;
            int carry = 0;
            ListNode temp = new ListNode();
            ListNode p = l1, q = l2, head = temp;
            while(p != null || q !=null) {
                int x=(p!= null)?p.val:0;
                int y=(q!=null)?q.val:0;
                sum = x + y + carry;
                carry = sum/10;
                temp.next = new ListNode(sum%10);
                temp = temp.next;
                if(p != null) p = p.next;
                if(q != null) q = q.next;
            }
            if(carry>0)
                temp.next = new ListNode(carry);
            return head.next;
/*
Time complexity :
 O(\max(m, n))O(max(m,n)).
 Assume that m/n represents the length of l1/l2 respectively,
 the algorithm above iterates at most \max(m, n)max(m,n) times.

Space complexity :
O(\max(m, n))O(max(m,n)). The length of the new list is at most \max(m,n) + 1max(m,n)+1.
*/
        }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(7);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        SumLists sum = new SumLists();
        sum.addTwoNumbers(l1,l2);

    }
}

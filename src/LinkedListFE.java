// A complete working Java program to demonstrate all insertion methods
// on linked list
class LinkedListFE
{
    Node head; // head of list\
    ListNode head2;

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    private Node mergeTwoLists(Node headA, Node headB){
       /* a dummy first node to
       hang the result on */
        Node dummyNode = new Node(0);

    /* tail points to the
    last result node */
        Node tail = dummyNode;
        while(true)
        {

        /* if either list runs out,
        use the other list */
            if(headA == null)
            {
                tail.next = headB;
                break;
            }
            if(headB == null)
            {
                tail.next = headA;
                break;
            }

        /* Compare the data of the two
        lists whichever lists' data is
        smaller, append it into tail and
        advance the head to the next Node
        */
            if(headA.data <= headB.data)
            {
                tail.next = headA;
                headA = headA.next;
            }
            else
            {
                tail.next = headB;
                headB = headB.next;
            }

            /* Advance the tail */
            tail = tail.next;
        }
        return dummyNode.next;
    }


    public void push2(int new_data)
    {
		/* 1 & 2: Allocate the Node &
				Put in the data*/
        ListNode new_node = new ListNode(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head2;

        /* 4. Move the head to point to new Node */
        head2 = new_node;
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
		/* 1 & 2: Allocate the Node &
				Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Inserts a new node after the given prev_node. */
    public void insertAfter(Node prev_node, int new_data)
    {
        /* 1. Check if the given Node is null */
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }

		/* 2 & 3: Allocate the Node &
				Put in the data*/
        Node new_node = new Node(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }

    /* Appends a new node at the end. This method is
    defined inside LinkedListFE class shown above */
    public void append(int new_data)
    {
		/* 1. Allocate the Node &
		2. Put in the data
		3. Set next as null */
        Node new_node = new Node(new_data);

		/* 4. If the Linked List is empty, then make the
			new node as head */
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }

		/* 4. This new node is going to be the last node, so
			make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }

    /* This function prints contents of linked list starting from
        the given node */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    public void deleteNode(int val){
        Node tnode = head;
        Node prevNod = null;
        if(head.data == val){
            head = head.next;
            return;
        }
        while(tnode != null ){
            if(tnode.data==val){
                prevNod.next=tnode.next;
                return;
            }
            prevNod = tnode;
            tnode = tnode.next;
        }

    }

    /* Driver program to test above functions. Ideally this function
    should be in a separate user class. It is kept here to keep
    code compact */
    public void main(String[] args)
    {
        LinkedListFE llist1 = new LinkedListFE();
        LinkedListFE llist2 = new LinkedListFE();

        // Node head1 = new Node(5);
        llist1.append( 5);
        llist1.append(10);
        llist1.append(15);

        // Node head2 = new Node(2);
        llist2.append(2);
        llist2.append(3);
        llist2.append(20);


        mergeTwoLists(llist1.head, llist2.head);
        /* Start with the empty list */
        LinkedListFE llist = new LinkedListFE();

        // Insert 6. So linked list becomes 6->NUllist
        llist.append(6);

        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        llist.push(7);

        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        llist.push(1);

        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        llist.append(4);

        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        llist.insertAfter(llist.head.next, 8);

        System.out.println("\nCreated Linked list is: ");
        llist.printList();
        llist.deleteNode(6);
        System.out.println("\nCreated Linked list is: ");
        llist.printList();

    }
}
// This code is contributed by Rajat Mishra

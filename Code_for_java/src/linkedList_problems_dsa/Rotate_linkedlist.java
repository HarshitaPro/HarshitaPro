package linkedList_problems_dsa;

public class Rotate_linkedlist {
	//step1 ===> pointer of last node will points to first node of linkedlist
	//step 2 ===> find of nth node from which we start rotation
	//step3 ===> after finding the nth node we have points it to null
	//step 4 ===>before step3 we have to store the value after nth node to the temp variable
	
	 public static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    public static Node rotate(Node head, int k) {
	        if (head == null || head.next == null || k == 0) {
	            return head; // No rotation needed
	        }

	        // Find the length of the linked list
	        int length = 0;
	        Node current = head;
	        while (current != null) {
	            length++;
	            current = current.next;
	           // System.out.println("current-data:"+current.data);
	        }

	        // Adjust k to handle rotations that wrap around
	        k %= length;
	        if (k == 0) {
	            return head; // No rotation needed
	        }

	        // Find the (length - k)th node from the beginning
	        current = head; 
	        for (int i = 0; i < length - k - 1; i++) {
	            current = current.next;
	        }

	        // Set the (length - k)th node's next to the head
	        Node newHead = current.next;
	        current.next = null;
	        System.out.println(newHead.data);

	        // Connect the end of the list to the original head
	        Node tail = newHead;
	        while (tail.next != null) {
	            tail = tail.next;
	        }
	        tail.next = head;

	        return newHead;
	    }

	    public static void main(String[] args) {
	        Node head = new Node(1);
	        head.next = new Node(2);
	        head.next.next = new Node(3);

	        head.next.next.next = new Node(4);
	        head.next.next.next.next = new Node(5);


	        int k = 3;
	        Node rotatedHead = rotate(head,k);

	        // Print the rotated linked list
	        while (rotatedHead != null) {
	            System.out.print(rotatedHead.data + " ");
	            rotatedHead = rotatedHead.next;
	        }
	    }
	}
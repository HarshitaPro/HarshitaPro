package linkedList_problems_dsa;

public class Reverse_linklist {
	//Node class ===singly linkedlist
	public static class Node{
		int data;
		Node next ;
		//constructor 
		Node(int data){
			this.data= data;
			this.next = null;
			}
		//reverse method
		public static Node reverse(Node head) {
			Node current = head;
			Node previous = null;
			
			while(current!=null) {
				Node temp = current.next;
				current.next = previous;
				previous= current;
				current = temp;
				
				
			}
			return previous;
		}
	}
	//main method
	public static void main(String[] args) {
		
		//creating object of Node class
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		
		//calling reverse method
		Node reverse_list =Node.reverse(head); //store reverse linked list
		
		//printing values of singly linked list
		while(reverse_list!=null) {
			System.out.print(reverse_list.data+" ");
			reverse_list = reverse_list.next;
		}
		
		
	}

}

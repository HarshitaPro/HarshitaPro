package practice_question;

public class LinkedList_add {
	
	public static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data= data;
			this.next=null;
		}
		
		public static Node addlast(Node head,Node latest) {
			
			Node curr = head;
			while(curr.next!=null) {
				curr= curr.next;
				
			}
			
			curr.next = latest;
			
			return head;
		}
		
		
		//finding middle node of linkedlist
		
		public static Node middle(Node head) {
			
			Node slow = head;
			Node fast = head;
			while(fast!=null && fast.next!=null) {
				slow= slow.next;
				fast= fast.next.next;
				
			}
			
			return slow;
		}
		
		public static void print(Node head) {
			while(head!=null) {
				System.out.print(head.data+" ");
				head = head.next;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Node head = new Node(1);
		head.next= new Node(2);
		head.next.next= new Node(3);
		head.next.next.next= new Node(4);
		//print original
		System.out.println("original:");
		Node.print(head);
		
		Node n2 = new Node(9); //new node
		//addlast
		Node.addlast(head, n2);
		System.out.println("\nafter adding ");
		Node.print(head);
		//middle node
		Node middle_node = Node.middle(head);
		System.out.println("\nmiddle node: "+ middle_node.data);
		
		
		
		
		
	}

}

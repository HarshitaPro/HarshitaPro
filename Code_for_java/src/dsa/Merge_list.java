package dsa;

public class Merge_list {
	
	public static Node merge(Node n1,Node n2) {
		
		Node dummy = new Node(0);
		Node curr = dummy;
		
		while(n1!=null && n2!= null) {
			if(n1.data <= n2.data) {
				curr.next= n1;
				n1= n1.next;
			}
			else {
				curr.next= n2;
				n2= n2.next;
			}
			
			curr = curr.next;
			System.out.println("curr data"+curr.data);
		}
		
		if(n1!=null) {
			curr.next=n1;
		}
		if(n2!=null) {
			curr.next=n2;
		}
	
		
		
		return dummy.next;
		
	}
	
	
	
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2); //create new Node and link it with head
		head.next.next= new Node(3);
		Node head2 = new Node(4);
		head2.next = new Node(5);
		head2.next.next= new Node(6);
		
		Node me = merge(head,head2);
		me.printNode(me);
		
		
	}
	
	
	
	

}

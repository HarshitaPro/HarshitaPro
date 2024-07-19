package mapInterface_in_java;

public class LinkedList {
	
	Node head;
	
	public static  class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next =null;
		}
		
		
	}
	
	public static LinkedList insert(LinkedList list , int data) {
		Node new_node = new Node(data);
		
		if(list.head==null) {
			list.head=new_node;
		}
		else {
			
			Node last = list.head;
			while(last.next!=null) {
				last= last.next;
			}
		}
		
		return list;
	}
	
	public static void printlist(LinkedList list) {
		Node cuurent = list.head;
		while(cuurent.next!=null) {
			System.out.println(cuurent.data+" ");
			cuurent = cuurent.next;
		}
		
	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll= ll.insert(ll, 1);
		ll= ll.insert(ll, 2);
	   LinkedList.printlist(ll);
		
		
	}
	

}

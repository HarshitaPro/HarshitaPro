package linkedList_problems_dsa;



public class Append_Linkedlist {
	
	//Node class ===singly linkedlist
		public static class Node{
			int data;
			Node next ;
			//constructor 
			Node(int data){
				this.data= data;
				this.next = null;
				}
			
			public static Node append(Node list1, Node list2) {
				Node dummy = new Node(0);// creating a dummy node for append
				Node curr = dummy;
				
				while(list1!=null && list2!=null) {
					
					if(list1.data<=list2.data) {
						curr.next = list1;
						list1= list1.next;
					}
					else {
						curr.next=list2;
						list2= list2.next;
					}
					curr = curr.next;
				}
				
				
				if(list1!=null) {
					curr.next=list1;
				}
				if(list2!= null) {
					curr.next= list2;
				}
				
				
				return dummy.next;
				
			}

		}
		public static void main(String[] args) {
		//creating list1 
			Node list1 = new Node(1);
			list1.next= new Node(2);
			list1.next.next = new Node(3);
			
			//creating list2
			Node list2 = new Node(4);
			list2.next = new Node(5);
			list2.next.next = new Node(6);
			
			Node append_list = Node.append(list1, list2); //creating node to store append list
			//printing append list
			while(append_list!=null) {
				System.out.print(append_list.data+" ");
				append_list = append_list.next;
			}
		}
}

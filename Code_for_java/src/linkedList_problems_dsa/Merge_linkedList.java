package linkedList_problems_dsa;


public class Merge_linkedList {
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
					}
		
		public static void print(Node head) {
			while(head!=null) {
				System.out.println(head.data);
				head= head.next;
			}
		}
		
		public static Node merge(Node list1,Node list2) {
			
			Node current= new Node(0);
			Node tail = current;
			
			while(list1!=null && list2!=null) {
				
				if(list1.data <= list2.data) {
					
					tail.next=list1;
					list1= list1.next;	
				}
				else {
					tail.next= list2;
					list2 = list2.next;
					
				}
				tail = tail.next;
				
			}	
			
				
				if(list1!=null) {
					tail.next= list1;
					
					
				}
				if(list2!=null)
				{
					tail.next= list2;
					
				}
				
				
			return current.next;
			
					
			
		}
		
		public static Node findmiddle(Node head) {
			Node slow = head;
			Node fast = head;
			
			while(fast!=null&& fast.next!=null) {
				slow= slow.next;
				fast=fast.next.next;
				
			}
			
			return slow;
		}
		
		public static Node deletemiddle(Node head) {
			
			Node slow = head;
			Node pre= null;
			Node fast = head;
			while(fast!= null&& fast.next!=null) {
				
				pre = slow;
				System.out.println("pre:"+pre.data);
				fast = fast.next.next;
				slow= slow.next;
				System.out.println("slow:"+slow.data);
			}
			
			pre.next= slow.next;
			return head;
		
			
		}
		
		public static Node deletelast(Node head) {
			Node curr = head;
			Node pre = null;
			while(curr.next!=null) {
			pre = curr;
			curr = curr.next;	
		}
		  pre.next =null;
		  return head;
		}
		
		public static Node reverse(Node head) {
			
			Node curr = head;
			Node pre= null;
			while(curr!=null) {
				Node temp = curr.next;
				curr.next=pre;
				pre= curr;
				curr=temp;
			}
			
			return pre;
			
			
			
		}
		
		public static Node rotate(Node head,int k) {
			
			Node curr = head;
			if(curr==null||k==0||curr.next==null) {
				return head;
				
			}
			int length=0;
			while(curr!=null) {
				length++;
				curr= curr.next;
			}
			if(k==length) {
				return head;
			}
			if(k>length) {
				k= k%length;
			}
			curr= head;
			for(int i=1; i<length-k;i++) {
				curr= curr.next;
			}
			Node newhead = curr.next;
			curr.next=null;
			
			Node tail = newhead;
			while(tail.next!=null) {
				tail= tail.next;
			}
			tail.next = head;
			
			return newhead;
			
			
		}
		
		public static void main(String[] args) {
			Node head = new Node(1);
			head.next = new Node(2);
			head.next.next= new Node(3);
			
			Node head2 = new Node(4);
			head2.next= new Node(5);
			head2.next.next = new Node(6);
			
			Node merge = merge(head,head2);
			
		/**	print(merge);
			Node middle = findmiddle(merge);
			System.out.println("middle element :"+middle.data);
			
			Node afterdelete=deletelast(merge);
			System.out.println("after deleteing");
			print(afterdelete);
			Node reverse_node = reverse(merge);
			System.out.println("reverse:");
			print(reverse_node);**/
			
			
			Node n = rotate(merge,3);
			print(n);
			
			
		
			
		}
	}

}

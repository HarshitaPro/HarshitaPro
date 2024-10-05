package dsa;

class ListNode{
	
	int val;
	ListNode next;
	ListNode(int val){
		this.val= val;
		this.next= null;
	}
	
	
//	public void add(ListNode head,int val) {
//	     while(head.next==null) {
//		head.next=new ListNode(val);
//		
//	}
//	}
	public void printList(ListNode head) {
		while(head!=null) {
			System.out.print(head.val+" ");
			head=head.next;
		}
	}
	
	public int size(ListNode head) {
		int count=0;
		while(head.next!=null) {
			count++;
			head = head.next;
		}
		return count;
		
	}
	
	
	public ListNode reverse(ListNode head ,int start,int end) {
		
		ListNode curr = head;
		ListNode previous = null;
		while(start<end) {
			
			ListNode temp = curr.next;
			curr.next = previous;
			previous = curr;
			System.out.println("pre:"+previous.val);
			curr= temp;
			System.out.println("curr:"+curr.val);
			start++;
			end--;
		}
		
		
		return previous;
	
	}

	
}
public class Rotate_List {
	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next= new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next= new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next .next.next= new ListNode(7);
		//head.printList(head);
		int size = head.size(head);
		System.out.println(size);
		ListNode head2 = head.reverse(head, 0, size);
		head2.printList(head2);
		
		
		
	}

}

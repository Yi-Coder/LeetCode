package Solution201_250;

public class Solution206 {
	
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	   public ListNode reverseList(ListNode head) {
		   
		   if(head== null) return null;
		   
		   ListNode tail = head;
		   ListNode pointer = head;
		   
		   while(tail.next != null){
			   tail = tail.next;
		   }
		   
		   
		   ListNode tmp = null;
		   while(pointer != tail){
			   tmp = pointer.next;
			   
			   pointer.next = tail.next;
			   tail.next = pointer;
			   pointer = tmp;
			   
		   }
		   
		   return tail;
		    
	    }

}

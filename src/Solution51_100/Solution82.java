package Solution51_100;

import java.util.List;

public class Solution82 {
	   public ListNode deleteDuplicates(ListNode head) {
		   
		   if(head == null ) return null;
		   
		   if(head.next == null) return head;
		   
		   ListNode newhead = head;
		   
		   if(head.next.val == head.val){
			   
			   while(head.next.val == head.val){
				   head = head.next;
				   
				   if(head.next == null) return null;
			   }			   
			   newhead = head.next;	
			   
			   return deleteDuplicates(newhead);
		   } else{	   
			  head.next = deleteDuplicates(head.next);
			  return head;
		   }

	    }

}

package Solution51_100;

public class Solution86 {
	
	   public ListNode partition(ListNode head, int x) {
		   
		   if(head == null ) return null;
		   if(head.next == null) return head;

		   ListNode cur = head;
		   		   
		   ListNode res = new ListNode(0);
		   res.next = head;
		   
		   ListNode pre = res;
		   
		   ListNode right = new ListNode(0);
		   
		   right.next = null;
		   ListNode righttail = right;
		   
		   while(cur != null){		   
			   if(cur.val< x){
				   cur = cur.next;
				   pre=pre.next;
			   }else{
				   
				   pre.next = cur.next;
				   cur.next = null;
				   
				   righttail.next = cur;				   
				   righttail = righttail.next;
				   
				   cur = pre.next;
				   
			   }
			   
		   }
		   
		   
		   if(right.next != null){
			   pre.next = right;
		   }
		   return res.next;
	        
	    }

}

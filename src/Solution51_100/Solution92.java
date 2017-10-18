package Solution51_100;

import java.awt.HeadlessException;
import java.lang.Thread.State;
import java.util.List;

public class Solution92 {

	   public static ListNode reverseBetween(ListNode head, int m, int n) {
		   
		   if(m == n ) return head;
		   
		   ListNode pre = null;
		   ListNode cur = head;
		   ListNode next = cur.next;
		   
		   ListNode start = null;
		   ListNode end = null;
		   
		   int i = 1;
		   while(i<m){
			   pre = cur;
			   cur = cur.next;
			   next = cur.next;
			   start = pre;
			   end = cur;
			   i++;
			   
		   }
		   
		   while(i<=n && cur != null){
			   //System.out.println(cur.val);
			   cur.next = pre;
			   pre = cur;
			   cur = next;
			   if(cur != null) next = cur.next;
			   i++;
		   }
		   
		   
		   //System.out.println(start.val);
		  // System.out.println(end.val);
		
		   
		   if(start != null && end!= null){
			   start.next = pre;
			   end.next = cur;
			   return head;
		   }else if(cur == head){
			   return head;
		   } else{
			   head.next = cur;
			   return pre;
		   }
		
		   
		   
	        
	    }

}

package Solution101_150;

public class Solution147 {
	
	  public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		 }
	
	   public ListNode insertionSortList(ListNode head) {
		   
		   if(head == null) return null;
		   if(head.next == null) return head;
		   
		   ListNode dump = new ListNode(-1);
		   dump.next = head;
		   
		   ListNode pre = dump;
		   ListNode tail = pre.next;
		   
		   int count = 0;
		   while(tail!= null){
			   tail = tail.next;
			   count++;
		   }
		   
		   ListNode cur = dump.next;
		   
		   ListNode min = cur;
		   ListNode minPre = pre;
		   
		   ListNode walker = pre;
		   
		   
		   for(int i = 0;i<count;i++){
			   while(walker.next != null){
				   if(walker.next.val<min.val){
					   minPre = walker;
					   min = walker.next;
				   }
				   walker = walker.next;
			   } 
			   if(min != cur){
				   	minPre.next=min.next;
				   	min.next = pre.next;
				   	pre.next = min;
			   }
			   pre = pre.next;
			   cur = pre.next;
			   minPre = pre;
			   min = cur;
			   walker = pre;
		   }
		   
		   return dump.next;
	        
	    }

}

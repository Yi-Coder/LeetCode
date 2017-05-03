package Solution51_100;

public class Solution61 {
	  public ListNode rotateRight(ListNode head, int k) {
		  
		  if(k == 0 || head == null) return head;
		  
		  ListNode right = head;
		  ListNode left = head;
		  
		  int len = 1;
		  
		  while(right.next != null){
				  len++;
				  right = right.next;
		  }
		  right.next = head;
		  
		  int temp = k % len;
		  
		int count =1 ;
		
		while(count < len - temp){
			left = left.next;
			count++;
		}
		head = left.next;
		left.next = null;
		
		while(head != null){
			System.out.println(head.val);
			head = head.next;
		}
		
		  return head;
	        
	    }

}

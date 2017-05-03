public class Solution24 {
	
	
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	  
	  
	  public ListNode swapPairs(ListNode head) {
		  return reverseKGroup(head,2);
	    }

	
	 public ListNode reverseKGroup(ListNode head, int k) {
	    	
	    	if(head == null) return head;
	   
	    	if(k <= 1) return head;
	    	
	    	ListNode start = head;
	    	ListNode end = start;
	    	ListNode prestart = new ListNode(Integer.MAX_VALUE);
	    	ListNode preend = new ListNode(Integer.MAX_VALUE);
	    	
	    	ListNode temp = null;
	    	
	    	prestart.next = start;
	    	preend.next = end;
	    	
	    	int count = 0;
	    	
	    	boolean flag = false;
	    	
	    	while(end != null){
	    		
	    		if(count == k-1){	
	    			if(flag == false){
	    				flag = true;
	    				
	    				prestart.next = end;
	        			preend.next = start;
	        			
	        			temp = start.next;
	        			
	        			start.next = end.next;
	        			end.next = temp;
	        			
	        			head = prestart.next;
	        			
	        			prestart = start;
	        			preend = prestart;
	        			start = prestart.next;
	        			end = start;
	        			
	        			

	        		}else{
	        			prestart.next = end;
	        			preend.next = start;
	        			
	        			temp = start.next;
	        			
	        			start.next = end.next;
	        			end.next = temp;
	        			
	        		
	        			
	        			prestart = start;
	        			preend = prestart;
	        			start = prestart.next;
	        			end = start;		
	        		}
	    			count = 0;
	    			
	    		}else{
	    			preend = preend.next;
	    			end = preend.next;
	    			count++;
	    		}
	    	}    	
	    	return head;       
	    }
}

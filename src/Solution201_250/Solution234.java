package Solution201_250;

import java.util.List;

public class Solution234 {
	
	  public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
    public boolean isPalindrome(ListNode head) {
    	if(head == null ) return true;
    	if(head.next == null) return true;
    	if(head.next.next == null) return ((head.val) ^ (head.next.val)) == 0;
    	
    	ListNode walker = head;
    	ListNode runner = head;
    	ListNode mid = head;
    	
    	
        while(runner != null &&  runner.next!= null ){
        	mid = mid.next;
        	runner = runner.next.next;
        }
        
        ListNode half = reverse(mid);
        
        while(half != null){
        	if(half.val == walker.val){
        		half = half.next;
        		walker = walker.next;
        	}else return false;
        }
        
        return true;
        
    
    }
    
    public ListNode reverse(ListNode n){
    			
    	ListNode pre = null;
    	ListNode cur = n;
    	ListNode next;
    	
    	while(cur != null){
    		next = cur.next;
    		cur.next = pre;
    		pre = cur;
    		cur = next;
    	}  	
    	return pre;
    }

}

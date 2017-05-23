package Solution101_150;



public class Solution142 {
	
	 class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
	 }
	
    public ListNode detectCycle(ListNode head) {
    	
    	if(head == null) return null;
    	
    	ListNode slow = head;
    	
    	ListNode fast = head;
    	
    	boolean flag = false;
    	
    	while(fast.next != null && fast.next.next != null){ // do not use slow.next!!!
    		 fast = fast.next.next;
    		slow = slow.next;
    		
    		if(fast == slow) {
    			flag = true;
    			break;
    			};
    	}
    	ListNode pointer = head;
    	
    	if(flag == false) return null;
    	while(pointer != fast){
    		pointer = pointer.next;
    		fast = fast.next;
    	}
    	
    	return pointer;
    	
    }
    
    
    public boolean hasCycle(ListNode head) {
    	
    	if(head == null) return false;
    	
    	ListNode slow = head;
    	
    	ListNode fast = head;
    	
    	while(fast.next != null && fast.next.next != null){ // do not use slow.next!!!
    		 fast = fast.next.next;
    		slow = slow.next;
    		
    		if(fast == slow) return true;
    	}
    	
    	return false;
        
    }

}

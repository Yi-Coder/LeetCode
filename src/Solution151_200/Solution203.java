package Solution151_200;

public class Solution203 {
	
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
    public ListNode removeElements(ListNode head, int val) {
    	
    	ListNode dump = new ListNode(0);
    	
    	dump.next = head;
    	
    	ListNode temp = dump;
    	
    	while(temp != null){
    		
    		if(temp.next.val != val){
    			temp = temp.next;
    		}else{
    			temp.next = temp.next.next;
    		}
    	}
    	return dump.next;
        
    }

}

import java.util.ArrayList;

public class Solution23 {
	
	  public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	  
    public ListNode mergeKLists(ListNode[] lists) {
    	
    	if(lists == null) return null;
 
    	int len = lists.length;
    	if(len == 0) return null;
    	ListNode ln = null;
  
    	
    	if(len == 1) return lists[0];
    	
    	if(len % 2 ==0){
    	  	ListNode[] temp = new ListNode[len/2];
    		for(int i = 0; i<len; i = i+2)
    		{
    			ln = mergeTwoLists(lists[i],lists[i+1]);
    			temp[i/2] = ln;
    		}
    		 ln = mergeKLists(temp);
    	}else{
    			ListNode[] temp = new ListNode[len/2];
        		for(int i = 0; i<len-2; i = i+2)
        		{
        			ln = mergeTwoLists(lists[i],lists[i+1]);
        			temp[i/2] = ln;
        		}
        		
        		 temp[(len/2)] = lists[len-1];
        		
        		 ln = mergeKLists(temp);
    		
    	}
 
    		return ln;
        
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

      	if(l1 == null)  return l2;
    	if(l2 == null)  return l1;

    	ListNode head = null;
    	
    	ListNode curNode = null;
    	ListNode temp = null;
    	head = l1.val<l2.val? l1:l2;
    	 
    	 curNode = head;
    	 
    	 if(curNode.next == null && curNode == l1){
    		 
    		 curNode.next = l2;
    			return l1;
    	 }
    	 
    	 if(curNode.next == null && curNode == l2){
    		 
    		 curNode.next = l1;
    			return l2;
    	 }
	 
  	while(l1 != null&& l2 != null){
    		if(l1.val<l2.val){
    			temp = curNode;
    			curNode = l1;	
    			l1 = l1.next;
    			temp.next =  curNode;
    			
    		}else{
    			temp = curNode;
    			curNode = l2;
    			l2 = l2.next;
    			temp.next =  curNode;
    			
    		}
    	}
    	
   	 
   	if(l1 == null) {
   		curNode.next = l2;
   		
   		}
   	
   	if(l2 == null) {
   		curNode.next = l1;
   		}
   	
    return head;
    
    
}

}

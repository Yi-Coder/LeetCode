import javax.print.attribute.standard.RequestingUserName;

public class Solution21 {
	
	 public class ListNode {
		     int val;
		      ListNode next;
		     ListNode(int x){ val = x;
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
}

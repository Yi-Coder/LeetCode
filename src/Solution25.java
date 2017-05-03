import java.util.ArrayList;
import java.util.List;

public class Solution25 {
  	ListNode listhead = null;
  	boolean flag = false;
    public ListNode reverseKGroup(ListNode head, int k) {

    	if( head == null || k <= 1) return head;
    	
    	if(head.next == null) return head;
    	

    	ListNode start = head;  	
   	
    	int count = 0;
 
    	while(head != null){
    		//System.out.println(end.val);
    			if(count == k-1){
    				ListNode temp = head.next;
    				head.next = null;
    				if(flag == false){
    					flag = true;
    					 listhead = head;	
    				}
    				reserveList(start, head);		
    				count = 0;
    				start.next = reverseKGroup(temp,k);
    				return head;
    				
    			}else{
    				count++;
    				head = head.next;
    				if(count <= k-1 && head == null) {
    					return start;
    				}
    			}		
    	} 
    		return listhead;
    }
    
    
    
    public void reserveList(ListNode head, ListNode tail){ 	
    	if(head == null || head.next == null) return;
    	
    	if(head.next.next == null){
    		head.next.next =head;
    		head.next = null;
    		return;
    	}

    	ListNode precur = head;
    	ListNode cur = head.next;
    	ListNode post = cur.next;  
    	
    	while(precur != tail){
    		if(precur == head)  precur.next = null;
       		cur.next = precur;
    		precur = cur;
    		cur = post;
    		if(cur != null){
    		post = cur.next;
    		}
    	}
    }
   
}

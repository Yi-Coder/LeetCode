import java.awt.dnd.DnDConstants;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Templates;

public class Solution19 {
	
	  public class ListNode {
		     int val;
		      ListNode next;
		      ListNode(int x) { val = x; 
		      }
		      }

	     public ListNode removeNthFromEnd(ListNode head,int n) {
	    	 
	    	 ArrayList <Integer> l = new ArrayList<Integer>();
	            
	            while( head!=null)
	            {
	                l.add(head.val);
	                head = head.next;
	            }
	            l.remove(l.size()-n+1);
	            
	            ListNode node = new ListNode(l.get(0));
	    		ListNode head1 = node;
        		ListNode temp = node;
	            
	            for(int i = 1;i < l.size();i ++)
	            {
	            	ListNode node1 = new ListNode(l.get(i));      	
	            	temp.next = node1;
	            	temp = node1;
	            }
	    	 
	    	 
	    	/* ListNode node1 = new ListNode(1);
	    	 ListNode node2 = new ListNode(2);
	    	 ListNode node3 = new ListNode(3);
	    	 ListNode node4 = new ListNode(4);
	    	 ListNode node5 = new ListNode(5);
	    	 node1.next = node2;
	    	 node2.next = node3;
	    	 node3.next = node4;
	    	 node4.next = node5;
	    	 
	    	 ListNode head = node1;*/
	     	
	     	if(n<=0) return head;
	     	
	     	if(head == null) return null;
	     	
	     	if(head.next == null) return null;
	     		
	     	 int count = 0;
	     	 ListNode curNode = head;
	     	 ListNode deNode = null;
	     	 
	     	while(curNode!= null){
	     		    		
	     		if(count == n){
	     			
	     			if(deNode == null){
	     				deNode = head;
	     			}else{
	     				deNode = deNode.next;
	     			}
	     		}else{
	     			count++;
	     		}
	     		
	     		curNode = curNode.next;	 
	     	}
	     	
	      	if(deNode == null){
	     			return head.next;
	     	}
	 	
	     	if(deNode == head){
	     		//System.out.println(t.val);
	     		if(n == 1){
	     			head.next = head.next.next;
				    return head;
	     		}else{
	     			deNode.next = deNode.next.next;
	     			return deNode;
	     		}	
	     	}
	     	
	     	deNode.next = deNode.next.next;

	     	return head;
	  
	     }
}

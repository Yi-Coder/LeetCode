package Solution151_200;

import Solution151_200.Solution203.ListNode;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	int lengtha = 0;
    	int lengthb = 0;
    	ListNode c = headA;
    	while(c!= null){
    		lengtha++;
    		c = c.next;
    	}
    	 c = headB;
    	while(c!= null){
    		lengthb++;
    		c = c.next;
    	}
    	
    	int diff = lengtha>lengthb?lengtha -lengthb:lengthb-lengtha;
    	
    	if(lengtha>lengthb){
    		ListNode temp1 = headA;
    		for(int i =0;i<diff;i++){
    			temp1 = temp1.next;
    		}
    		ListNode temp2 = headB;
    		while(temp1!=null && temp2 != null){
    			if(temp1 == temp2) return temp1;
    			else{
    				temp1 = temp1.next;
    				temp2 = temp2.next;
    			}
    		}
    		
    	}else{
    		
    		ListNode temp1 = headB;
    		for(int i =0;i<diff;i++){
    			temp1 = temp1.next;
    		}
    		ListNode temp2 = headA;
    		while(temp1!=null && temp2 != null){
    			if(temp1 == temp2) return temp1;
    			else{
    				temp1 = temp1.next;
    				temp2 = temp2.next;
    			}
    		}
    		
    	}
    	return null;
        
    }

}

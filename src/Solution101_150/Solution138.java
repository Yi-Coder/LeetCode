package Solution101_150;

 class RandomListNode {
	      int label;
	     RandomListNode next, random;
	      RandomListNode(int x) { this.label = x; }
	  };

public class Solution138 {
	
	 public RandomListNode copyRandomList(RandomListNode head) {
		 if(head == null) return null;
		 
		 RandomListNode temp = head;	 
		 RandomListNode newhead = new RandomListNode(head.label);
		 newhead.next = head.next;
		 
		 while( temp.next != null){
			 RandomListNode temp1 = new RandomListNode(temp.label);
			 temp1.next = temp.next;
			 temp1.random = temp.random;
			 temp = temp.next;
		 }
	       return temp; 
	    }

}

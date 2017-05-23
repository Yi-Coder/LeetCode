package Solution101_150;



public class Solution109 {
	
	 class ListNode {
		     int val;
		     ListNode next;
		    ListNode(int x) { val = x; }
		 }
	 
	 
	  public TreeNode sortedListToBST(ListNode head) {
		  
		  if(head == null) return null;
		  if(head.next == null) return new TreeNode(head.val);
	        
		  ListNode slow = head;
		  ListNode fast = head;
		  
		  ListNode pre = new ListNode(-1);
		  pre.next = slow;
		  while(fast != null && fast.next != null){
			  slow = slow.next;
			  fast = fast.next.next;
		  }
		TreeNode root = new TreeNode(slow.val);
		pre.next = null;
		root.left = sortedListToBST(head);
	    root.right = sortedListToBST(slow.next);
	    return root;
			  
		  }
		  
		
		  
		  
	    }

}

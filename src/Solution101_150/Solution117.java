package Solution101_150;


public class Solution117 {
	
		   public void connect(TreeNode root) {		   
		   if(root == null) return;
		  
		   TreeNode uplevel = root;
		   
		   while(uplevel != null){
			TreeNode leftmost = uplevel;
			   while(leftmost != null){
				   TreeNode next = findleft(leftmost.next);
				   
				   if(leftmost.right != null){
					   leftmost.right.next = next;
					   next = leftmost.right;
				   }
				   
				   if(leftmost.left != null){
					   leftmost.left.next =next;
				   }
				   
				   leftmost = leftmost.next;
			   }
			  uplevel = findleft(uplevel);
		   }
		   
	    }
		   
	public TreeNode findleft(TreeNode root){
		if(root == null) return null;
		
		if(root.left != null) return root.left;
		if(root.right != null) return root.right;
		return findleft(root.next);

	}

}



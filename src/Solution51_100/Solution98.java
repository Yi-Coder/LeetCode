package Solution51_100;

public class Solution98 {
	  public boolean isValidBST(TreeNode root) {
	
	    	  	return isbst(root, Long.MIN_VALUE, Long.MAX_VALUE);
		        
		    }
		  
		  public boolean isbst(TreeNode root, long min , long max){
			  
			  if(root == null ) return true;
			  
			 if(root.val<=min || root.val>=max) return false;
			  
			 boolean left =   isbst(root.left, min, root.val);
			  
			 boolean right =   isbst(root.right, root.val, max);
			 
			 return left && right;
		  }

}

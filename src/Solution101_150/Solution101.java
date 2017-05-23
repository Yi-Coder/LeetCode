package Solution101_150;

public class Solution101 {
	
	  public boolean isSymmetric(TreeNode root) {
		  
		  if(root == null) return true;
		  
		  else return issame(root.left, root.right);
	        
	    }
	  
	  public boolean issame(TreeNode p, TreeNode q){
		  
	    	if(p == null && q == null) return true;
	    	
	    	if(p == null && q != null || p !=null && q == null) return false;

	    	if(p.val != q.val) return false;
	    	else return issame(p.left,q.right) && issame(p.right, q.left);
		  
	  }


}

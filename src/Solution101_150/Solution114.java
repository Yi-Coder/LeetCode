package Solution101_150;

public class Solution114 {
	
	   public void flatten(TreeNode root) {
		   flat(root);
	
	    }
	   
	   public TreeNode flat(TreeNode root){
		   if(root == null) return null;
		   
			TreeNode lefttail = flat(root.left);
			TreeNode righttail = flat(root.right);
			  
		   if(root.left != null) {
			  lefttail.right = root.right;
			  root.right = root.left;
			  root.left= null;
		   }
		   	
		   if(righttail != null) return righttail;
		   
		   if(lefttail != null) return lefttail;

		   return root;
 
	   }

}

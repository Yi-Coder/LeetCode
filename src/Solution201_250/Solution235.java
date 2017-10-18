package Solution201_250;

import java.util.List;

public class Solution235 {
	
	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		 }
	
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

    	if(root.val > p.val && root.val > q.val)  return lowestCommonAncestor(root.left, p, q);
    	else if(root.val < p.val && root.val < q.val)  return  lowestCommonAncestor(root.right, p, q);
    	else return root;
 
    }
    
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
    	
    		if(root == null || root.val == p.val || root.val == q.val) return root;
    		TreeNode left =null;
    		TreeNode right = null;
    		if(p.left != null )  left = lowestCommonAncestor2(root.left,p,q);
    		
    		if(p.right != null )  right = lowestCommonAncestor2(root.right,p,q);
    		
    		if( left != null &&  right != null) return root;
    		
    		return left != null? left:right;
   
        
    }
    
    public void findpath(TreeNode root, TreeNode p, List<TreeNode> path){
    	
   
    	
    }

}

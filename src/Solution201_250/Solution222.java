package Solution201_250;

public class Solution222 {
	
	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		     TreeNode(int x) { val = x; }
		  }
	 
    public int countNodes(TreeNode root) {
    	
    	if(root == null) return 0;
        
    	int lefth = 0; int righth = 0;
    	
    	TreeNode left = root;
    	TreeNode right = root;
    	
    	while(left != null){
    		lefth++;
    		left = left.left;
    	}
    	
    	while(right != null){	
    		righth++;
    		right=right.right;
    		}
    	
    	if(lefth == righth)  return (1<<lefth)-1;
    	
    	return countNodes(root.left) + countNodes(root.right) + 1;
    	
    }
}

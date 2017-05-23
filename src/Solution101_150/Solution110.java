package Solution101_150;

public class Solution110 {
	
    public boolean isBalanced(TreeNode root) {
    	
    	if(root== null) return true;
    	
    	int lheight = height(root.left);
    	int rheight =  height(root.right);
    	
    	if(Math.abs(lheight-rheight)>1) return false;
    	else return isBalanced(root.left)&&isBalanced(root.right);
    	
    }
    
    public int height(TreeNode root){
    	if(root == null ) return 0;
    	
    	return Math.min( height(root.left), height(root.right))+1;

    }

}

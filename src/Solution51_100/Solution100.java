package Solution51_100;

public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	
    	if(p == null && q == null) return true;
    	
    	if(p == null && q != null || p !=null && q == null) return false;

    	if(p.val != q.val) return false;
    	else return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
        
    }
}

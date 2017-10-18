package Solution201_250;

import java.util.Stack;

public class Solution230 {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
    public int kthSmallest(TreeNode root, int k) {
      
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	TreeNode p = root;
    	int count = 0;	
    	while(!stack.isEmpty() || p!=null){
    		 if(p.left != null){
    			stack.push(p);
    			p = p.left;
    		}else {
    			TreeNode node= stack.pop();
    			count++;
    			if(count==k) return node.val;
    			p = node.right;
    		}
    	}
    	
    	return Integer.MIN_VALUE;
    	
    }

}

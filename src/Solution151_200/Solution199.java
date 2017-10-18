package Solution151_200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution199 {
	
	
	
	   public List<Integer> rightSideView(TreeNode root) {
		   List<Integer> result = new ArrayList<Integer>();
		   
		   if(root == null) return result;
		   
		   Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
		   Queue<TreeNode> queue2 = new LinkedList<TreeNode>();

		   queue1.add(root);
		   	   
		   while(!queue1.isEmpty()){
			   
			   if(queue1.size() == 1) result.add(queue1.peek().val);
			   if(queue1.peek().left != null) queue2.add(queue1.peek().left);
			   if(queue1.peek().right != null) queue2.add(queue1.peek().right);
			   queue1.poll();
			   
			   if(queue1.isEmpty()){
				   queue1 = new LinkedList<TreeNode>(queue2);
				   queue2.clear();
			   }
   
		   }
		   
		   return result;
	        
	    }

}

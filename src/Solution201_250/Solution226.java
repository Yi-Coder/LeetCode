package Solution201_250;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.xml.transform.Templates;

public class Solution226 {
	
	 public class TreeNode {
		      int val;
		     TreeNode left;
		     TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	   public TreeNode invertTree(TreeNode root) {
		   if(root == null ) return null;
		   
		   if(root.left == null && root.right == null) return root;
		   
		   Queue<TreeNode> queue = new LinkedList<TreeNode>();
		   queue.add(root);
		   
		   while(!queue.isEmpty()){
			   TreeNode top = queue.poll();
			   TreeNode tmp = top.left;
			   top.left = top.right;
			   top.right = tmp;
			   if(top.left != null) invertTree(top.left);
				if(top.right != null) invertTree(top.right);
		   }
		   return root;
		   
	    }
	   
	    public List<String> binaryTreePaths(TreeNode root) {
	    	
	    	if(root == null) return null;
	    	List<String> result = new ArrayList<String>();
	    	
	    	Stack<TreeNode> stack = new Stack<TreeNode>();
	    	 Stack<String> path=new Stack<String>();
	    	
	    	stack.push(root);
	    	
	   
	    	
	    	while(!stack.isEmpty()){
	    		TreeNode top = stack.pop();
	    		String top_string = path.pop();
	    		if((top.left == null && top.right == null)){
	    			result.add(top_string+String.valueOf(top.val));
	    		} 
	    		
	    		if(top.left != null){
	    			stack.add(top.left);
	    			path.push(top_string+String.valueOf(top.val)+"->");
	    		} 
	    		if(top.right != null){
	    			stack.add(top.right);
	    			path.push(top_string+String.valueOf(top.val)+"->");
	    		} 
	    
	    	}
	    	
	    	return result;
	    	
	        
	    }

}

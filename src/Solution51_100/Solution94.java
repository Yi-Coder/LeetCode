package Solution51_100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
    	
    	List<Integer> result = new ArrayList<Integer>();
    	
    	Stack<TreeNode> stack = new Stack<TreeNode>();  	
    	TreeNode current = root;
    	
    	while(current != null || !stack.isEmpty()){
  
    			while(current != null){
    				stack.push(current);
    				current = current.left;
    			}
    			
    			if(!stack.isEmpty()){
    				current = stack.pop();
    				result.add(current.val);
    				current = current.right;
    			}
    			
    			
    		}
    

    	return result; 
    }

}

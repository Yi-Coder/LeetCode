package Solution101_150;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	
    	int h = height(root);
    	
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	
    	for(int i = 1; i<= h ; i++){
    		List<Integer> eachlevel = new ArrayList<Integer>();
    		traverselevel(root, i, eachlevel);
    		result.add(eachlevel);
    	}
    	return result;
        
    }
    
    public void traverselevel(TreeNode root, int level, List<Integer> eachlevel){
    	if(root == null) return;
     	if(level == 1) eachlevel.add(root.val);
     	if(level >1){
     		traverselevel(root.left,level-1,eachlevel);
     		traverselevel(root.right,level-1,eachlevel);	
     	}
  	
    }
    
    public int height(TreeNode root){
    	if(root == null ) return 0;
    		
    	int lheight = height(root.left);
    	int rheight = height(root.right);

    	if(lheight>rheight) {
    		return lheight+1;
    	} else {
    		return rheight+1;}

    }
    
    public List<List<Integer>> traversewithoutrecursion(TreeNode root){

    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	
    	Stack<TreeNode> queue1 = new Stack<TreeNode>();
    	
    	Stack<TreeNode> queue2 = new Stack<TreeNode>();
 
    	if(root == null) return result;
    	
    	queue1.push(root);
    	
    	while(!queue1.isEmpty() || !queue2.isEmpty()){
    		
    		if(!queue1.isEmpty() && queue2.isEmpty()){
    			List<Integer> temp1 = new ArrayList<Integer>();
    			System.out.println(queue1.peek().val);
    			while(!queue1.isEmpty()){
    				TreeNode cur = queue1.pop();
    				temp1.add(cur.val);
    				if(cur.left != null) queue2.push(cur.left);
    				if(cur.right != null) queue2.push(cur.right);	
    				
    			}
    			result.add(temp1);
    		}
    		
    		if(queue1.isEmpty() && !queue2.isEmpty()){
    			List<Integer> temp2 = new ArrayList<Integer>();
    			while(!queue2.isEmpty()){
    				TreeNode cur = queue2.pop();
    				temp2.add(cur.val);
    				if(cur.right != null) queue1.add(cur.right);	
    				if(cur.left != null)  queue1.add(cur.left);
    				
    			}
    			result.add(temp2);
    		}

    	}
    	
    	return result;
    	
    }

}

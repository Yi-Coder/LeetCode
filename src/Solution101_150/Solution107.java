package Solution101_150;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
 	
    	int h = height(root);
    	
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	
    	for(int i = 1; i<= h ; i++){
    		List<Integer> eachlevel = new ArrayList<Integer>();
    		traverselevel(root, i, eachlevel);
    		result.add(0,eachlevel);
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

}

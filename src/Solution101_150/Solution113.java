package Solution101_150;

import java.util.ArrayList;
import java.util.List;

public class Solution113 {
	   public List<List<Integer>> pathSum(TreeNode root, int sum) {
		   List<List<Integer>> result = new ArrayList<List<Integer>>();
		   List<Integer> path = new ArrayList<Integer>();
		   findpath(root,sum,path,result);
		   return result;
	        
	    }
	   
	   public void findpath(TreeNode root, int sum, List<Integer> path, List<List<Integer>> result ){
		   if(root == null) return;		    
		   if(root.left == null && root.right == null){
			   if(root.val == sum){
				   path.add(root.val);
				   result.add(new ArrayList<Integer>(path));
				   path.remove(path.size()-1);
				   return;
				}
		   }else{
			   if(root.left != null) {
				   path.add(root.val);
				   findpath(root.left, sum-root.val, path, result);
				   path.remove(path.size()-1);
			   }
			   if(root.right != null) {
				   path.add(root.val);
				   findpath(root.right, sum-root.val, path, result );
				   path.remove(path.size()-1);
			   }			   
			   //if(!path.isEmpty())  path.remove(path.size()-1);
		   }
		   
	   }
}

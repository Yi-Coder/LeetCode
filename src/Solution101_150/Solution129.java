package Solution101_150;

import java.util.ArrayList;
import java.util.List;



public class Solution129 {
	
    public int sumNumbers(TreeNode root) {   	
    	if(root == null ) return 0;
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	ArrayList<Integer> path = new ArrayList<Integer>();
    	traverse(root,path, result);
    	int finalsum =0;
    	for(List<Integer> temp: result){
    		finalsum += sumtree(temp);
    	}
  
    	return finalsum;
    }
    
    public void traverse(TreeNode root, ArrayList<Integer> path, List<List<Integer>> result){  	
    	if(root == null) return ;
    	path.add(root.val);
    	
    	if(root.left == null && root.right == null){
    		result.add(new ArrayList<Integer>(path));
    	}else {
    		if(root.left != null) traverse(root.left,path,result);
    		if(root.right != null) traverse(root.right,path,result);
    	}  	
    	path.remove(path.size()-1);

    }
    
    public int sumtree(List<Integer> path){
    	int sum = 0;
    	for(int i=0 ; i<path.size();i++){
    		sum += path.get(i)*Math.pow(10, path.size()-i-1);
    	}
    	
    	return sum;
    }

}

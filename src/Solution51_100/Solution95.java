package Solution51_100;

import java.util.ArrayList;
import java.util.List;

public class Solution95 {
	   public List<TreeNode> generateTrees(int n) {
		   
		   if(n<=0) return null;
		   
		   List<TreeNode> result = new ArrayList<TreeNode>();
		   
		   ArrayList<Integer> values = new ArrayList<Integer>();
		   for(int i = 1; i<=n;i++){
			   values.add(i);			   
		   }
		   
		   for(int i=0; i<n;i++){
			   TreeNode root = new TreeNode(values.get(i));
			   TreeNode cur = root;
			   values.remove(i);
			   createTree(values, result, cur, root);
			   
		   }
	   
		  
		   
		   return result;

	    }
	   
	   public TreeNode createTree(ArrayList<Integer> values, List<TreeNode> result, TreeNode cur, TreeNode root){
		   int len = values.size();
		   
		   if(len<=1) return new TreeNode(values.get(0));
		   
		   System.out.println(values.size()+"---");
		   for(int i =0;i<len;i++){
			   System.out.println(i);
			   TreeNode temp = new TreeNode(values.get(i)); 
			   values.remove(i);
			   if(createTree(values,result,temp, root).val < cur.val){
				   
				   cur.left = createTree(values,result,temp,root);
			   }else cur.right = createTree(values,result,temp,root);
			   
			   result.add(root);
		   }
		   
		   return null;
	   }

}

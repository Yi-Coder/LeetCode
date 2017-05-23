package Solution101_150;

public class Solution106 {
	  public TreeNode buildTree(int[] postorder, int[] inorder) {
		   
			 return construct(postorder, 0,postorder.length-1, inorder, 0, inorder.length-1);
		        
		    }
		   
		   
		   public TreeNode construct(int[] postorder, int poststart, int postend, int[] inorder, int instart, int inend){
			   
			   if(postorder.length<=0) return null;
			   
			   TreeNode root = new TreeNode(postorder[postend]);
			   
			   int pivot = findindex(inorder, instart, inend, postorder[postend]);
			   
			   if(pivot == instart) root.left = null;
			   else  root.left = construct(postorder, poststart, postend-inend+pivot-1, inorder, instart, pivot-1);
			   
			   if(pivot == inend) root.right = null;
			   else root.right = construct(postorder, postend-inend+pivot, postend-1, inorder, pivot+1, inend);
	   
			   return root;
		   }
		   
		   
		   
		   public int findindex(int[] inorder ,int start, int end, int target) {
			   
			   for(int i = start ;i <=end ; i++){
				   if(target == inorder[i]) return i;
			   }
			   return start;
		}


}

package Solution101_150;

public class Solution105 {
	
	   public TreeNode buildTree(int[] preorder, int[] inorder) {
		   
		 return construct(preorder, 0,preorder.length-1, inorder, 0, inorder.length-1);
	        
	    }
	   
	   
	   public TreeNode construct(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend){
		   
		   if(preorder.length<=0) return null;
		   
		   TreeNode root = new TreeNode(preorder[prestart]);
		   
		   int pivot = findindex(inorder, instart, inend, preorder[prestart]);
		   
		   if(pivot == instart) root.left = null;
		   else  root.left = construct(preorder, prestart+1, prestart+pivot-instart, inorder, instart, pivot-1);
		   
		   if(pivot == inend) root.right = null;
		   else root.right = construct(preorder, prestart+pivot-instart+1, preend, inorder, pivot+1, inend);
   
		   return root;
	   }
	   
	   
	   
	   public int findindex(int[] inorder ,int start, int end, int target) {
		   
		   for(int i = start ;i <=end ; i++){
			   if(target == inorder[i]) return i;
		   }
		   return start;
	}

}

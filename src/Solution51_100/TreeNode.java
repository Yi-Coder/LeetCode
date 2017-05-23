package Solution51_100;


public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {};
	      TreeNode(int x) { val = x; }
	      
	      public TreeNode createtree(int []nums){
	      	
	      	if(nums.length<=0) return null;
	      	
	      	TreeNode root = new TreeNode(nums[0]);
	      	
	      	for(int i = 1; i <nums.length;i++){
	      		insertNode(root, nums[i]);
	      	}
	      	
	      	return root;
	      	
	      }
	      
	      public void insertNode(TreeNode root, int e){
	      	
	      	if(root.val>e){
	      		if(root.left!=null){
	      			insertNode(root.left, e);
	      		}else root.left = new TreeNode(e);
	      		
	      	}else{
	      		if(root.right!=null){
	      			insertNode(root.right, e);
	      		}else root.right = new TreeNode(e);
	      		
	      	}
	      }

}

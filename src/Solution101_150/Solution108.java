package Solution101_150;

public class Solution108 {
	
    public TreeNode sortedArrayToBST(int[] nums) {
    	int len = nums.length;
    	
    	if(len == 0) return null;
    	return subtree(nums,0,len-1);
    	
    }
    
    public TreeNode subtree(int [] nums, int start, int end){
    	
    	if(start <= end) {
    	
    	int mid = (start+end)/2;
    	
    	TreeNode root = new TreeNode(nums[mid]);
    	
    	//System.out.println(root.val);
    	
    	root.left = subtree(nums, start, mid-1);
    	
    	root.right = subtree(nums, mid+1, end);
    	
     	return root;
    	}else return null;
    	
   
    }

}

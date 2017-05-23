package Solution101_150;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution144 {
	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;

		Stack<TreeNode> stack = new Stack<TreeNode>();

		stack.push(root);

		TreeNode cur;

		while (!stack.isEmpty()) {
			cur = stack.peek();
			if (cur.right != null){
				stack.push(cur.right);
				continue;
			}
			if (cur.left != null){
				stack.push(cur.left);
				continue;
			}
			stack.pop();
			System.out.println(cur.val);
			result.add(cur.val);
		}

		return result;

	}

}

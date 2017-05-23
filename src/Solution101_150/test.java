package Solution101_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution134 so = new Solution134();
		Solution105 s1 = new Solution105();
	  Solution123 so2 = new Solution123();
	  
	  Solution150 so150 = new Solution150();
		
		//String s1 = "ADOBECODEBANC";
		//String s2 = "ABC";
		//String s3 ="aabcabad";
		
		//int [] heights ={0,2,0};
		
		int []prices = {1,2,4,2,5,7,2,4,9,0};
		
		
	    int []pre={5};
	   int []inorder ={4};
		
		//int []nums = {-3,-2,-1,-4};
		
		TreeNode root = s1.buildTree(pre, inorder);
		
		//System.out.println(root.val);
		
		//System.out.println(so2.maxProfit(prices));

		//List<List<Integer>> triangle   = Arrays.asList(
				//Arrays.asList(2),
				//Arrays.asList(3,4)
				//Arrays.asList(6,5,7),
				//Arrays.asList(4,1,8,3)
            //  );
		//temp.traverse(temp);
		
		//String startword = "hit";
		//String endWord ="cog";
		//List<String> wordList=new ArrayList<String>(Arrays.asList("hot","dot","dog","lot","log","cog"));	
		//String s = "A man, a plan, a canal: Panama";
		//System.out.println(so.hammingdistance("cog", "cog"));

		//System.out.println(so.findLadders(startword, endWord, wordList));
		
		String [] tokens = {"4", "13", "5", "/", "+"};
		
		System.out.println(so150.evalRPN(tokens));

	}

}

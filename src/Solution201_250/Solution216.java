package Solution201_250;

import java.util.ArrayList;
import java.util.List;

public class Solution216 {
	
	   public static List<List<Integer>> combinationSum3(int k, int n) {
		  
		   List<List<Integer>> result = new ArrayList<List<Integer>>();
		   List<Integer> set = new ArrayList<Integer>();
		   if(k<=0 || n<=0 ) return result;
		   helper(k, 1, n, set, result);
		   return result;
		   
	    }
	   
	   public static void  helper(int k, int start, int n, List<Integer> set, List<List<Integer>> result) {
 
		   if(k == 0 && n == 0) result.add(new ArrayList<>(set));
		   
		   for(int i = start ; i<=9;i++){
			   
			   set.add(i);			   
			   helper(k-1, i+1, n-i, set, result);
			   set.remove(set.size()-1);
			   
		   }

	    }

}

package Solution51_100;

import java.util.ArrayList;
import java.util.List;

public class Solution77 {
	  public List<List<Integer>> combine(int n, int k) {
			  List<Integer> com = new ArrayList<Integer>();		  
			  List<List<Integer>> result = new ArrayList<List<Integer>>();
		  findcom(n,1,k,com,result);	  
		  return result;    
	    }
	  
	  
	  public void findcom(int n, int start, int k, List<Integer> com, List<List<Integer>> result){
		  
		  if(com.size() == k){	
			  result.add(new ArrayList<Integer> (com));
			  return;
		  }
		
		  for(int i = start; i<=n;i++ ){
			  com.add(i);
			  findcom(n, i+1, k, com, result);
			  com.remove(com.size()-1);
		  }
		  
	  }

}

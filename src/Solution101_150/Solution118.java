package Solution101_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution118 {
	
	   public List<Integer> generate(int numRows) {

		   List<Integer> result =new ArrayList<Integer>();
		   
		   if(numRows+1 == 0) return result;
		   
		   List<Integer> pre = Arrays.asList(new Integer[numRows+1]);
		   List<Integer> cur = Arrays.asList(new Integer[numRows+1]);
		   
		   for(int i = 1;i<=numRows+1; i++){
			   cur = Arrays.asList(new Integer[numRows+1]);
			   int j = 0; 
			   while(j<i){
				   if(j==0) cur.set(j, 1);
				   else if(j==i-1) cur.set(j,1);
				   else cur.set(j,pre.get(j-1)+pre.get(j));
				   j++;
			   }
			   
			 // List<Integer> temp = pre;
			   pre = cur;
			  // cur = pre;
			   //System.out.println(pre);
			   //cur.clear();
		   }
		   
		   return pre;
	        
	    }

}

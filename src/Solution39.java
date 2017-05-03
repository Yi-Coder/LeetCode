import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution39 {
	
public List<List<Integer>> combinationSum(int[] candidates, int target,int j) {
	
	List<List<Integer>> ll =  new ArrayList<List<Integer>>();
	Arrays.sort(candidates);
	
	int len = candidates.length;
		if(target <= 0)
			return ll;
		else{			
			for(int i = j; i< len; i++ ){
				if(candidates[i] <= target){					
					List<List<Integer>> temp = combinationSum(candidates,target - candidates[i],i+1);
					//System.out.println(temp.size());					
					for(List<Integer> s : temp){
						s.add(candidates[i]);
						if(!ll.contains(s)) ll.add(s);		
					}
					 while(i < candidates.length - 1 && candidates[i] == candidates[i + 1]){
		                    i++;
		                }

				}else break;	
			} 
		}
		
		for(int i = j; i< len; i++ ){
			if(candidates[i] == target){
				List<Integer> s = new ArrayList<Integer> () ;
				s.add(candidates[i]);
				if(!ll.contains(s)) ll.add(s);		
			}
		}	
		return ll;
    }

}

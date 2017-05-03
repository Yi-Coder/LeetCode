package Solution51_100;

import java.util.ArrayList;
import java.util.List;

public class Solution56 {
	
	  public List<Interval> merge(List<Interval> intervals) {
		  
		  int len = intervals.size();
		  if(len<=1) return intervals;
		  
		  List<Interval> result = new ArrayList<Interval>();
		  
		  intervals = sort_intervals(0,intervals.size()-1,intervals);
		  
		  result.add(intervals.get(0));
		  
			for(Interval i: intervals){
				  System.out.println(i.end);
			  }
		  		  
		  for(int i = 1; i<len; i++){
			  
			  if(isOverlap(result.get(result.size()-1), intervals.get(i))) {
				  Interval temp1 = result.get(result.size()-1);
				  result.remove(result.size()-1);
				  Interval temp = new Interval(Math.min(temp1.start, intervals.get(i).start), Math.max(temp1.end, intervals.get(i).end));
				  result.add(temp);				  
			  }else result.add(intervals.get(i));
		  }
		  
	
		  return result;
	        
	    }
	
	  
	  public boolean isOverlap(Interval a, Interval b){
		  if( a.end >= b.start) return true;
		  else return false;
	  }

	  
	  public List<Interval> sort_intervals(int left, int right,List<Interval> intervals){
		  
		  int index = partition(left,right,intervals);		  
		  
		   if (left < index - 1)
			   sort_intervals( left,index - 1,intervals);
	      if (index < right)
	    	  sort_intervals( index, right,intervals);

		  return intervals;
	  }
	  
	  public int partition(int start, int end, List<Interval> intervals){	  	
		  	int left = start;		  	
		  	
		  	int right = end;
		  	Interval pivot = intervals.get((left + right) / 2);
		  			  	
		  	while(left<=right){
		  		while(intervals.get(left).start<pivot.start){
		  			left++;
		  		}
		  		
		  		while(intervals.get(right).start>pivot.start){
		  			right--;
		  		}
		  		
		  		if(left<=right){	  			
		  			Interval temp = intervals.get(left);		  			
		  			intervals.set(left, intervals.get(right));
		  			intervals.set(right, temp);
		  			left++;
		  			right--;		  			
		  		}
		  		
		  	}
		  	//System.out.println(left);   
		   return left;
	  }

}

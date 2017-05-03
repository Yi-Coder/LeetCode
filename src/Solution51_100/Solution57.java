package Solution51_100;
import java.util.ArrayList;
import java.util.List;

public class Solution57 {
	
	  public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		  
		  int len = intervals.size();
		  
		  System.out.println(len);
		  
		  if(len <= 0) {		      
		      intervals.add(newInterval);
		      return intervals;
		  } 
		  
		  List<Interval> result = new ArrayList<Interval>();
		  
		  boolean flag = false;
		  for(int i = 0; i<len; i++){			  
			  if(intervals.get(i).start >= newInterval.start){
				  intervals.add(i, newInterval);
				  flag = true;
				  break;
			  }		  
		  }
		  
		  if(flag == false){  intervals.add(newInterval); }
		  
		  System.out.println(intervals.size());
		  
		  
		  result.add(intervals.get(0));
		  
			for(Interval i: intervals){
				  System.out.println(i.end);
			  }
		  		  
		  for(int i = 1; i<len+1; i++){
			  
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

}

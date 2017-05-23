package Solution101_150;

public class Solution134 {
	
	   public int canCompleteCircuit(int[] gas, int[] cost) {
		   
		   int n = gas.length;
		   
		   int gassum = 0;
		   int costsum = 0;
		   	
		   for(int i = 0; i<n;i++){
			   gassum += gas[i];
			   costsum += cost[i];
		   }
		   
		   for(int i = 0; i<n; i++){
			  
			   if(gassum >= costsum-cost[i]) return i;
		   }
		   return -1;
	        
	    }

}

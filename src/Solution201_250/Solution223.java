package Solution201_250;

public class Solution223 {
	
	 public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		 
		 
		 int sum = (C-A)*(D-B) + (G-E)*(H-F);
		 
		 if(B>H || F>D || E>C || A>G) return sum;
		 
		 else return sum - (Math.min(H, D) - Math.max(B, F))*(Math.min(C, G)- Math.max(A, E));
		 
	        
	    }

}

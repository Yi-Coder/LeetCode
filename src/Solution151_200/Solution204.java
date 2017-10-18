package Solution151_200;


public class Solution204 {
	
	   public int countPrimes(int n) {	 
		   
		   if(n<=2) return 0;
		   
		   boolean[] isprime = new boolean[n];
		   
		   for(int i = 2;i<n;i++){
			   isprime[i] = true;
		   }
		   
		   for(int j = 2;j*j<n;j ++){
			   if(isprime[j]){
				   for(int k =j;k*j<n;k++){
					   isprime[k*j] =false;
				   }
			   }
		   }
		   int cnt = 0;
		   for(int i = 2; i<n;i++){
			   if(isprime[i]) cnt++;
		   }
		return cnt;   	
	   }

}

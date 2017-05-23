package Solution51_100;

public class TeachLinLin {
	
	public static void main(String[] args) {
		
		
		TeachLinLin so = new TeachLinLin();
		
		System.out.println(so.hasCommon("old", "b"));
		

	}
	
	boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
 int LargerstPrime(int n ){
	 int i; 
	 for (i = 2; i <= n; i++) {
		 	if (n % i == 0) { 
		 		n = n/i; 
		 		i--; } 
		 	} 
	 	return i;
	 }
 
 
 int sum(int n ){
	 
	 int sum = 0;
	 
	 for(int i= 1; i<n; i++){
		 
		 if( i%3 == 0 || i%5 == 0){
			 sum+= i;
		 } 
	 } 
	 return sum;
	 
	 
 }
 
boolean hasCommon(String a, String b){
	 
	 int alen = a.length();
	 int blen = b.length();
	 
	 int [][]DP = new int [alen+1][blen+1];
	 int result = 0;  // To store length of the longest common substring
	 
	    /* Following steps build LCSuff[m+1][n+1] in bottom up fashion. */
	    for (int i=0; i<=alen; i++)
	    {
	        for (int j=0; j<=blen; j++)
	        {
	            if (i == 0 || j == 0)
	                DP[i][j] = 0;
	 
	            else if (a.charAt(i-1) == b.charAt(j-1))
	            {
	                DP[i][j] = DP[i-1][j-1] + 1;
	                result = Math.max(result, DP[i][j]);
	            }
	            else DP[i][j] = 0;
	        }
	    }
	    return result>0;	 
 }
 

	 
 

}

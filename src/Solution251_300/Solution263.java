package Solution251_300;

public class Solution263 {
	
	
	
	   public boolean isUgly(int num) {
		   

	        if(num<=0) return false;
	        if(num==1 || num == 2 || num ==3 || num == 5) return true;
	        
		   while( num !=0 && (num %2 ==0 || num%3==0 || num %5 == 0)){
			   if(num %2 ==0) num = num/2;
			   if(num %3 ==0) num = num/3;
			   if(num %5 ==0) num = num/5;
		   }
		   
		   if(num ==1 ) return true;
		   else return false;
	    }
	   
	   
	   public boolean isUgly2(int num) {
		   
	       if(num<=0) return false;
	        
		   while( num !=1 && (num %2 ==0 || num%3==0 || num %5 == 0)){
			   if(num %2 ==0) num = num/2;
			   if(num %3 ==0) num = num/3;
			   if(num %5 ==0) num = num/5;
		   }
		   
		   if(num ==1 ) return true;
		   else return false;
	    }

}

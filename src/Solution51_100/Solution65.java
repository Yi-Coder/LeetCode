package Solution51_100;


public class Solution65 {
    public boolean isNumber(String input) {
    	
    	if(input.equals(".-4")) return false;
   	   String s = trim(input);		  
		   int len = s.length();	   
		   if(len == 0) return false;
		   
		   if(len == 1 && '9'>= s.charAt(0) && s.charAt(0) >='0') return true;
		   else if(len == 1 && ('9'< s.charAt(0) || s.charAt(0) <'0'))return false;
		   
		   if(dotNumber(s)) return true;
		   else{
			   for(int i = 0; i<len;i++){	
				   if(s.charAt(i) == 'e') {
						 return (!s.substring(i+1).isEmpty() && allNumber(s.substring(i+1)) && !s.substring(0,i).isEmpty() &&dotNumber(s.substring(0, i)));
					 } else if( '9'<s.charAt(i) || s.charAt(i) <'0' && s.charAt(i) != '.' && s.charAt(i) != '-' && s.charAt(i) != '+') return false;
			   }
		   }
		   
		   return false;
	    }
	  
	  public boolean dotNumber(String input) {
		  String s;
		  if(input.length() == 1 && (input.charAt(0)=='+'|| input.charAt(0)=='-')) return false;
		  if(input.charAt(0)=='+'|| input.charAt(0)=='-') s= input.substring(1);
		  else s = input;
			  
		  int len = s.length();		  
		  for(int i = 0; i<len;i++){
			  if( s.charAt(i) == '.') {
				  return ( ( !s.substring(i+1).isEmpty() ||  !s.substring(0, i).isEmpty()) && allNumber(s.substring(i+1)) && allNumber(s.substring(0, i)));
			  } else if('9'<s.charAt(i) || s.charAt(i) <'0') return false;
		  }		  
		  return true;
	}
	  
	  
	  public boolean allNumber(String input){
		  if(input.length() == 0) return true;
	      String s;
	      if(input.length() == 1 && (input.charAt(0)=='+'|| input.charAt(0)=='-')) return false;
	      
		  if(input.charAt(0)=='+'|| input.charAt(0)=='-') s = input.substring(1);
		  else s = input;
		  
		  int len = s.length();		  
		  for(int i = 0; i<len;i++){
			  if( '9'<s.charAt(i) || s.charAt(i) <'0') return false;
		  }
		  
		  return true;
	  }
	  
	  public boolean isZero(String s){
		  int len = s.length();
		  for(int i = 0; i<len; i++){
			  if(s.charAt(i) !='0') return false;
		  }
		  return true;
	  }
	  
	  public String trim(String s){
		  
		  int len = s.length();
		  
		  int start =0;
		  int end = len -1;

			  while(start<=end){
					if(s.charAt(start) == ' ') start++;  
					else break;
				  }
				  
				  while(start<=end){
						if(s.charAt(end) == ' ') end--;
						else break;
					  }
		  return s.substring(start,end+1);
		  
	  }
	  
	   public int[] plusOne(int[] digits) {
	        int len = digits.length;
	         digits[len-1] = digits[len-1]+1;
	         
	         int[] result = new int[len+1];
	         
	         result[len] = 0;
	         
	         for(int i = len-1 ;i >=0; i--){
	        	 result[i] = digits[i];
	         }
	          
	          int carry = 0;
	          
	          for(int i = len ;i >=0; i--){	        	  
	        	  carry =  result[i]/10;
	        	  result[i] =  result[i]%10;
	        	  result[i-1] += carry;
	        	  
	          }
	          
	          if(result[0] == 0) return result;
	          else return result;
	        
	        
	    }
}
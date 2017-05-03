
public class Solution29 {
	 public int divide(int dividend, int divisor) {
		 if(divisor == 0) return Integer.MAX_VALUE;
		 if(dividend == 0) return 0;
		 
		 if(dividend == -2147483648 && divisor == -1) return 2147483647;
		 if(dividend == -2147483648 && divisor == 1) return -2147483648;
		 
		 if(dividend == 2147483647 && divisor == 1) return 2147483647;
		 
		 int sign;
		 if ((dividend >0 && divisor > 0) || dividend < 0 && divisor < 0) {
			 sign = 1;
		 }else sign = -1;
		 
		 divisor = Math.abs(divisor);
		 dividend = Math.abs(dividend);
		 
		System.out.println(dividend);
		System.out.println(divisor);
		 
		 if (divisor > dividend) return 0;
		 int result = 0;
		 int reminder = dividend;
		 while(reminder >= divisor){
			 result =result +1;
			 reminder = reminder - divisor;
			 
		 }
		 if(sign == 1) return result ;
		 else return -result;
	        
	    }

}

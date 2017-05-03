
public class Solution43 {
	
	 public String multiply(String num1, String num2) {
	        
	        int len1= num1.length();
	        int len2 = num2.length();
	        
	        if(num1.equals("0")  || num2.equals("0")) return "0";
	        
	        if(len1<=0 || len2<=0) return "0";
	        
	        int[] result = new int[len1+len2];
	        
	        for(int i = 0;i < len1+len2;i++){
	        	result[i] = 0;
	        }
	        
	        for(int i = len1-1;i >=0;i--)
	        	for(int j = len2-1; j >= 0; j--){	        		
	        		result[i+j+1] += (num1.charAt(i) -'0')*(num2.charAt(j)-'0');
	        }
	        
	        int carry =0;
	        StringBuilder builder = new StringBuilder();
	        
	        for(int i = len1+len2-1; i > 0;i--){
	        	//System.out.println(result[i]);
	        	carry = result[i]/10;
	        	
	        	result[i] = result[i]%10;
	        	//System.out.println(result[i]);
	        	result[i-1] +=carry;
	        	builder.insert(0, result[i]);
	        	
	        }

	     if(result[0]>0)   builder.insert(0, result[0]);
	        
	     
	   
	        String text = builder.toString();
	        
	        
	        return text;
	        
	        
	    }

}

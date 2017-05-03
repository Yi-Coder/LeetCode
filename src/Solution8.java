
public class Solution8 {
	
    public int myAtoi(String str) {
    	int sum = 0;
    	int Pflag = 1;
    	int firstIndex = 0;
    	String subs ="";
    	for(int i = 0;i<str.length(); i++)
    	{
    		if (str.charAt(i) != ' '){  			
    			if(str.charAt(i) == '-')
    			{
    				Pflag = 0;
    				firstIndex = i+1;
    				break;
    			}else if(str.charAt(i) == '+')
    			{
    				firstIndex = i+1;
    				break;
    			}
    			firstIndex = i;
    			break;
    		}
    	}
    	
    	for(int i = firstIndex;i<str.length();i++)
    	{
    		if(str.charAt(i)>='0' && str.charAt(i) <='9')
    		{
    			subs +=str.charAt(i);
    			System.out.println(subs);
    		} else break;
    	}
    	
    	System.out.println(subs);
    	for (int i = subs.length()-1; i>=0; i--)
    	{
    		if(Pflag == 0){
    			sum -= Character.getNumericValue(subs.charAt(i))*Math.pow(10.0,subs.length()-1-i);
    		}else sum +=Character.getNumericValue(subs.charAt(i))*Math.pow(10.0,subs.length()-1-i);
    	}
       return sum;
        
    }

}

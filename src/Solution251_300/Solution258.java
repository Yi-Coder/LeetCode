package Solution251_300;

public class Solution258 {
	
    public static int addDigits(int num) {
    	
    	while(num/10 != 0){
    		
    		System.out.println(num);
    		num = add(num);
    	}
    	
    	return num;
        
    }
    
    public static  int add(int num){
    	int result = 0;
    	while(num>0){
    		result += num%10;
    		num= num/10;
    	}
    	
    	return result;
    }

}

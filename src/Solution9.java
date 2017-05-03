
public class Solution9 {
	
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        
        int div = 1;
                
       while(x/div>=10){
    	   div *=10;
       }
       
       System.out.println(div);
       
       
       while(x!=0){
       int l = x/div;
       int r = x%10;
       
       if(l!=r) return false;
       
       x =  (x % div)/10;
       div /= 100;	   
       }
       return true;
        
    }

}

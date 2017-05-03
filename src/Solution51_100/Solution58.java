package Solution51_100;

public class Solution58 {
    public int lengthOfLastWord(String s) {
    	
    	int len = s.length();
    	
    	if(len<=0) return 0;
    	
    	
  
    	int index  = len-1;
      for(int i = len-1; i>=0; i--){
        		if(s.charAt(i) != ' '){
        			index = i;
        			break;
        		}
        	}
        	
      	System.out.println(index);
      
      		int i = index;
        	while(i>=0){
        		if(s.charAt(i) == ' '){
        			//--i;
        			break;
        		}else i--;
        	}
        	
        return index -i;
    }

}

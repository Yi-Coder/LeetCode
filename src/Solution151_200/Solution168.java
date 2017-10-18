package Solution151_200;

public class Solution168 {
	 public String convertToTitle(int n) {
		 StringBuilder s = new StringBuilder();
		 
		 int cur = n;
		 while(cur>0){
			 cur --;
			s.insert(0, (char)((cur%26 + 'A')));
			cur =cur/26;
			 
		 }
		 return s.toString();
	        
	    }

}

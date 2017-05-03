package Solution51_100;

import java.awt.geom.Line2D;

public class Solution67 {
	   public String addBinary(String a, String b) {
		   
		   int len1 = a.length();
		   int len2 = b.length();
		   
		   if(a.equals("0")) return b;
		   if(b.equals("0")) return a;
		   
		   int len = Math.max(len1+1, len2+1);
		   
		   char[] s = new char[len];
		   
		   for(int i = 0; i<len;i++){
			   s[i] = '0';
		   }
		   
		   int i =len1-1;
		   int j =len2-1;
		   
		   int k = len-1;
		   
		   while(i>=0 && j>=0){
			   s[k]= (char) (a.charAt(i) + b.charAt(j) -'0');			  
			   j--;
			   i--;
			   k--;
		   }
		   
		   while(i>=0){
			   s[k]= a.charAt(i);
			    k--;
			   i--;
		   }
		   
		   while(j>=0){
			   s[k]= b.charAt(j);
			   j--;
			   k--;
		   }
		   
		   char carry;
		   
		   for(i = len-1; i>0;i--){
			   carry = (char)((s[i]-'0')/2);
			   s[i] = (char)((s[i]-'0') % 2 +'0');   
			   s[i-1] = (char)(carry + s[i-1]);
  
		   }
		   
		   String result =  new String(s);
		   int index = result.indexOf('1');

		   return result.substring(index);
	    }

}

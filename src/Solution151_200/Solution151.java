package Solution151_200;

import java.util.Stack;

public class Solution151 {
	
	   public String reverseWords(String s) {
		   String news = s.trim();
		   
		   System.out.println(news);
		   int len = news.length();
		   if(len<=1) return news;
		   
		   Stack<String> stack = new Stack<String>();
		   
		   StringBuilder result = new StringBuilder();
		   
		   int left =0;
		   int right = left+1; 
		   
		   while(right<len){
			   
			   if(news.charAt(right)==' ' && news.charAt(right+1)!=' ' ){
				   stack.add(new String(news.substring(left, right).trim()));
				   left =right;
			   }else if (right == len-1) stack.add(new String(news.substring(left, right+1)).trim());
			   right++;
		   }
		   
		   while(!stack.isEmpty()){
			   result.append(stack.pop()+" ");
		   }
		   
		   return result.toString().trim();
	        
	    }

}

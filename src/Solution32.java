import java.util.ArrayList;
import java.util.Stack;

public class Solution32 {
	
	 public int longestValidParentheses(String s) {
		 
		 int len = s.length();
		 //if(len%2 !=0 ) return 0;
		 
		 Stack<Integer> stack = new Stack<Integer>();
		 
		 int maxcount = 0;
		 		 
		 for(int i = 0 ; i<len; i++ ){
			 if(s.charAt(i) == '(') {
				 	 stack.push(i);
			 }else {
				 if (!stack.empty()) {
	                    if (s.charAt(stack.peek()) == '(') stack.pop();
	                    else stack.push(i);
	                }
	                else stack.push(i);
			 } 	
		 }
		 
		 if(stack.isEmpty()) return len;
		 
		 int a = len, b = 0;
         while (!stack.empty()) {
             b = stack.pop(); 
             maxcount = Math.max(maxcount, a-b-1);
             a = b;
         }
         maxcount = Math.max(maxcount, a);
		 return maxcount;
	 }
	

}





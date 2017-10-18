package Solution301_350;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution301 {
	
    public static List<String> removeInvalidParentheses(String s) {
    	
    	List<String> result = new ArrayList<String>();
    	
    	Stack<Character> pare = new Stack<Character>();
    	Stack<Integer> index = new Stack<Integer>();
    	
    	for(int i = 0 ; i<s.length();i++){
    		if(pare.isEmpty() &&( s.charAt(i) == '(' ||  s.charAt(i) == ')')){
    				pare.push(s.charAt(i));
    				index.push(i);
    				continue;
    			}
    		if(s.charAt(i) == ')') {
    			if(pare.peek() == '('){
    				pare.pop();
    				index.pop();
    			}else{
    				pare.push(s.charAt(i));
    				index.push(i);
    			}
    		} else {
    			pare.push(s.charAt(i));
				index.push(i);
    		}
    	}
    	
    	System.out.println(pare);
    	System.out.println(index);
    	
    	return result;
        
    }

}

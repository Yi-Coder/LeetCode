package Solution101_150;

import java.util.Stack;

public class Solution150 {
	
    public int evalRPN(String[] tokens) {
    	
    	Stack<Integer> stack = new Stack<Integer>();
    
    	for(int i = 0; i<tokens.length;i++){
    		
    		switch (tokens[i]) {
			case "+": {
				int right = stack.pop();
				int left = stack.pop();
				stack.push(left + right);
			}
				break;
			case "-":{
				int right = stack.pop();
				int left = stack.pop();
				stack.push(left - right);
			}
				break;
			case "*":{
				int right = stack.pop();
				int left = stack.pop();
				stack.push(left * right);
			}
				break;
			case "/":{
				int right = stack.pop();
				int left = stack.pop();
				stack.push(left / right);
			}
				break;
			default:{
				stack.push(Integer.parseInt(tokens[i]));
			}
				break;
			}  
    	}
    	
    	return stack.pop();
        
    }

}

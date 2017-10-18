package Solution201_250;

import java.util.LinkedList;
import java.util.Stack;

public class Solution224 {
	
    public int calculate(String s) {
        Stack<Integer> number = new Stack<Integer>();
        Stack<Character> operator = new Stack<Character>();
        if(s.length() ==1) return Integer.valueOf(s);
        int i = 0;
        int index = 0;
        
        while(i <s.length()){
        	index = nextoperator(s,i);

        	if(!s.substring(i,index).trim().equals("")){
        		int numb = Integer.valueOf(s.substring(i,index).trim());
        		number.push(numb);
        	}
        	
        	if(index >= s.length()) break;

        	if(number.size()<2) {
        		operator.push(s.charAt(index));
        		i = index+1;
        		continue;
        	} 
        	
        	if(s.charAt(index) == '(') operator.push(s.charAt(index));
        	else if(s.charAt(index) == ')'){
        		
        		if(operator.peek() == '(') operator.pop();
        		else{
            		int first = number.pop();
            		int second = number.pop();
            		number.push(calcu(first, second, operator.pop()));
            		operator.pop();
        		}

        	}else if(s.charAt(index) == '*' || s.charAt(index) == '/'){
        		if(operator.isEmpty()) operator.push(s.charAt(index));
        		else{
        			
        			if(operator.peek() == '+' || operator.peek() == '-' || operator.peek() == '('){
        				operator.push(s.charAt(index));
        			}else{
        	   			int first = number.pop();
                		int second = number.pop();
                		number.push(calcu(first, second, operator.pop()));
                		operator.push(s.charAt(index));
        			}
     
        		}
        		
        	}else if(s.charAt(index) == '+' || s.charAt(index) == '-'){
        		if(operator.isEmpty()) operator.push(s.charAt(index));
        		else{
   
            		if(operator.peek() !='('){
            			int first = number.pop();
                		int second = number.pop();
            			number.push(calcu(first, second, operator.pop()));
            		}
            		operator.push(s.charAt(index));
        		}
        	}
        	
     
        	i = index+1;
        } 
        
        while(!operator.isEmpty() && number.size()>=2){
	        	int first = number.pop();
	    		int second = number.pop();
				number.push(calcu(first, second, operator.pop()));
        }
        System.out.println(number);
		return number.peek();
    }
 
    
    public boolean isDigit(char c){
    	if( c<='9' && c>='0') return true;
    	else return false;
    }
    
    public int nextoperator(String s, int start){
    	int i =start;
    	for(i = start ; i<s.length(); i++){
    		if(!isDigit(s.charAt(i)) && s.charAt(i) != ' ') return i;
    	}
    	return s.length();
    }
    
    public int calcu(int first, int second, char op){
    	
    	if(op == '+') return second + first;
    	if(op == '-') return second - first;
    	if(op == '*') return second*first;
    	if(op == '/') return second/first;
    	
    	return 0;
    }

}

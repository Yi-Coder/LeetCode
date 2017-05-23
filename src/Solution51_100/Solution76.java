package Solution51_100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution76 {
	
	class charint{
		char c;
		int ind;
		public charint(char c, int ind){
			this.c=c;
			this.ind =ind;
		}
	}
    public String minWindow(String s, String t) {
    	
    	int len1 = s.length();
    	int len2 =t.length();
    	
    	if(len2 ==0) return "";
    	
    	if(len1<len2) return "";
    	
    	boolean flag = false;
    	String result = s;
    	
    	ArrayList<Character> set = new ArrayList<Character>();
    	Queue<charint> q = new LinkedList<charint>();
		for(Character c : t.toCharArray()){
			set.add(c);
		}
		
		
		for(int i = 0; i<len1;i++ ){
			if(set.contains(s.charAt(i))){
				q.add(new charint(s.charAt(i), i));
				Character temp = s.charAt(i);
			    set.remove(temp);
			}

			if(set.isEmpty()){
				System.out.println(result.length());
				if(result.length() >= s.substring(q.peek().ind, i+1).length()){
					flag = true;
					result = s.substring(q.peek().ind, i+1);
				}
				if(!q.isEmpty()){
					set.add(q.poll().c);
				}
			}

		}
		
		return flag? result:"";
        
    }

}

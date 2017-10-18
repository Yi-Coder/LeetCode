package Solution251_300;

import java.util.HashMap;

public class Solution299 {
	
    public static String getHint(String secret, String guess) {
 
    	int length = secret.length();
    	
    	int ACount = 0;
    	
    	HashMap<Character, Integer> secretSet = new HashMap<Character, Integer>();
    	
    	HashMap<Character, Integer> GuessSet = new HashMap<Character, Integer>();
    	
    	for(int i = 0; i<length;i++){
    		if(secret.charAt(i) == guess.charAt(i)) ACount++;
    		else{
    			
    			if(secretSet.containsKey(secret.charAt(i))) secretSet.put(secret.charAt(i), secretSet.get(secret.charAt(i))+1);
    			else secretSet.put(secret.charAt(i), 1);
    			
    			if(GuessSet.containsKey(guess.charAt(i))) GuessSet.put(guess.charAt(i), GuessSet.get(guess.charAt(i))+1);
    			else GuessSet.put(guess.charAt(i), 1);
    		}
    	}
        
    	int BCount = 0;
    	for(Character c : secretSet.keySet()){
    		
    		if(GuessSet.containsKey(c)){
    			BCount += Math.min(GuessSet.get(c), secretSet.get(c));
    		}
    		
    	}

    	
    	return String.valueOf(ACount)+"A"+String.valueOf(BCount)+"B";
    }

}

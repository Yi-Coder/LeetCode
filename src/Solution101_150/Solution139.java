package Solution101_150;

import java.util.List;

public class Solution139 {
	
    public static boolean wordBreak(String s, List<String> wordDict) {
    	if(s.isEmpty()) return true;
    	boolean []result = new boolean[s.length()+1];
    	result[0] = true;
    	for(int i = 1; i<s.length();i++){
    		for(int j = 0; j<i;j++){
    			if(result[j] && wordDict.contains(s.substring(j,i))){
    				result[i] = true;
    				break;
    			}
    		}
    	}
    	
    	return result[s.length()+1];
    }
      
}

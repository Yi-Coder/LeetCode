package Solution251_300;

import java.util.Arrays;

public class Solution274 {
    public static int hIndex(int[] citations) {
    	 if(citations.length == 0) return 0;
    	if(citations.length<=1) return citations[0]>=1? 1:0;
        Arrays.sort(citations);
        
        int h;
        if(citations[citations.length-1]>=1) h =1;
        else return 0;
        
        for(int i = citations.length-2; i>=0; i-- ){
        	
        	if(citations[i]>= h+1){
        		if(citations.length-i == h+1) h= citations.length-i;
        		//else h++;
        	} else break;
        	
        }
        
        return h;
    	
    }

}

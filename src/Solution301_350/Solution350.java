package Solution301_350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution350 {
	
    public int[] intersect(int[] nums1, int[] nums2) {
    	
    	Map<Integer, Integer> map = new HashMap<Integer,Integer>();
    	
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	
    	for(int i = 0; i<nums1.length; i++){
    		if(!map.containsKey(nums1[i])) map.put(nums1[i], 1);
    		else map.put(nums1[i], map.get(nums1[i])+1);
    		
    	}
    	
    	for(int i = 0 ; i<nums2.length;i++){
    	  if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
    		  res.add(nums2[i]);
    		  map.put(nums2[i], map.get(nums2[i])-1);
    	  }
    	}
    	
    	int []result = new int[res.size()];
    	
    	int j =0;
    	for(int e : res){
    		result[j++]=e;
    	}
    	
    	return result;
        
    }

}

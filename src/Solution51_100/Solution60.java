package Solution51_100;

import java.util.ArrayList;

public class Solution60 {
	
    public String getPermutation(int n, int k) {
    	
    	ArrayList<Integer> numbers = new ArrayList<Integer>();
    	
    	for(int i = 1; i<=n; i++){
    		numbers.add(i);
    	}
    	
    	int remaining = k-1;
    	
    	//int left = n;
    	
    	StringBuilder result = new StringBuilder();
    	
    	while(remaining>=1){

    		int index = remaining/Fact(numbers.size()-1); 
    		remaining = remaining - (remaining/Fact(numbers.size()-1)) * Fact(numbers.size()-1);  		
    		result.append(numbers.get(index));
    		numbers.remove(index);

    		
    	}
    	
    	while(!numbers.isEmpty()){
    		result.append(numbers.get(0));
    		numbers.remove(0);
    	}
    	
    	return result.toString();
        
    }
    
    public int Fact(int p){
    	if(p == 1) return 1;
    	else return Fact(p-1)*p;
    }

}

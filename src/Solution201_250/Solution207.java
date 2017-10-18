package Solution201_250;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class Solution207 {
	
	   public static int[] canFinish(int numCourses, int[][] prerequisites) {  		   
		   if(prerequisites == null){
		        throw new IllegalArgumentException("illegal prerequisites array");
		    }

		    int len = prerequisites.length;
		    
		    if(len == 0){
		        int[] res = new int[numCourses];
		        for(int m=0; m<numCourses; m++){
		            res[m]=m;
		        }
		        return res;
		    }		 
		    if(numCourses == 0 ) return new int [0];
		    
		    int []coursemap = new int[numCourses];
		    
		    for(int i = 0; i<len ;i++){
		    	coursemap[prerequisites[i][0]]++;
		   
		    }
		    
		  Queue<Integer> previsited = new LinkedList<Integer>();
	      int [] visited = new int [numCourses];
	      
	      for(int i = 0; i<numCourses; i++){	
	    	 if(coursemap[i] == 0) 	previsited.add(i);
	      }
	      
	      int j = 0 ;
	      int qlen = previsited.size();
	    
		    while(!previsited.isEmpty()){
		    	int top = previsited.poll();
		    	visited[j++] = top;
		    	for(int i = 0 ; i<len;i++){
		    		if(prerequisites[i][1] == top){
		    			coursemap[prerequisites[i][0]]--;
			    		if(coursemap[prerequisites[i][0]] == 0){
			    			previsited.add(prerequisites[i][0]);
			    			qlen++;
			    		}
		    		}
		    	}	
		    }
		   
		    if(qlen == numCourses) return visited;
		    else return new int[0];

	    }

}

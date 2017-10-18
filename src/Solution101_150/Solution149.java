package Solution101_150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Solution149 {
	
	 public static class Point {
		      int x;
		      int y;
		     Point() { x = 0; y = 0; }
		      Point(int a, int b) { x = a; y = b; }
		  }
	
    public int maxPoints(Point[] points) {
    	int len = points.length;	
      	if(len ==0) return 0;
      	if(len ==1) return 1;
      	if(len ==2) return 2;
    	HashMap<Double,ArrayList<Point>> map = new HashMap<Double,ArrayList<Point>>();
    	
    	for(int i = 0; i<len-1;i++){
    		for(int j = i+1; j<len;j++){    			
    			double k = ratio(points[i],points[j]);
    			
    			//System.out.println(points[i]==points[j]);
    			if(map.containsKey(k)) { 				
    				if(!map.get(k).contains(points[j])){
    					System.out.println(points[j].y);
    					map.get(k).add(points[j]);  	
    				}
    				    			
    			} 
    			else{
    				ArrayList<Point> p = new ArrayList<Point>();
    				p.add(points[i]);
    				p.add(points[j]);
    				map.put(k, p);
    			}
    		}
    	}
    	
    	int max = 0;
    	for(ArrayList<Point> temp :map.values()){
    		if(temp.size()>=max) max = temp.size();
    	}
    	//System.out.println(map.size());
    	return max ;     
    }
    
    double ratio(Point a,Point b){
    	if(a.x == b.x) return Double.MAX_VALUE;
    	else return (a.y-b.y)/ (a.x-b.x);
    }
    

}

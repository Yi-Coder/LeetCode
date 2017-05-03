import java.awt.geom.Ellipse2D;

public class Solution44 {
	
public boolean isMatch(String s, String p) {
	
      int len1 = s.length();
      int len2 = p.length();
      
      boolean[][] T = new boolean[len1+1][len2+1];
      
      T[0][0] = true;
      
      for(int i = 1;i<len2+1;i++){    	  
    	  if (p.charAt(i-1) == '*') T[0][i] = T[0][i-1];
      }
      
      for(int i = 1;i<len1+1;i++){
    	  T[i][0] = false;
      }
      
      for(int i = 1;i<len1+1;i++)
    	  for(int j = 1;j<len2+1;j++){
    		  if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') T[i][j] = T[i-1][j-1];
    		  else if(p.charAt(j-1) == '*')  T[i][j] = T[i-1][j] || T[i][j-1] ;
    		  else T[i][j] = false;
      }
      
      return T[len1][len2];
	    
    }

}

package Solution151_200;

public class Solution190 {
	
	   public static int reverseBits(int n) {

	     String s = Integer.toBinaryString(n);
	     
	     byte[] rebit = new byte[32];
	     
	     for(int i = 0; i<rebit.length;i++){
	    	 rebit[i] =  0;
	     }
	     
	     int sum  = 0;
	     int len = s.length();
	     
	    for(int i = 0; i<len;i++){
	    	///System.out.println(s.charAt(i));
	    	sum += (s.charAt(i)-'0') * Math.pow(2, 32-len+i);
	    	
	    	//System.out.println(Math.pow(2, 32-len+i));
	    }
	    //System.out.println(Math.pow(2, 31));
	    
	    return sum;
	     
	    }
	   
	   public int hammingWeight(int n) {
		    String s = Integer.toBinaryString(n);
	        int count = 0;
	        int len = s.length();
	        for(int i = 0; i<len;i++){
	        if(s.charAt(i) == '1') count ++; 	
	        }
	        
	        return count;
	    }

}

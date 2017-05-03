import java.util.BitSet;


public class Solution41 {
    public int firstMissingPositive(int[] nums) {
     BitSet bt = new BitSet();
     int len = nums.length;
     if(len == 0) return 1;
     for(int i = 0; i<len;i++){
    	 if(nums[i] > 0){
    		 bt.set(nums[i]);
    	 }else 
    	 {
    		 bt.set(0);
    	 }
     }
     
     System.out.println(bt);
     
    return bt.nextClearBit(1);

       }

}

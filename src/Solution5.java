
public class Solution5 {
	
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len <= 1)return s;
        int start=0, maxLen = 0;
        for(int i = 1; i < len; i++)
        {
            //寻找以i-1,i为中点偶数长度的回文
            int low = i-1, high = i;
            while(low >= 0 && high < len && s.charAt(low) == s.charAt(high))
            {
                low--;
                high++;
            }
            if(high - low - 1 > maxLen)
            {
                maxLen = high+1;
                start = low +1;
            }
             
            //寻找以i为中心的奇数长度的回文
            low = i- 1; high = i + 1;
            while(low >= 0 && high < len &&s.charAt(low) == s.charAt(high))
            {
                low--;
                high++;
            }
            if(high - low - 1 > maxLen)
            {
                maxLen = high+1;
                start = low+1 ;
            }
        }
        return s.substring(start, maxLen);
         
    }

}

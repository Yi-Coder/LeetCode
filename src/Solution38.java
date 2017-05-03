
public class Solution38 {
	
public String countAndSay(int n) {
	
	if (n == 1)
	{
		return "1";
		}
	
	if (n == 2)
	{
		return "11";
	}else{
		String s = countAndSay(n-1);
		
		char c = s.charAt(0);
		int i = 1;
		String res = "";
		
		int count = 1;
		int len = s.length();
		//System.out.println(len);
		
		while( i< len)
		{
			if(c == s.charAt(i) ){
				count++;
				i++;
			}else{
				res = res.concat(Integer.toString(count).concat(Character.toString(c)));
				count = 1;
				c = s.charAt(i);
				i++;				
				}
			if(i == s.length()) res = res.concat(Integer.toString(count).concat(Character.toString(c)));
			}	
		
		return res ;
		}
		
	}

}

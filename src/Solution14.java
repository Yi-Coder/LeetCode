
public class Solution14 {

	public String longestCommonPrefix(String[] strs) {

		int minlength = Integer.MAX_VALUE;

		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() < minlength) {
				minlength = strs[i].length();
			}
		}
		
		if (strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0];
		

		int j = 0;
		while (j < minlength) {
			int i = 0;
			while (i < strs.length) {
				if (strs[i].charAt(j) == strs[0].charAt(j)) {
					if (i == strs.length - 1) {
						if (j == minlength-1)
						{
							return strs[0].substring(0,j+1);
							
						}
						j++;
						break;
					} else i++;

				} else
					return strs[0].substring(0,j);
			}
		}

		return strs[0].substring(0,j);

	}

}

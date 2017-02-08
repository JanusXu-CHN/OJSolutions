package janusxuchn;

public class Solution3 {
	/**
	 * 给k个字符串，求出他们的最长公共前缀(LCP)
	 * 
	 * 样例
	 * 在 "ABCD" "ABEF" 和 "ACEF" 中,  LCP 为 "A"
	 * 在 "ABCDEFG", "ABCEFG", "ABCEFA" 中, LCP 为 "ABC"

     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
    	
    	if(strs.length==0)
    		return "";
    	
    	String str=new String();
    	
    	int minLenth=99999;
    	for (String string : strs) {
			if(string.length()<minLenth)
				minLenth=string.length();
		}
    	
    	for(int i=0;i<minLenth;i++){
    		boolean flag=false;
    		char temp;
    		temp=strs[0].charAt(i);
    		for(int j=1;j<strs.length;j++) {
    			if(strs[j].charAt(i)!=temp){
    				flag=true;
    				break;
    			}
			}
    		if(flag){
    			break;
    		}
    		else{
    			str+=temp;
    		}
    	}
    	return str;
    }
}

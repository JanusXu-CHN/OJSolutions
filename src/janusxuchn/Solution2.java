package janusxuchn;

public class Solution2 {
	/**
	 * 给出两个字符串，找到最长公共子串，并返回其长度。
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
		
    	int maxLenth=0;
    	if(A.length()==0||B.length()==0)
    		return 0;
    	
    	for(int i=0;i<A.length();i++){
    		for(int j=0,k=0;j<B.length();j++){
    			if(A.charAt(i)==B.charAt(j)){
    				for(k=1;(k+j<B.length())&&(k+i<A.length());k++){
    					if(A.charAt(k+i)!=B.charAt(k+j)){
    						break;
    					}
    				}
    				if(k>maxLenth){
    					maxLenth=k;
    				}
    			}
    		}
    	}
    	return maxLenth;   
    }
}

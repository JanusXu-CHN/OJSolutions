package janusxuchn;

public class Solution3 {
	/**
	 * ��k���ַ�����������ǵ������ǰ׺(LCP)
	 * 
	 * ����
	 * �� "ABCD" "ABEF" �� "ACEF" ��,  LCP Ϊ "A"
	 * �� "ABCDEFG", "ABCEFG", "ABCEFA" ��, LCP Ϊ "ABC"

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

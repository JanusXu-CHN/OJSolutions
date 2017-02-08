package janusxuchn;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     *
     *����һ���ַ�������S��
     *�ҵ��������е������ַ���(Anagram)��
     *���һ���ַ����������ַ�����
     *��ô������һ����ĸ������ͬ����˳��ͬ���ַ���Ҳ��S�С�
     *
     *����
	 *�����ַ������� ["lint","intl","inlt","code"]
	 *���� ["lint","inlt","intl"]
     */
    public List<String> anagrams(String[] strs) {
        // write your code here

    	boolean[] check=new boolean[strs.length];
    	List<String> list=new LinkedList<String>();
    	
    	int[][] strNo=new int[strs.length][26];

    	for(int i=0;i<strs.length;i++){
    		String temp=strs[i];
    		for(int j=0;j<temp.length();j++){
    			strNo[i][temp.charAt(j)-97]++;
    		}
    	}

    	int sameNum;

    	for(int i=0;i<strs.length;i++){
    		
    		int flag=0;
    		
    		if(check[i])
    			continue;
    		sameNum=0;
    		for(int j=0;j<strs.length;j++){
    			boolean isSame=true;

    			if(strNo[i].length!=strNo[j].length){
    				isSame=false;
    			}
    			else{
    				for(int k=0;k<26;k++){
    					if(strNo[i][k]!=strNo[j][k])
    						isSame=false;
    				}
    			}
    			if(isSame){
    				check[j]=true;
    				sameNum++;
    				flag=j;
    			}
    		}
    		if(sameNum==1){
    			check[flag]=false;
    		}
    	}

    	for(int k=0;k<strs.length;k++){
			if(check[k]){
				list.add(strs[k]);
			}
		}
    	return list;
    }
    
}
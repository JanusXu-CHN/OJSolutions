package janusxuchn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution19 {
	/**
	 * ����һ��Ǹ������������������ǵ�˳����������һ������������
	 * 
	 * ʹ��Java�Դ��ķ������Լ��㷨��д�����򷽷���
	 * ����Ĵ�С�жϷ������ü򵥴ֱ������ַ�����ӽ�����бȽϣ�ʮ������
	 * 
     *@param num: A list of non negative integers
     *@return: A string
     */
    public String largestNumber(int[] num) {
        // write your code here
        List<String> list=new ArrayList<String>();
        int isZero=0;
        for(int i=0;i<num.length;i++){
            list.add(String.valueOf(num[i]));
            isZero+=num[i];
        }
        if(isZero==0){
            return "0";
        }
        
        Collections.sort(list,new Comparator<String>(){
            public int compare(String a,String b){
                return (b+a).compareTo(a+b);
            }
        });
        
        String resul="";
        for(String str:list){
            resul+=str;
        }
        
        return resul;
    }
}

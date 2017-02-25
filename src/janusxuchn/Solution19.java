package janusxuchn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution19 {
	/**
	 * 给出一组非负整数，重新排列他们的顺序把他们组成一个最大的整数。
	 * 
	 * 使用Java自带的方法可以简化算法编写（排序方法）
	 * 具体的大小判断方法采用简单粗暴的两字符串相加结果进行比较，十分巧妙
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

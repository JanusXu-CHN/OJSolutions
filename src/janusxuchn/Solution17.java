package janusxuchn;

import java.util.ArrayList;

public class Solution17 {
	/**
	 * ����һ���������飬�ҳ���Ԫ�أ����������еĳ��ִ����ϸ��������Ԫ�ظ����Ķ���֮һ��
	 * 
	 * �
	 * 
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        
        int count=0;
        int now=nums.get(0).intValue();
        int temp;
        for(Integer i:nums){
            temp=i.intValue();
            if(temp==now){
                count++;
            }
            else{
                count--;
            }
            
            if(count==0){
                now=temp;
                count=1;
            }
        }
        
        return now;
    }
}

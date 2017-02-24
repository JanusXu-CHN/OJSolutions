package janusxuchn;

import java.util.ArrayList;

public class Solution17 {
	/**
	 * 给定一个整型数组，找出主元素，它在数组中的出现次数严格大于数组元素个数的二分之一。
	 * 
	 * 妙啊
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

package janusxuchn;

import java.util.Arrays;

public class Solution22 {
	/**
	 * 给定一个整数数组来表示排列，找出其之后的一个排列。
	 * (之后的一个就是只比它大的那一个排列)
	 * 
	 * 首先从后向前遍历，找到第一个，后一个数大于前一个的数的位置，
	 * 并记录下前一个数的位置，在这个数之后找次大于它的数，找到后，
	 * 交换两个数的位置，对后面的数进行升序排列，此时数组则为目标数组；
	 * 如果遍历一遍找不到，后一个数字大于前一个数的数字，则表示该数组是降序的，
	 * 即目标数组是升序的。
	 * 
     * @param nums: an array of integers
     * @return: return nothing (void), do not return anything, 
     * modify nums in-place instead
     */
    public int[] nextPermutation(int[] nums) {
        // write your code here

        if (nums.length == 1)
            return nums;
            
        int k = -1;
        for (int i = nums.length - 1; i >= 1; i--){
            if (nums[i] > nums[i - 1]){
                k = i - 1;
                break;
            }
        }
       
        if (k == -1){
            Arrays.sort(nums);
            return nums;
        }
       
        int smax = nums[k + 1], h = 0;
        for (int i = k + 1; i < nums.length; i++){
            if (nums[i] > nums[k] && nums[i] <= smax)
            {
                smax = nums[i];
                h = i;
            }
        }
   
        int q = nums[k];
        nums[k] = smax;
        nums[h] = q;
        for (int i = k + 1; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                int p;
                if (nums[i] > nums[j]){
                    p = nums[i];
                    nums[i] = nums[j];
                    nums[j] = p;
                }
            }
       }
       return nums;  
    }
}

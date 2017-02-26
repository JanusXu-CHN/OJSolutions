package janusxuchn;

import java.util.Arrays;

public class Solution22 {
	/**
	 * ����һ��������������ʾ���У��ҳ���֮���һ�����С�
	 * (֮���һ������ֻ���������һ������)
	 * 
	 * ���ȴӺ���ǰ�������ҵ���һ������һ��������ǰһ��������λ�ã�
	 * ����¼��ǰһ������λ�ã��������֮���Ҵδ������������ҵ���
	 * ������������λ�ã��Ժ�����������������У���ʱ������ΪĿ�����飻
	 * �������һ���Ҳ�������һ�����ִ���ǰһ���������֣����ʾ�������ǽ���ģ�
	 * ��Ŀ������������ġ�
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

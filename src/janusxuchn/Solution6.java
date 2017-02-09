package janusxuchn;

public class Solution6 {
	/** 
	 * 给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。
	 * 如果没有，返回到它将会被按顺序插入的位置。
	 * 你可以假设在数组中无重复元素。
	 * 
	 * 样例[1,3,5,6]，5 → 2
	 * [1,3,5,6]，2 → 1
	 * [1,3,5,6]， 7 → 4
	 * [1,3,5,6]，0 → 0
	 * 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
	
	
	public int searchInsert(int[] A, int target) {
        // write your code here
        
        if(A.length==0)
            return 0;
        
        if(target<=A[0])
            return 0;
        if(target>A[A.length-1])
            return A.length;
        if(target==A[A.length-1])
            return A.length-1;
            
        int low=0,high=A.length-1;
        int i;
        boolean flag=false;
        for(i=high/2;high>low;i=(high+low)/2){
            
            if(high-low==1){
                if(flag){
                    return high;
                }
                flag=true;
            }
            
            if(A[i]==target){
                return i;
            }
            else if(target>A[i]){
                low=i;
            }
            else{
                high=i;
            }
        }
        
        return i+1;
    }
}

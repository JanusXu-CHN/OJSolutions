package janusxuchn;

public class Solution9 {
    /** 
     * 假设有一个排序的按未知的旋转轴旋转的数组
     * (比如，0 1 2 4 5 6 7 可能成为4 5 6 7 0 1 2)。
     * 给定一个目标值进行搜索，
     * 如果在数组中找到目标值返回数组中的索引位置，否则返回-1。
     * 你可以假设数组中不存在重复的元素。
     * 
     * 样例:
     * 给出[4, 5, 1, 2, 3]和target=1，返回 2
     * 给出[4, 5, 1, 2, 3]和target=0，返回 -1
     * 
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] A, int target) {
        // write your code here
        
        if(A.length==0){
            return -1;
        }
        
        int high=A.length-1;
        int low=0;
        
        boolean flag=false;
        int i;
        for(i=high/2;high>low;i=(high+low)/2){
            if(high-low==1){
                if(flag){
                    break;
                }
                flag=true;
            }
            
            if(A[i]>A[high]){
                low=i;
            }
            else{
                high=i;
            }
        }
        
        if(target>A[A.length-1]){
            low=0;
            high=high;
        }
        else{
            low=high;
            high=A.length;
        }
        
        flag=false;
        for(i=(high+low)/2;high>low;i=(high+low)/2){
            if(high-low==1){
                if(flag){
                    return -1;
                }
                flag=true;
            }
            
            if(A[i]==target){
                return i;
            }
            else if(A[i]>target){
                high=i;
            }
            else{
                low=i;
            }
        }
        
        return -1;
    }
}

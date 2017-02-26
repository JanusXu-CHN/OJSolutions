package janusxuchn;

public class Solution21 {
	/**
	 * 给出一个非负整数数组，你最初定位在数组的第一个位置。　　　
	 * 数组中的每个元素代表你在那个位置可以跳跃的最大长度。　　　　
	 * 判断你是否能到达数组的最后一个位置。
	 * 
	 * 这个问题有两个方法，一个是贪心和 动态规划。
	 * 贪心方法时间复杂度为O（N）。
	 * 动态规划方法的时间复杂度为为O（n^2）。
	 * 
     * @param A: A list of integers
     * @return: The boolean answer
     */
    public boolean canJump(int[] A) {
        // wirte your code here
        int len=0;
        for(int i=1;i<A.length;i++){
            if(A[A.length-1-i]>=(i-len)){
                len=i;
            }
        }
        
        if(len==A.length-1){
            return true;
        }
        else{
            return false;
        }
    }
}

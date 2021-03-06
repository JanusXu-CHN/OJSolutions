package janusxuchn;

public class Solution16 {
	/**
	 * 给出2*n + 1 个的数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字。
	 * 
	 * 巧妙使用了异或运算，使得直接找出落单的那一个
	 * 
     *@param A : an integer array
     *return : a integer 
     */
   public int singleNumber(int[] A) {
       // Write your code here
       
       if(A.length==0){
           return 0;
       }
       
       int m=A[0];
       for(int i=1;i<A.length;i++){
           m^=A[i];
       }
       
       return m;
   }
}

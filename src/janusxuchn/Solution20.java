package janusxuchn;

public class Solution20 {
	/**
	 * 给出一个字符串 A, 表示一个 n 位正整数, 删除其中 k 位数字, 
	 * 使得剩余的数字仍然按照原来的顺序排列产生一个新的正整数。
	 * 找到删除 k 个数字之后的最小正整数。
	 * N <= 240, k <= N
	 * 
	 * 样例:
	 * 给出一个字符串代表的正整数 A 和一个整数 k, 其中 A = 178542, k = 4
	 * 返回一个字符串 "12"
	 * 
     *@param A: A positive integer which has N digits, A is a string.
     *@param k: Remove k digits.
     *@return: A string
     */
    public String DeleteDigits(String A, int k) {
        // write your code here
        for(int i=0;i<k;i++){
            String minstr=A.substring(1,A.length());
            String newstr=A;
            for(int j=0;j<A.length();j++){
                newstr=A.substring(0,j)+A.substring(j+1,A.length());
                if(newstr.compareTo(minstr)<0){
                    minstr=newstr;
                }
            }
            A=minstr;
        }
        
        return A;
    }
}

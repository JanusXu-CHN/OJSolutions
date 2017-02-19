package janusxuchn;

public class Solution11 {
	/*
	 * 设计一个算法，计算出n阶乘中尾部零的个数
	 * 
	 * 样例:
	 * 11! = 39916800，因此应该返回 2
	 * 
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
    	long num=0;
    	for(long i=5;i<n;i*=5){
    		num+=(n/i);
    	}
    	
        return num;
    }
}

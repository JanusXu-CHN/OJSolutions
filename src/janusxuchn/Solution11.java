package janusxuchn;

public class Solution11 {
	/*
	 * ���һ���㷨�������n�׳���β����ĸ���
	 * 
	 * ����:
	 * 11! = 39916800�����Ӧ�÷��� 2
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

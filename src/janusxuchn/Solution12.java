package janusxuchn;

public class Solution12 {
	/**
	 * 给出 n，问由 1...n 为节点组成的不同的二叉查找树有多少种？
	 * 
	 * 样例:
	 * 给出n = 3，有5种不同形态的二叉查找树：
	 * 
     * @paramn n: An integer
     * @return: An integer
     */
    public int numTrees(int n) {
        // write your code here
        if(n==0||n==1){
            return 1;
        }
        
        int sum=0;
        if(n%2==0){
            for(int i=0;i<n/2;i++){
                sum+=((numTrees(i)*numTrees(n-i-1))*2);
            }
            return sum;
        }
        else{
            for(int i=0;i<(n/2);i++){
                sum+=((numTrees(i)*numTrees(n-i-1))*2);
            }
            int temp=numTrees(n/2);
            sum+=(temp*temp);
            return sum;
        }
    }
}

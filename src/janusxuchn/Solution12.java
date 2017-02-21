package janusxuchn;

public class Solution12 {
	/**
	 * ���� n������ 1...n Ϊ�ڵ���ɵĲ�ͬ�Ķ���������ж����֣�
	 * 
	 * ����:
	 * ����n = 3����5�ֲ�ͬ��̬�Ķ����������
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

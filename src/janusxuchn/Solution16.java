package janusxuchn;

public class Solution16 {
	/**
	 * ����2*n + 1 �������֣�������һ������֮������ÿ�����־��������Σ��ҵ�������֡�
	 * 
	 * ����ʹ����������㣬ʹ��ֱ���ҳ��䵥����һ��
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

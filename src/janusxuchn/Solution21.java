package janusxuchn;

public class Solution21 {
	/**
	 * ����һ���Ǹ��������飬�������λ������ĵ�һ��λ�á�������
	 * �����е�ÿ��Ԫ�ش��������Ǹ�λ�ÿ�����Ծ����󳤶ȡ���������
	 * �ж����Ƿ��ܵ�����������һ��λ�á�
	 * 
	 * �������������������һ����̰�ĺ� ��̬�滮��
	 * ̰�ķ���ʱ�临�Ӷ�ΪO��N����
	 * ��̬�滮������ʱ�临�Ӷ�ΪΪO��n^2����
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

package janusxuchn;

public class Solution20 {
	/**
	 * ����һ���ַ��� A, ��ʾһ�� n λ������, ɾ������ k λ����, 
	 * ʹ��ʣ���������Ȼ����ԭ����˳�����в���һ���µ���������
	 * �ҵ�ɾ�� k ������֮�����С��������
	 * N <= 240, k <= N
	 * 
	 * ����:
	 * ����һ���ַ�������������� A ��һ������ k, ���� A = 178542, k = 4
	 * ����һ���ַ��� "12"
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

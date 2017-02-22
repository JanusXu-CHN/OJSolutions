package janusxuchn;

public class Solution13 {
	/*
	 * ����an % b������a��b��n����32λ��������
	 * 
	 * ����:
	 * ���� 231 % 3 = 2
	 * ���� 1001000 % 1000 = 0
	 * 
     * @param a, b, n: 32bit integers
     * @return: An integer
     */
    public int fastPower(int a, int b, int n) {
        // write your code here
        
        if(a==0){
            return 0;
        }
        
        if(n==0){
            return 1%b;
        }
        
        if(n==1){
            return a%b;
        }
        
        long temp=fastPower(a,b,n/2);
        if(n%2==0){
            temp=(temp*temp)%b;
        }
        else{
            temp=(((temp*temp)%b)*((a%b)%b))%b;
        }
        
        return (int)temp;
    }
}

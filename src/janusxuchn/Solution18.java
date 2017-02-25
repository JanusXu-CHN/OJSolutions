package janusxuchn;

public class Solution18 {
	/**
	 * ��һ����·���� N ������վ��
	 * ���е� i ������վ������gas[i]��
	 * ���Ҵӵ�_i_������վǰ����_i_+1������վ��Ҫ��������cost[i]��
	 * ����һ�������������޴������������Ҫ��ĳһ������վ�����ƻ�·һ�ܣ�һ��ʼ����Ϊ�ա�
	 * ��ɻ��ƻ�·һ��ʱ�����ļ���վ�ı�ţ��������ڻ���һ�ܵķ������򷵻�-1��
	 * 
	 * ̰���㷨������
	 * 
     * @param gas: an array of integers
     * @param cost: an array of integers
     * @return: an integer
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // write your code here
        int[] minus=new int[gas.length]; 
        for(int i=0;i<gas.length;i++){
            minus[i]=gas[i]-cost[i];
        }
        
        int sum=0;
        for(int i=0;i<minus.length;i++){
            sum+=minus[i];
        }
        if(sum<0){
            return -1;
        }
        
        int start=0;
        int stas=1;
        int cargas=0;
        for(int i=0;stas!=gas.length;i++){
            
            if(i==gas.length){
                i=0;
            }
            
            cargas+=minus[i];
            if(cargas<=0){
                stas=1;
                cargas=0;
                start=i+1;
            }
            else{
                stas++;
            }
        }
        
        return start;
    }
}

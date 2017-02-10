package janusxuchn;

public class Solution8 {
    /** 
     * ��һЩԭľ�����������Щľͷ�и��һЩ������ͬ��С��ľͷ��
     * ��Ҫ�õ���С�ε���Ŀ����Ϊ k��
     * ��Ȼ������ϣ���õ���С��Խ��Խ�ã�����Ҫ�����ܹ��õ���С��ľͷ����󳤶ȡ�
     * 
     * ע������:
     * ľͷ���ȵĵ�λ�����ס�
     * ԭľ�ĳ��ȶ���������������Ҫ���и�õ���С��ľͷ�ĳ���ҲҪ����������
     * �޷��г�Ҫ������ k �ε�,�򷵻� 0 ���ɡ�
     * 
     * ����:
     * ��3��ľͷ[232, 124, 456], k=7, ��󳤶�Ϊ114.
     * 
     *@param L: Given n pieces of wood with length L[i]
     *@param k: An integer
     *return: The maximum length of the small pieces.
     */
    public int woodCut(int[] L, int k) {
        // write your code here
        
    	if(L.length==0){
            return 0;
        }
    	
        long sumLength=0;
        int min=L[0];
        for(int i=0;i<L.length;i++){
            sumLength+=L[i];
            if(L[i]<min){
                min=L[i];
            }
        }
        
        long low=min/k;
        long high=sumLength/k;
        
        if(high==0)
            return 0;
            
        if(low==0)
            low=1;
        
        boolean flag=false;
        long i=(low+high)/2; 
        while(high>low){
            
            if(high-low==1){
                if(flag){
                    return (int)i;
                }
                flag=true;
            }
            
            long Lnum=0;
            for(int j=0;j<L.length;j++){
                Lnum+=(L[j]/i);
            }
            if(Lnum>=k){
                low=i;
            }
            else{
                high=i;
            }
            i=(low+high)/2;
        }
        return (int)i;
    }
}

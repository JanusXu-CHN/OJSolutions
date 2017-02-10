package janusxuchn;

public class Solution8 {
    /** 
     * 有一些原木，现在想把这些木头切割成一些长度相同的小段木头，
     * 需要得到的小段的数目至少为 k。
     * 当然，我们希望得到的小段越长越好，你需要计算能够得到的小段木头的最大长度。
     * 
     * 注意事项:
     * 木头长度的单位是厘米。
     * 原木的长度都是正整数，我们要求切割得到的小段木头的长度也要求是整数。
     * 无法切出要求至少 k 段的,则返回 0 即可。
     * 
     * 样例:
     * 有3根木头[232, 124, 456], k=7, 最大长度为114.
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

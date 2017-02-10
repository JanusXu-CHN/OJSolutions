package janusxuchn;

public class Solution9 {
    /** 
     * ������һ������İ�δ֪����ת����ת������
     * (���磬0 1 2 4 5 6 7 ���ܳ�Ϊ4 5 6 7 0 1 2)��
     * ����һ��Ŀ��ֵ����������
     * ������������ҵ�Ŀ��ֵ���������е�����λ�ã����򷵻�-1��
     * ����Լ��������в������ظ���Ԫ�ء�
     * 
     * ����:
     * ����[4, 5, 1, 2, 3]��target=1������ 2
     * ����[4, 5, 1, 2, 3]��target=0������ -1
     * 
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] A, int target) {
        // write your code here
        
        if(A.length==0){
            return -1;
        }
        
        int high=A.length-1;
        int low=0;
        
        boolean flag=false;
        int i;
        for(i=high/2;high>low;i=(high+low)/2){
            if(high-low==1){
                if(flag){
                    break;
                }
                flag=true;
            }
            
            if(A[i]>A[high]){
                low=i;
            }
            else{
                high=i;
            }
        }
        
        if(target>A[A.length-1]){
            low=0;
            high=high;
        }
        else{
            low=high;
            high=A.length;
        }
        
        flag=false;
        for(i=(high+low)/2;high>low;i=(high+low)/2){
            if(high-low==1){
                if(flag){
                    return -1;
                }
                flag=true;
            }
            
            if(A[i]==target){
                return i;
            }
            else if(A[i]>target){
                high=i;
            }
            else{
                low=i;
            }
        }
        
        return -1;
    }
}

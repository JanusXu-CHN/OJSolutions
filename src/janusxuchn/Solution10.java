package janusxuchn;

public class Solution10 {
	/** 
	 * ����һ������ n ���������������飬
	 * �ҳ�����Ŀ��ֵ target ����ʼ�ͽ���λ�á�
	 * ���Ŀ��ֵ���������У��򷵻�[-1, -1]
	 * 
	 * ����:
	 * ����[5, 7, 7, 8, 8, 10]��Ŀ��ֵtarget=8,
	 * ����[3, 4]
	 * 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        // write your code here
        
        if(A.length==0){
            int[] arr={-1,-1};
            return arr;
        }
        
        if(A.length==1){
            if(A[0]==target){
                int[] arr={0,0};
                return arr;
            }
            else{
                int[] arr={-1,-1};
                return arr;
            }
        }
        
        int low=0;
        int high=A.length;
        
        boolean flag=false;
        int i;
        int index=0;
        for(i=high/2;high>low;i=(high+low)/2){
            
            if(high-low==1){
                if(flag){
                    int[] arr={-1,-1};
                    return arr;
                }
                flag=true;
            }
            
            if(A[i]==target){
                index=i;
                break;
            }
            else if(A[i]>target){
                high=i;
            }
            else{
                low=i;
            }
        }

        low=0;
        high=index;
        flag=false;
        for(i=high/2;high>low;i=(high+low)/2){
            if(high-low==1){
                if(flag){
                    break;
                }
                flag=true;
            }
            
            if(A[i]==target){
                high=i;
            }
            else{
                low=i;
            }
        }
        int left=high;
        
        low=index;
        high=A.length;
        flag=false;
        for(i=(high+low)/2;high>low;i=(high+low)/2){
            if(high-low==1){
                if(flag){
                    break;
                }
                flag=true;
            }
            
            if(A[i]==target){
                low=i;
            }
            else{
                high=i;
            }
        }
        int right=high;
        
        int[] arrr={left,right-1};
        return arrr;
    }
}

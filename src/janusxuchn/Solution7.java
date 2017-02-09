package janusxuchn;

public class Solution7 {
	/**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        
        if(matrix.length==0||matrix[0].length==0)
            return false;
        
        int rowSize=matrix.length;
        int colSize=matrix[0].length;
        int size=rowSize*colSize;
        
        int low=0;
        int high=size;
        int row,col;
        
        boolean flag=false;
        for(int i=size/2;high>low;i=(high+low)/2){
            
            if(high-low==1){
                if(flag){
                    return false;
                }
                flag=true;
            }
            
            row=i/colSize;
            col=i%colSize;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                high=i;
            }
            else{
                low=i;
            }
        }
        
        return false;
    }
}

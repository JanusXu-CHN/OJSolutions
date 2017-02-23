package janusxuchn;

public class Solution14 {
	/**
	 * 有一个机器人的位于一个M×N个网格左上角（下图中标记为'Start'）。
	 * 机器人每一时刻只能向下或者向右移动一步。
	 * 机器人试图达到网格的右下角（下图中标记为'Finish'）。
	 * 问有多少条不同的路径？
	 * 
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here 
        int arr[][] = new int[m][n];  
        for(int i=0;i<m;i++)  
            arr[i][0] = 1;  
        for(int i=0;i<n;i++)  
            arr[0][i] = 1;  
        for(int i=1;i<m;i++){  
            for(int j=1;j<n;j++)  
                arr[i][j] = arr[i][j-1] + arr[i-1][j];  
        }
        return arr[m-1][n-1];  
    }
}

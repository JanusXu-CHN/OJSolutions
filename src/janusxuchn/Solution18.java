package janusxuchn;

public class Solution18 {
	/**
	 * 在一条环路上有 N 个加油站，
	 * 其中第 i 个加油站有汽油gas[i]，
	 * 并且从第_i_个加油站前往第_i_+1个加油站需要消耗汽油cost[i]。
	 * 你有一辆油箱容量无限大的汽车，现在要从某一个加油站出发绕环路一周，一开始油箱为空。
	 * 求可环绕环路一周时出发的加油站的编号，若不存在环绕一周的方案，则返回-1。
	 * 
	 * 贪心算法？？？
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

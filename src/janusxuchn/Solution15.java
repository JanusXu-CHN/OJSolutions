package janusxuchn;

public class Solution15 {
	/**
	 * 给定一个数将其转换为二进制（均用字符串表示），
	 * 如果这个数的小数部分不能在 32 个字符之内来精确地表示，则返回 "ERROR"。
	 * 
	 * 样例:
	 * n = "3.72", 返回 "ERROR".
	 * n = "3.5", 返回 "11.1".
	 * 
     *@param n: Given a decimal number that is passed in as a string
     *@return: A string
     */
    public String binaryRepresentation(String n) {
        // write your code here
        
        int index=n.indexOf('.');
        
        String resul="";
        
        //关键点，一定要拆开处理
        double b=Double.parseDouble(n.substring(index));
        int a=Integer.parseInt(n.substring(0,index));
        
        int m=1;
        int x=0;
        
        while(m!=0){
            m=a/2;
            x=a%2;
            
            if(x==0){
                resul="0"+resul;
            }
            else{
                resul="1"+resul;
            }
            
            a=m;
        }
        
        if(b!=0)
            resul+=".";
        
        x=0;
        while((b!=0)&&(x<33)){
            b*=2;
            m=(int)b;
            
            if(m==0){
                resul+="0";
            }
            else{
                resul+="1";
                b-=1;
            }
            
            x++;
        }
        
        if(x==33){
            resul="ERROR";
        }
        
        return resul;
    }
}

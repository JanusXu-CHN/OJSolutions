package janusxuchn;

public class Solution15 {
	/**
	 * ����һ��������ת��Ϊ�����ƣ������ַ�����ʾ����
	 * ����������С�����ֲ����� 32 ���ַ�֮������ȷ�ر�ʾ���򷵻� "ERROR"��
	 * 
	 * ����:
	 * n = "3.72", ���� "ERROR".
	 * n = "3.5", ���� "11.1".
	 * 
     *@param n: Given a decimal number that is passed in as a string
     *@return: A string
     */
    public String binaryRepresentation(String n) {
        // write your code here
        
        int index=n.indexOf('.');
        
        String resul="";
        
        //�ؼ��㣬һ��Ҫ�𿪴���
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

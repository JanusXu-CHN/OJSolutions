package janusxuchn;

public class Solution4 {
	/**
	 * ʵ��atoi���������
	 * ��һ���ַ���ת��Ϊ������
	 * ���û�кϷ�������������0��
	 * �������������32λ�����ķ�Χ��
	 * ����INT_MAX(2147483647)�������������
	 * ����INT_MIN(-2147483648)����Ǹ�������
     * @param str: A string
     * @return An integer
     */
    public int atoi(String str) {
        // write your code here
        long num=0;
        int index=0;
        int flag=0;
        
        str=str.trim();
        
        if(str.length()==0)
        	return 0;
        
        if(str.charAt(0)=='-'){
        	flag=-1;
        	index++;
        }
        else if(str.charAt(0)=='+'){
        	flag=1;
        	index++;
        }
        else if((str.charAt(index)-48)<0&&(str.charAt(index)-48)>9){
        	return 0;
        }
        
        /*if((str.length()>11)&&(flag==-1))
        	return -2147483647;
        
        if(((str.length()>11)&&(flag==1))||((str.length()>10)&&(flag==0)))
        	return 2147483647;
        */
        while(index<str.length()&&index<12&&((str.charAt(index)-48)>=0)&&((str.charAt(index)-48)<=9)){
        	num*=10;
        	num+=str.charAt(index)-48;
        	index++;
        	if(num>2147483648)
        		break;
        }
        
        if(flag==-1)
        	num*=(-1);
        
        if(num>2147483647){
        	return 2147483647;
        }
        else if(num<-2147483648){
        	return -2147483648;
        }
        
        return (int)num;
    }
}

package janusxuchn;

public class Solution23 {
	/**
	 * ����һ������ɾ�������е�����n���ڵ㣬���������ͷ�ڵ㡣
	 * 
	 * һ����ͧ��java����
	 * 
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        int num=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            num++;
        }
        
        temp=head;
        for(int i=0;i<num-n-1;i++){
            temp=temp.next;
        }
        
        if(n==num){
            head=head.next;
        }
        else{
            temp.next=temp.next.next;
        }
        
        return head;
    }
}

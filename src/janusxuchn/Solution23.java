package janusxuchn;

public class Solution23 {
	/**
	 * 给定一个链表，删除链表中倒数第n个节点，返回链表的头节点。
	 * 
	 * 一颗赛艇的java链表
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

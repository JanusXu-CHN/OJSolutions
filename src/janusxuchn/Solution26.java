package janusxuchn;

/**
 * Created by 徐剑锋 on 2017/4/26.
 */
public class Solution26 {
    /**
     * @param head: The head of linked list.
     * @return: void
     */
    public void reorderList(ListNode head) {
        // write your code here

        if(head==null||head.next==null){
            return;
        }

        ListNode midNode=head,temp=head;
        while(temp!=null){
            temp=temp.next;
            if(temp==null){
                break;
            }
            midNode=midNode.next;
            temp=temp.next;
        }
        ListNode newHead=null;
        for(temp=midNode;temp!=null;){
            midNode=temp.next;
            temp.next=newHead;
            newHead=temp;
            temp=midNode;
        }
        for(temp=head;newHead!=null&&temp!=null&&temp.next!=newHead;){
            midNode=temp.next;
            temp.next=newHead;
            newHead=newHead.next;
            temp.next.next=midNode;
            temp=midNode;
        }
    }
}

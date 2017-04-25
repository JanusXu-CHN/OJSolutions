package janusxuchn;

/**
 * Created by 徐剑锋 on 2017/4/25.
 */
public class Solution25 {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        if(head==null){
            return null;
        }

        if(head.next==null){
            RandomListNode temp=new RandomListNode(head.label);
            temp.next=null;
            if(head.random==null){
                temp.random=null;
            }else{
                temp.random=temp;
            }
            return temp;
        }

        for(RandomListNode temp=head;temp!=null;temp=temp.next){
            RandomListNode newNode=new RandomListNode(temp.label);
            newNode.random=temp.random;
            newNode.next=temp.next;
            temp.next=newNode;
            temp=newNode;
        }
        for(RandomListNode temp=head.next;temp!=null&&temp.next!=null;temp=temp.next.next){
            if(temp.random!=null) {
                temp.random = temp.random.next;
            }
        }
        RandomListNode newHead=head.next;
        for(RandomListNode temp=head.next.next,temp2=newHead;temp!=null;temp=temp.next){
            head.next=temp;
            temp=temp.next;
            temp2.next=temp;
            temp2=temp2.next;
        }
        return newHead;
    }
}

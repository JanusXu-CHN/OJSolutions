package janusxuchn;

/**
 * Created by 徐剑锋 on 2017/4/25.
 */
public class Solution24 {
    /**
     * @param head: The first node of linked list.
     * @return: True if it has a cycle, or false
     *
     * 给定一个链表，判断它是否有环。
     * 这种算法很有想法，如果有环必然会追上
     */
    public boolean hasCycle(ListNode head) {
        // write your code here
        ListNode fast=head,slow=head;
        boolean flag=true;
        while(fast!=null){
            if(flag){
                fast=fast.next;
                flag=false;
            }else{
                fast=fast.next;
                slow=slow.next;
                flag=true;
            }
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}

package janusxuchn;

public class ListNode {
	int val;
	ListNode next;
	
	ListNode(int val) {
		this.val = val;
	    this.next = null;
	}

	public static ListNode creatListNode(int[] items){
		ListNode head=new ListNode(items[0]);
		ListNode temp=head;
		for(int i=1;i<items.length;i++){
			temp.next=new ListNode(items[i]);
			temp=temp.next;
		}
		return head;
	}

	public static void dispListNode(ListNode head){
		for(ListNode temp=head;temp!=null;temp=temp.next){
			System.out.print(temp.val+"->");
		}
		System.out.print("null");
	}
}
package janusxuchn;

import java.util.ArrayList;

//import java.util.List;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={2,-1,0};
		ListNode head=ListNode.creatListNode(num);
		Solution26 solution26=new Solution26();
		solution26.reorderList(head);
		ListNode.dispListNode(head);
	}

}

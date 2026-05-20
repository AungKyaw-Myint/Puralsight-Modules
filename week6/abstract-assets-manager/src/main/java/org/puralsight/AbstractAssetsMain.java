package org.puralsight;

import org.puralsight.model.AbstractAsset;
import org.puralsight.model.Cash;

public class AbstractAssetsMain {

    static void main() {

        Cash asset=new Cash();
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        removeNthFromEnd(head, 2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        int i=0;
        while (head.next!= null){
            if(n+1==i){
                head.next=head.next.next;
            }
        }

        return head;
    }
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}

public class PartitionList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
          this.val = val;
        }
        ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
        }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode();
        ListNode large = new ListNode();

        while(head.next!=null){
            if (head.val < x){
                small = head;
                small = small.next;
            }else{
                large = head;
                large = large.next;
            }

            head = head.next;
        }

        small.next = large;
        large.next = null;

        return small;
    }

}

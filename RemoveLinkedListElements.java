public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode previousNode = null;
        ListNode currentNode = head;

        if (head == null || head.next==null){
            return head;
        }
        while(currentNode!=null){
            if(currentNode.val == val){
                if (previousNode!=null) {
                    previousNode.next = currentNode.next;
                    currentNode = currentNode.next;
                }

                else{
                    head = head.next;
                    currentNode = head;
                }
            }
            else{

                previousNode=currentNode;
                currentNode = currentNode.next;
            }


        }

        return head;
    }
}

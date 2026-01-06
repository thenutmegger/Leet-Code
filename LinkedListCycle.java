public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode currentNode = head;
        while (currentNode!=null){
            if (currentNode.val != -1){
                currentNode.val = -1;
            }
            else{
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;

    }
}

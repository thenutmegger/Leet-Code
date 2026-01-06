public class ConvertBinaryNumberInALinkedListToInteger {
    public static int getDecimalValue(ListNode head) {
        int sum = 0;
        ListNode currentNode = head;
        int size = 0;

        while(currentNode != null){
            size++;
            currentNode = currentNode.next;
        }

        while(head!=null){
            sum = sum + (int)(head.val*Math.pow(2,size-1));
            head = head.next;
            size--;
       }

        return sum;
}
}

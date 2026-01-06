import java.util.Stack;
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();

//        while (head != null){
//            if (stack.isEmpty() || stack.peek() != head.val){
//                stack.push(head.val);
//            }
//
//            else{
//                stack.pop();
//            }
//
//            head = head.next;
//        }
//
//        return stack.size() == 0;
        ListNode currentNode = head;
        while(currentNode!=null){
            stack.push(currentNode.val);
            currentNode = currentNode.next;
        }

        while(head!=null){
            if (head.val == stack.peek()){
                stack.pop();
            }
            head = head.next;
        }

        return stack.isEmpty();


    }
}

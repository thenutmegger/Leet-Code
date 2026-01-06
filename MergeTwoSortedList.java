import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode ptr1=list1;
        ListNode ptr2=list2;

        while(ptr1!=null){
            arr.add(ptr1.val);
            ptr1=ptr1.next;
        }
        while(ptr2!=null){
            arr.add(ptr2.val);
            ptr2=ptr2.next;
        }

        Collections.sort(arr);

        ListNode res=new ListNode();
        if(arr.size()==0) return null;
        res.val=arr.get(0);
        if(arr.size()==1) return res;
        res.next=new ListNode();
        ListNode ptr=res;
        for(int i=1; i<arr.size(); i++){
            ListNode newNode=new ListNode();
            ptr.next=newNode;
            ptr.next.val=arr.get(i);
            ptr=ptr.next;
        }
        ptr=null;
        return res;
    }

}


package org.practice;

public class removeDuplicatesFromSortedList {
    //Given the head of a sorted linked list,
    // delete all duplicates such that each element appears only once.
    // Return the linked list sorted as well.
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while(head!=null){
            //skip all duplicate nodes
            while(head.next!=null && head.val == head.next.val){
                head = head.next;
            }
            cur.next = head;
            cur = cur.next;
            head = head.next;
        }
        return dummy.next;
    }
}

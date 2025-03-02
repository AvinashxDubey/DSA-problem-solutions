package org.practice;

public class reverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode temp = head;
        for(int i=1; i<left-1; i++){
            temp = temp.next;
        }

        ListNode startNode = temp;
        temp = temp.next;
        ListNode prev = temp;

        while(left<=right){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        prev.next = temp;
        return head;
    }
}

package org.practice;


 //Definition for singly-linked list.
 class ListNode {
      int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while(list1 != null && list2 !=  null){
            if(list1.val >= list2.val){
                curr.next = list2;
                list2 = list2.next;
            }
            else{ //list1.val < list2.val
                curr.next = list1;
                list1 = list1.next;
            }
            curr = curr.next;
        }
        curr.next = (list1!=null)? list1 : list2;
        return dummy.next;
    }

    public static ListNode createLinkedList(int[] arr){
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        for(int a : arr){
            cur.next = new ListNode(a);
            cur = cur.next;
        }

        return dummy.next;
    }

    public static void printLinkedList(ListNode head){
        System.out.print("[");
        while(head != null){
            System.out.print(head.val + ", ");
            head = head.next;
        }
        System.out.print("null]");
    }

    public static void main(String[] args) {
        ListNode list1 = createLinkedList(new int[] {1, 2, 4});
        ListNode list2 = createLinkedList(new int[] {1, 3, 4});
        ListNode newList = mergeTwoLists(list1, list2);
        printLinkedList(newList);
    }
}
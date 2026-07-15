
class Solution {
    public void reorderList(ListNode head) {
        // phele midpoint nikalo
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // ab second half ko divide kerdo
        ListNode secondHalf = slow.next;
        slow.next = null;
        // now reverse second half
        ListNode prev = null;
        ListNode curr = secondHalf;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        secondHalf = prev;

        // final step - combine the two ll alternatively
        ListNode first = head;
        ListNode second = secondHalf;
        while (second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }

    }
}
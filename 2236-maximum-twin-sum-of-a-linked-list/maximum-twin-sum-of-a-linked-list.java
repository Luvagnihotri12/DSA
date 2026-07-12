/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while( temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        int i =0; int j = arr.size()-1;
        int maxSum =0;
        while(i<=j){
            int a = arr.get(i), b = arr.get(j);
            if (a+b > maxSum){
                maxSum = a+b;
            }
            i++;
            j--;

        }
        return maxSum;
    }
}
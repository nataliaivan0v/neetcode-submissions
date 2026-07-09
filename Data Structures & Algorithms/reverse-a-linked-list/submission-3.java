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
    public ListNode reverseList(ListNode head) {
        try {
            ListNode node = head.next;
        } catch (NullPointerException e) {
            return head;
        }

        if (head.next == null) {
            return head;
        }

        List<Integer> reversed = new ArrayList<>();
        while (head != null) {
            reversed.add(head.val);
            head = head.next;
        }

        Collections.reverse(reversed);

        ListNode nextHead = new ListNode(reversed.get(1));
        ListNode currentHead = new ListNode(reversed.get(0), nextHead);
        ListNode newHead = currentHead;
        for (int i = 2; i <= reversed.size() - 1; i++) {
            ListNode newNextHead = new ListNode(reversed.get(i));
            System.out.println(newNextHead.val);
            nextHead.next = newNextHead; 
            nextHead = newNextHead;
            if (i == 0) {
                newHead = currentHead;
            }
        }

        return newHead;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode checkA = headA;
        ListNode checkB = headB;
        HashSet<ListNode> set = new HashSet<>();

        while(checkA != null){
            set.add(checkA);
            checkA = checkA.next;
        }

        while(checkB != null){
            if(set.contains(checkB)){
                return checkB;
            }
            checkB = checkB.next;
        }

        return null;
    }
}

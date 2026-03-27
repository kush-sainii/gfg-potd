
class Node
{
    int data;
    Node next;
}


class Solution {
public static boolean removeLoop(Node head) {
        if (head == null || head.next == null) {
            return false; // No cycle possible
        }

        Node slow = head;
        Node fast = head;
        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) {
            return false; // No cycle to remove
        }

        // Find the start of the cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }


        Node prev = fast;
        while (fast.next != slow) {
            fast = fast.next;
            prev = fast;
        }

        prev.next = null;
        return true;
    }

}
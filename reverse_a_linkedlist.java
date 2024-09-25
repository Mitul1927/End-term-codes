/*Given a pointer to the head node of a doubly linked list, reverse the linked list*/

class Solution {
    public ListNode reverseList(Node head) {
        Node current = head;
        Node temp = null;

        // Traverse the list and swap next and prev for each node
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;  // Move to the next node in the original list
        }

        // If the list is not empty, set the new head to the last node
        if (temp != null) {
            head = temp.prev;  // temp.prev is the last node after reversal
        }
    }
}

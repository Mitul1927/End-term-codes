/*Problem 4: Swap Two Nodes of Doubly Linked List
Given a pointer to the head node of a doubly linked list and two keys, swap these two nodes of
the list (if these nodes exists in the list).*/

public class deleteANodeFromDoublyLinkedList {
    class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data= data;
            this.prev = null;
            this.next = null;
        }
    }
    Node Head;
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(Head==null){
            Head = new Node(data);
            return;
        }
        Node last = Head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;
    }
    // question 3 - Given a pointer to the head node of a doubly linked list, insert a new node with a given value at
    //a specified position.
    void insertAtMiddle(int data,int index){
        Node newNode  = new Node(data);
        if(Head==null){
            Head = new Node(data);
            return;
        }
        Node curr = Head;
        int i = 1;
        while(curr.next!=null && i<index){
            curr = curr.next;
            i++;
        }
        if(curr.next==null){
            curr.next = newNode;
            newNode.prev = curr;
            return;
        }
        newNode.next = curr.next;
        curr.next.prev = newNode;
        newNode.prev  = curr;
        curr.next = newNode;
    }
    void deleteNode(int data){
        if(Head==null){
            return;
        }
        Node current = Head;
        while(current!=null && current.data!=data){
            current=current.next;
        }
        if(current==null){
            return;
        }
        if(current==Head){
            Head = current.next;
            if(Head!=null){
                Head.prev = null;
            }
        }else{
            if(current.next!=null){
                current.next.prev = current.prev;
            }
            if(current.prev!=null){
                current.prev.next = current.next;
            }
        }
        current.next = null;
        current.prev = null;
    }
    void printList(){
        Node curr = Head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    void swapTwoNodes(int data1,int data2){
        if(Head==null || data1==data2){
            return;
        }
        Node key1 = Head;
        Node key2 = Head;
        while(key1!=null && key1.data!=data1){
            key1 = key1.next;
        }
        while(key2!=null && key2.data!=data2){
            key2 = key2.next;
        }
        if(key1==null || key2==null){
            return;
        }
        if(key1==Head){
            Head=key2;
        }else if(key2==Head){
            Head = key1;
        }
        if(key1.next!=null){
            key1.next.prev = key2;
        }
        if(key2.next!=null){
            key2.next.prev = key1;
        }
        if(key1.prev!=null){
            key1.prev.next = key2;
        }
        if(key2.prev!=null){
            key2.prev.next = key1;
        }
        Node temp = key1.next;
        key1.next = key2.next;
        key2.next = temp;

        temp = key1.prev;
        key1.prev = key2.prev;
        key2.prev = temp;
    }
    public static void main(String[] args) {
        deleteANodeFromDoublyLinkedList dll = new deleteANodeFromDoublyLinkedList();

        // Insert some nodes
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        dll.insertAtEnd(50);

        System.out.println("Original List:");
        dll.printList();  // Output: 10 20 30 40 50

        // Delete a node
        dll.deleteNode(30);
        System.out.println("After deleting 30:");
        dll.printList();  // Output: 10 20 40 50
        dll.insertAtMiddle(70,2);
        dll.insertAtMiddle(110,9);
        System.out.println("after adding 70");
        // Try to delete a node that doesn't exist
        dll.deleteNode(100);  // Output: Key 100 not found in the list.
        dll.printList();
    }
}

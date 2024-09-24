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

        // Try to delete a node that doesn't exist
        dll.deleteNode(100);  // Output: Key 100 not found in the list.
    }
}

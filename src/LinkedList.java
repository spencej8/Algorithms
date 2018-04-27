public class LinkedList<E> {

    public Node head;
    public int size;

    public LinkedList() {
        head = null;
    }

    public Node getHead() {
    	return head;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addToHead(StaffMember element) {
        Node temp = new Node(element, null);
        temp.next = head;
        head = temp;
        size++;
    }

    public void removeHead() {
        head = head.next;
        size--;
    }
    

    // Node class within LinkedList:
    public class Node {
        StaffMember element;
        Node next;

        public Node(StaffMember element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
    
}
import java.util.NoSuchElementException;

public class LinkedList<E> {

    Node head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(StaffMember element) {
        head = new Node(element, head);
    }
    
    public Node getHead() {
    	
    	return head;
    }

    public Object removeHead() {
        Node temp = getHead();
        head = head.next;
        return temp;
    }
    

    // Node class within LinkedList:
    public class Node<E> {
        StaffMember element;
        Node<Object> next;

        public Node(StaffMember element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
    
}
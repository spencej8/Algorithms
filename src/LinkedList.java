public class LinkedList<E> {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addToHead(E element) {
        Node temp = new Node(element, head, null);

        if (head != null)
            head.prev = temp;
        head = temp;

        if (tail == null)
            tail = temp;
        size++;
    }

    public void removeHead() {
        if (size != 0) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void addToTail(E element) {
        Node temp = new Node(element, null, tail);

        if (tail != null)
            tail.next = temp;
        tail = temp;

        if (head == null)
            head = temp;
        size++;
    }

    public void removeTail() {
        if (size != 0) {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    // Node class within LinkedList:
    public class Node {
        E element;
        Node next;
        Node prev;

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    
}
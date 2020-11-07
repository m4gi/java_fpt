public class Node<T> {

    Node previous;
    T data;
    Node next;

    public Node() {
    }

    public Node(T data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public Node(Node previous, T data, Node next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }
}
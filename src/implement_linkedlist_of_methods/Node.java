package implement_linkedlist_of_methods;

public class Node {
    public Node next;
    public Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }
}

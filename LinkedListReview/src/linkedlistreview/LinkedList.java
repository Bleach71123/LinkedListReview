package linkedlistreview;

public class LinkedList {

    protected Node head;
    
    public LinkedList() {
        head = null;
    }

    public void addFirst(String v) {
    	head = new Node(v, head, null);
    }
}

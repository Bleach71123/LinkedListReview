package linkedlistreview;

public class Node {
    protected Node next;
    protected Node previous;
    protected String value;
    
    public Node(String v, Node n, Node p){
        value = v;
        next = n;
        previous = p;
    }
    
}

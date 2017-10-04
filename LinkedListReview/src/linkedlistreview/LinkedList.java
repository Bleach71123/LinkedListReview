package linkedlistreview;

public class LinkedList {

    protected Node head;
    
    public LinkedList() {
        head = null;
    }
    
    public String getFirst(){
        
        return head.value;
        
    }
    public String getLast(){
        Node hold = head;
        while (hold.next != null){
            hold = hold.next;
        }
        return hold.value;
    }

    public void addFirst(String v) {
    	head = new Node(v, head, null);

    }
}

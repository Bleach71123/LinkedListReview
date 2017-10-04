package linkedlistreview;

public class LinkedList {

    protected Node head;
    
    public LinkedList() {
        head = null;
    }
    
    public void addLast(String value){
        Node hold = head;
        while (hold.next != null)
            hold = hold.next;
        hold.next = new Node(value, null, hold);
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
    
    @Override
    public String toString(){
        Node hold = head;
        String output = "";
        while (hold != null){
            output += hold.value + " ";
            hold = hold.next;
        }
        return output;
    }
    
}

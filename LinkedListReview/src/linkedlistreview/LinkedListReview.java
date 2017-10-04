package linkedlistreview;

public class LinkedListReview {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("One");
        list.addFirst("Two");
        list.addLast("Three");
        System.out.println(list.toString());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
    
}

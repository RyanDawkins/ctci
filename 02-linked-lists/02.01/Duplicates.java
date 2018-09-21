import java.util.*;
public class Duplicates {
    
    public static void main(String[] args) {
        Node n4 = new Node(2);
        Node n3 = new Node(n4, 1);
        Node n2 = new Node(n3, 2);
        Node n1 = new Node(n2, 1);

        print(n1);
        removeDuplicates(n1);
        print(n1);
        
    }

    public static void print(Node list) {
        System.out.print(""+list.getData());
        printNext(list.getNext());
        System.out.println();
    }

    public static void printNext(Node list) {
        if(list == null) {
            return;
        }
        System.out.print(" -> "+list.getData());
        printNext(list.getNext());
    }

    public static void removeDuplicates(Node list) {
        Node previous = list;
        Node current = list.getNext();
        HashMap<Integer, Boolean> map = new HashMap<>();
        map.put(previous.getData(), true);
        while(current != null) {
            Boolean exists = map.get(current.getData());
            if(exists == null || !exists) {
                map.put(current.getData(), true);
                previous = current;
                current = previous.getNext();
                continue;
            }
            Node next = current.getNext();
            previous.setNext(next);
            current = next;
        }
    }
}
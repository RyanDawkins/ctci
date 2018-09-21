public class DeleteSingle {

    public static void main(String[] args) {
        
        Node a = new Node('a');
        Node b = new Node('b');
        Node c = new Node('c');
        Node d = new Node('d');
        Node e = new Node('e');
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);

        print(a);
        deleteMiddle(c);
        print(a);
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

    public static void deleteMiddle(Node c) {
        if(c.getNext() == null) {
            return;
        }

        c.setData(c.getNext().getData());
        c.setNext(c.getNext().getNext());
    }

}
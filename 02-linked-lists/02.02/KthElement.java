public class KthElement {

    public static void main(String[] args) {
        Node previous = new Node(0);
        Node first = previous;
        for(int i = 1; i < 100; i++) {
            previous.setNext(new Node(i));
            previous = previous.getNext();

        }

        print(first);

        Node node = getKthElement(first, 3);
        System.out.println("Element "+node.getData());
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

    public static Node getKthElement(Node node, int kth) {

        Node current = null;
        Node runner = node;
        int counter = 0;
        while(runner != null) {
            if(counter == kth) {
                current = node;
            }

            if(current != null) {
                current = current.getNext();
            }
            runner = runner.getNext();
            counter++;
        }
        return current;
    }

}
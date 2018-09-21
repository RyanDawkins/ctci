public class Node {
    private Node next;
    private char data;

    public Node(char data) {
        this.data = data;
    }

    public Node(Node next, char data) {
        this.next = next;
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

    public void setData(char data) {
        this.data = data;
    }

    public char getData() {
        return this.data;
    }
}
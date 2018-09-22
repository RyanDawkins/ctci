
public class Node {

    private final Node left;
    private final Node right;

    public Node() {
        this.left = null;
        this.right = null;
    }

    public Node(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }
}
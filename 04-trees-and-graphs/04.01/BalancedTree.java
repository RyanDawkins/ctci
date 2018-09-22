public class BalancedTree {


    public static void main(String[] args) {

        Node leftleftLeft = new Node();
        Node leftLeft = new Node(leftleftLeft, null);
        Node leftRight = new Node();
        Node left = new Node(leftLeft, leftRight);
        Node right = new Node();
        Node root = new Node(left, right);

        int depth = search(root, 1);
        System.out.println("Depth "+depth);
    }

    public static int search(Node node, int depth) {
        int leftDepth = node.getLeft() == null 
            ? depth
            : search(node.getLeft(), depth+1);
        int rightDepth = node.getRight() == null
            ? depth
            : search(node.getRight(), depth+1);
        
        if(leftDepth == -1) {
            return -1;
        }
        if(rightDepth == -1) {
            return -1;
        }
        if(Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }

        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }

}
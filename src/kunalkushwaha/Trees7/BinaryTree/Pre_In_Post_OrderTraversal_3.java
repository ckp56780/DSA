package kunalkushwaha.Trees7.BinaryTree;
//tino ek hi file m kr rha hu--pre,In,and post order traversal
public class Pre_In_Post_OrderTraversal_3 {

    public static class Node {
        int val; //initial at 0
        Node left; //initial null
        Node right; // initial null;

        public Node(int val) {
            this.val = val;
        }
    }
    //pre-order traversal
    private static void preOder(Node root) {
        if (root==null) return;
        System.out.println(root.val);
        preOder(root.left);
        preOder(root.right);
    }
    //in-order traversal
    private static void InOder(Node root) {
        if (root==null) return;
        preOder(root.left);
        System.out.println(root.val);
        preOder(root.right);
    }
    //post-order traversal
    private static void PostOder(Node root) {
        if (root==null) return;
        PostOder(root.left);
        PostOder(root.right);
        System.out.println(root.val);
    }

    //here main method-
    public static void main(String[] args) {
        Node root=new Node(1);  //here node=root we can assume

        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        b.right=e;

        //calling the preOder
        preOder(root);

        System.out.println("................");

        //calling the InOder
        InOder(root);

        System.out.println("..............");

        //calling the postOder
        PostOder(root);
    }


}

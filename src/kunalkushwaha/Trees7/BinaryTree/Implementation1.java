package kunalkushwaha.Trees7.BinaryTree;

public class Implementation1 {
    public static class Node{
        int val; //initial at 0
        Node left; //initial null
        Node right; // initial null;

        public Node(int val) {
            this.val=val;
        }
    }

    //print the all value in the form of trees
    public static void display(Node root){

        //base case
        if (root==null)return;
        System.out.print(root.val+ "->");
        if (root.left!=null) System.out.print(root.left.val+" ");
        if (root.right!=null) System.out.print(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {

        Node root=new Node(2);  //here node=root we can assume
        //node.val=10;
       // System.out.println(node.val); //not use only node //10
        //if node.val is not given then it will print 0 //0
       // System.out.println(node.left); //null
      //  System.out.println(node.right); //null

       // or
         //System.out.println(node.val); //not use only node //10
        //if node.val is not given then it will print 0 //0
         //System.out.println(node.left); //null
         // System.out.println(node.right); //null

        Node a=new Node(4);
        Node b=new Node(10);
        root.left=a;
        root.right=b;
        Node c=new Node(6);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(11);
        b.right=e;

        //display root
        display(root);
    }
}

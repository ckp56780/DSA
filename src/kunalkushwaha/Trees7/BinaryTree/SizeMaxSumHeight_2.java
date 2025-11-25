package kunalkushwaha.Trees7.BinaryTree;
public class SizeMaxSumHeight_2 {
   // static int size=0;
    public static class Node {
        int val; //initial at 0
        Node left; //initial null
        Node right; // initial null;

        public Node(int val) {
            this.val = val;
        }
    }
   // public static void preOrder(Node root){
        //if (root==null) return;
       // System.out.print(root.val+" ");
       // size++;
      //  preOrder(root.left);
      //  preOrder(root.right);  //ctrl+shift+inter to get into new line

   // }

    //calculate the size of the binary tree
    public static int size(Node root){
        //base case
        if (root==null) return 0;
        return 1+ size(root.left)+size(root.right);
    }

    //calculate the sum of trees
    public static int sum(Node root){
        //base case
        if (root==null) return 0;
        return root.val+ sum(root.left)+sum(root.right);
    }

    //calculate the max of the tree
    public static int max(Node root){
        //base case
        if (root==null) return Integer.MIN_VALUE;
        int a=root.val;
        int b=max(root.left);
        int c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }

    public static int height(Node root){
        if (root==null || (root.left==null && root.right==null)) return 0;
        //or
        //if (root.left==null && root.right==null) return 0;  //it is called as leaf node
        return 1+Math.max(height(root.left),height(root.right));
    }

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
        // preOrder(root); //1 2 4 5 3 6 --preorder me print hoga
        // System.out.println(size); //here we are using the global variable

        //calling the size method to print the size
        System.out.println(size(root));  //6
//        size(root); we cant write this way

        //calling the sum of trees
        System.out.println(sum(root)); //21

        //calling the max number from the tree
        System.out.println(max(root));  //6

        //calling the height of the tree
        System.out.println(height(root)); //3
    }
}

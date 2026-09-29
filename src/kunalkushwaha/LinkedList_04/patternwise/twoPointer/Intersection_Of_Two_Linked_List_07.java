package kunalkushwaha.LinkedList_04.patternwise.twoPointer;

// LeetCode 160
public class Intersection_Of_Two_Linked_List_07 {

    // Create Node
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Common part
        Node common = new Node(8);
        common.next = new Node(4);
        common.next.next = new Node(5);

        // List A
        Node headA = new Node(4);
        headA.next = new Node(1);
        headA.next.next = common;

        // List B
        Node headB = new Node(5);
        headB.next = new Node(6);
        headB.next.next = new Node(1);
        headB.next.next.next = common;

        Node intersection = getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println(
                    "Intersection Node : " + intersection.data);
        } else {
            System.out.println("No Intersection");
        }
    }

    // Logic starts here
    private static Node getIntersectionNode(Node headA, Node headB) {


        //matlab headA and headB  dono null hai to direct null return kr do
        if(headA==null || headB==null){
            return null;
        }

        //starting from here base case
        //jab tak p1=p2 ni ho hai tab tak tarvel krte rho aur jaise hi eqaul hua rok do aur we get the
        //intersection point
        Node p1=headA;
        Node p2=headB;

        while(p1!=p2){

            //travel p1 in whole road then do for same p2
            if(p1==null){
                p1=headB;
            }else{
                p1=p1.next;
            }

            //travel p1 in whole road then do for same p2
            if(p2==null){
                p2=headA;
            }else{
                p2=p2.next;
            }
        }
        return p1;
    }
}
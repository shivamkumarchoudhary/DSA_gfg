/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
        // code here
           Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }
     static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

}
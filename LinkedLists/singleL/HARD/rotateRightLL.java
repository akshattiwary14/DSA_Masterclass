package LinkedLists.singleL.HARD;

public class rotateRightLL {
    public static void main(String[] args) {
        
    }
    public static Node rotateRightLLSolver(Node head,int k) {
        if(head == null || head.next == null || k==0)return head;
        Node tail = head;
        int length = 1;
        while(tail.next!=null){
            tail = tail.next;
            length++;
        }
        k = k%length;
        tail.next = head;
        int newTailLength = length-k;
        Node newTail = head;
        for (int i = 1; i < newTailLength; i++) {
            newTail = newTail.next;
        }
        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
class Node{
    Node prev;
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
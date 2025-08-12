package LinkedLists.singleL;

public class reverseLL {
    public static void main(String[] args) {
        //Declare an array and then convert it to a Single LinkedList And then reverse the LL.
    }
    public static Node reverseLLSolver(Node head) {
        if(head == null || head.next == null)return head;
        Node front = head;
        Node back = null;
        while(front!=null){
            Node temp = front.next;
            front.next = back;
            back = front;
            front = temp;
        }
        return back;
    }
    public static Node recursive_reverseLLSolver(Node head){
        if(head == null || head.next == null)return head;
        Node newHead = recursive_reverseLLSolver(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        next = null;
    }    
}
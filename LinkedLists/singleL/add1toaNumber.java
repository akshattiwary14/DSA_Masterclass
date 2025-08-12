package LinkedLists.singleL;

public class add1toaNumber {
    public static void main(String[] args) {
        //Declare an array and then convert it to a Single LinkedList.
        //Make two lists with digits odf the numbers in reverse order and then pass into the below func.
    }
    public static Node add1toaNumberSolver(Node head) {
        head = reverseLL(head);
        Node current = head;
        Node prev = null;
        int carry = 1;
        while(current!=null){
            int sum = current.data + carry;
            current.data = sum%10;
            carry = sum/10;
            prev = current;
            current = current.next;
        }
        if(carry>0)prev.next = new Node(carry);
        head = reverseLL(head);
        return head;
    }
    public static Node Optimal_add1toaNumberSolver(Node head) {
        if(head == null || head.next == null)return head;
        int carry = carryFinder(head);
        if(carry == 1){
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }
    public static int carryFinder(Node head) {
        if(head == null || head.next == null)return 1;
        int carry = carryFinder(head.next);
        head.data = head.data + carry;
        if(head.data < 10){
            return 0;
        }
        head.data = 0;
        return 1;
    }
    public static Node reverseLL(Node head){
        Node current = head;
        Node prev = null;
        while(current!=null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
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
    Node(){}
} 
package LinkedLists.singleL.HARD;
public class reverseInGroupOFK {
    public static void main(String[] args) {
        
    }
    public static Node reverseInGroupOFKSolver(Node head,int k) {
        Node temp = head;
        Node nextNode = null;
        Node newHead = null;
        Node prevNode = null;
        while(temp!=null){
            Node kthNode = findKthNode(head, k);
            if(kthNode == null){
                break;
            }
            nextNode = kthNode.next;
            kthNode.next = null;
            newHead = reverseLL(head);
            if(head == temp){
                head = kthNode;
            }else{
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = nextNode;
        }
        
        return head;
    }
    public static Node findKthNode(Node head, int k) {
        int count = 1;
        Node temp = head;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        return temp; // this is the kth node
    }
    public static Node reverseLL(Node head){
        Node current = head;
        Node prev = null; 
        while(current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
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

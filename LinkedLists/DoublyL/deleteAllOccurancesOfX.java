package LinkedLists.DoublyL;

public class deleteAllOccurancesOfX {
    public static void main(String[] args) {
        
    }
    public static Node deleteAllOccurancesOfXSolver(Node head,int x) {
        if(head==null)return null;
        Node temp = head;
        while(temp!=null){
            if(temp.data == x){
                if(temp == head){
                    head = head.next;
                }
                Node prev = temp.prev;
                Node next = temp.next;
                if(prev!=null)prev.next = next;
                if(next!=null)next.prev = prev;
            }
            temp = temp.next;
        }
        return head;
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

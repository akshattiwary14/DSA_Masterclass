package LinkedLists.singleL;

import java.util.ArrayList;

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
public class oddEvenPlacement {
    public static void main(String[] args) {
        //Create a LinkedList and then pass into either the two function to create a evenodd indexed linkedlist
    }
    public static Node Brute_oddEvenPlacementSolver(Node head) {
        if(head == null || head.next == null)return head;
        Node mover = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(mover!=null){
            arr.add(mover.data);
            mover = (mover.next!=null)?mover.next.next:null;
        }
        mover = head.next;
        while(mover!=null){
            arr.add(mover.data);
            mover = (mover.next!=null)?mover.next.next:null;
        }
        mover = head;
        for (Integer integer : arr) {
            mover.data = integer;
            mover = mover.next;            
        }
        return head;
    }

    public static Node Better_oddEvenPlacementSolver(Node head) {
        if(head == null || head.next == null)return head;
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while(even != null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}

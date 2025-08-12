package LinkedLists.DoublyL;

import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        
    }
    public static Node removeDuplicatesSolver(Node head) {
        if(head == null)return null;
        Node current = head;
        HashSet<Integer> seen = new HashSet<>();
        while(current!=null){
            if(seen.contains(current.data)){
                if(current.prev!=null){
                    current.prev.next = current.next;
                }else{
                    head = head.next;
                }
                if(current.next!=null)current.next.prev = current.prev;
            }else{
                seen.add(current.data);
            }
            current = current.next;
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
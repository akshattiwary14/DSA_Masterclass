package LinkedLists.DoublyL;

import java.util.ArrayList;

public class sumEqualToTarget {
    public static void main(String[] args) {
        
    }
    public static ArrayList<ArrayList<Integer>> sumEqualToTargetSolver(Node head,int target) {
        Node back = head;
        Node front = head;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        while(back!=null && back.next!=null){
            back = back.next;
        }
        while(front.data < back.data){
            int sum = front.data+back.data;
            if(sum == target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(front.data);
                pair.add(back.data);
                arr.add(pair);
                front = front.next;
                back = back.prev;
            }else if(sum > target){
                back = back.prev;
            }else{
                front = front.next;
            }
        }
        return arr;
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

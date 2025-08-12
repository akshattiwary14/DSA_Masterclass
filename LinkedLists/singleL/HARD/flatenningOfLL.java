package LinkedLists.singleL.HARD;

import java.util.ArrayList;
import java.util.Collections;

public class flatenningOfLL {
    public static void main(String[] args) {
        
    }
    public static Node Brute_flatenningOfLLSolver(Node root) {
        if(root==null)return null;
        Node mover = root;
        ArrayList<Integer> arr = new ArrayList<>();
        while(mover!=null){
            Node BottomMover = mover;
            while(BottomMover !=null){
                arr.add(BottomMover.data);
                BottomMover = BottomMover.bottom;
            }
            mover = mover.next;
        }
        Collections.sort(arr);
        Node dummy = new Node(-1);
        Node temp = dummy;
        for (Integer val : arr) {
            temp.bottom = new Node(val);
            temp = temp.bottom;
        }
        temp = dummy.bottom;
        while (temp != null) {
            temp.next = null;
            temp = temp.bottom;
        }
        return dummy.bottom;
    }

    public static Node Optimal_flatenningOfLLSolver(Node root) {
        if (root == null || root.next == null) return root;
        root.next = Optimal_flatenningOfLLSolver(root.next);
        root = mergeTwoLists(root, root.next);
        root.next = null;
        return root;
    }
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node mover = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                mover.bottom = list1;
                list1 = list1.bottom;
            } else {
                mover.bottom = list2;
                list2 = list2.bottom;
            }
            mover = mover.bottom;
        }
        if (list1 != null) mover.bottom = list1;
        if (list2 != null) mover.bottom = list2;

        return dummy.bottom;
    }
}
class Node{
    Node bottom;
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
    Node(Node bottom, int data, Node next) {
        this.bottom = bottom;
        this.data = data;
        this.next = next;
    }
}
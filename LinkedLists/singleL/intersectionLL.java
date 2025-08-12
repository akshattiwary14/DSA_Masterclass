package LinkedLists.singleL;

import java.util.HashMap;
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
public class intersectionLL {
    public static void main(String[] args) {
        
    }
    public static Node Brute_intersectionLLSolver(Node headA , Node headB) {
        if(headA == null || headB == null)return null;
        Node moverA = headA;
        Node moverB = headB;
        while(moverA!=null){
            while(moverB!=null){
                if(moverB == moverA)return moverB;
                moverB = moverB.next;
            }
            moverB = headB;
            moverA = moverA.next;
        }
        return null;
    }
    public static Node Better_intersectionLLSolver(Node headA,Node headB) {
        if(headA==null || headB==null)return null;
        HashMap<Node,Integer> freq = new HashMap<>();
        Node temp = headA;
        int idx = 0;
        while(temp!=null){
            freq.put(temp,idx);
            idx++;
            temp = temp.next;
        }
        temp = headB;
        while(temp != null){
            if(freq.containsKey(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public static Node Optimal_intersectionLLSolver(Node headA,Node headB) {
        if(headA == null && headB == null)return null;
        int lenA = lengthLL(headA);
        int lenB = lengthLL(headB);
        int diff = Math.abs(lenA - lenB);
        if(lenA>lenB){
            headA = collisionPoint(headA, headB , diff);
        }else if(lenB>lenA){
            headB = collisionPoint(headB, headA , diff);
        }
        Node moverA = headA;
        Node moverB = headB;
        while(moverA!=null && moverB!=null){
            if(moverA == moverB)return moverA;
            moverA = moverA.next;
            moverB = moverB.next;
        }
        return null;
    }
    public static int lengthLL(Node head) {
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static Node collisionPoint(Node A , Node B , int diff) {
        Node temp = A;
        int count = diff;
        while(temp!=null&&count>0){
            count--;
            temp = temp.next;
        }
        return temp;
    }

    public static Node GOLD_intersectionLLSolver(Node headA , Node headB) {
        if(headA == null || headB == null)return null;
        Node moverA = headA;
        Node moverB = headB;
        while(moverA!=null || moverB!=null){
            moverA = (moverA == null)? headB : moverA.next;
            moverB = (moverB == null)? headA : moverB.next;
        }
        return moverA;
    }
}
package LinkedLists.DoublyL;

public class implementationsOfDLL {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};    
        Node head = arrToDLL(arr);
        // head = deletionByValue(head,5);
        // deletionByNode(head.next);
        head = reverseDLL_Links(head);
        Node mover = head;
        while(mover != null){
            System.out.print(mover.data+" ");
            mover = mover.next;
        }
    }
    public static Node arrToDLL(int[] arr) {
        if(arr.length == 0)return null;
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node mover = new Node(arr[i]);
            mover.next = null;
            mover.prev = prev;
            prev.next = mover;
            prev = mover;
        }
        return head;
    }

    public static Node deletionAtStart(Node head) {
        if(head == null)return null;
        if (head.next == null) return null;   
        Node mover = head.next;
        mover.prev = null;
        return mover;
    }
    public static Node deletionAtEnd(Node head) {
        if(head == null)return null;
        if(head.next == null)return null;
        Node mover = head;
        while(mover.next!=null){
            mover = mover.next;
        }
        mover.prev.next = null;
        mover.prev = null;
        return head;
    }
    public static Node deletionAtK(Node head,int k) {
        if (head == null) return null;    
        if (k == 1) {
            Node newHead = head.next;
            if (newHead != null) {
                newHead.prev = null;
            }
            head.next = null;
            return newHead;
        }
        int count = 1;
        Node mover = head;
        while (mover != null && count < k) {
            mover = mover.next;
            count++;
        }
        if (mover == null) return head;
        if (mover.prev != null) {
            mover.prev.next = mover.next;
        }
        if (mover.next != null) {
            mover.next.prev = mover.prev;
        }
            mover.next = null;
            mover.prev = null;
            return head;
    }
    public static Node deletionByValue(Node head,int val) {
        if(head == null)return null;
        if(head.data == val){
            Node newHead = head.next;
            if (newHead != null) {
                newHead.prev = null;
            }
            head.next = null;
            return newHead;
        }
        Node mover = head;
        while(mover!=null){
            if(mover.data == val){
                break;
            }
            mover = mover.next;
        }
        if(mover == null)return head;
        if(mover.prev != null){
            mover.prev.next = mover.next; 
        }
        if(mover.next!=null){
            mover.next.prev = mover.prev;
        }
        mover.next = null;
        mover.prev = null;
        return head;
    }
    public static void deletionByNode(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        if(next == null){
            prev.next = null;
            node.prev = null;
        }
        prev.next = next;
        next.prev = prev;
        node.prev = null;
        node.next = null;
}

    public static Node insertionBeforeHead(Node head,int data) {
        Node temp = new Node(data);
        if(head == null)return temp;
        temp.next = head;
        head.prev = temp;
        head = temp;
        return head;
    }
    public static Node insertionBeforeTail(Node head,int data) {
        Node temp = new Node(data);
        if(head == null)return temp;
        if(head.next == null){
            head = insertionBeforeHead(head, data);
            return head;
        }
        Node mover = head;
        while(mover.next!=null){
            mover = mover.next;
        }
        temp.next = mover;
        temp.prev = mover.prev;
        mover.prev.next = temp;
        mover.prev = temp;
        return head;
    }
    public static Node insertionBeforeKthNode(Node head,int data,int k) {
        Node temp = new Node(data);
        if(head == null)return null;
        if(k==1){
            head = insertionBeforeHead(head, data);
            return head;
        }
        int count = 1;
        Node mover = head;
        while(mover!=null && count<k){
            mover = mover.next;
            count++;
        }
        if(mover == null)return head;
        temp.next = mover;
        temp.prev = mover.prev;
        if(mover.prev!=null){
            mover.prev.next = temp;
        }
        mover.prev = temp;
        if(mover == head)return temp;
        return head;
    }

    public static Node reverseDLL(Node head) {
        if(head == null)return null;
        if(head.next == null)return head;
        Node newHead = head;
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        while(newHead != tail && newHead.prev != tail){
            int temp = newHead.data;
            newHead.data = tail.data;
            tail.data = temp;
            newHead = newHead.next;
            tail = tail.prev;
        }
        return head;
    }
    public static Node reverseDLL_Links(Node head) {
        if(head == null || head.next == null)return head;
        Node front = head;
        Node last = null;
        while(front != null){
            Node newNode = front.next;
            front.next = last;
            front.prev = newNode;
            last = front;
            front = newNode;
        }
        return last;
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
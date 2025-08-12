package LinkedLists.singleL;

public class implementationsOfLL {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        Node head = arrToLL(arr);
        int k = 6;
        // head = deletionAtK(head,k);
        head = insertionAtEnd(head, k);
        Node mover = head;
        while(mover != null){
            System.out.print(mover.data+" ");
            mover = mover.next;
        }
        int len = lengthOfLL(head);
        System.out.println();
        System.out.println(len);
        int ele = 9;
        System.out.println(searchInLL(head, ele));
    }
    public static boolean searchInLL(Node head,int ele) {
        Node mover = head;
        while(mover!=null){
            if(mover.data == ele){
                return true;
            }
            mover = mover.next;
        }
        return false;
    }
    public static int lengthOfLL(Node head) {
        Node mover = head;
        int count = 0;
        while(mover != null){
            count++;
            mover = mover.next;
        }
        return count;
    }
    public static Node arrToLL(int[] arr) {
        if(arr.length == 0)return null;
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }   

    public static Node deletionAtStart(Node head) {
        if(head == null)return head;
        head = head.next;
        return head;
    }
    public static Node deletionAtEnd(Node head) {
        if(head == null || head.next == null)return null;
        Node mover = head;
        while(mover.next.next != null){
            mover = mover.next;
        }
        mover.next = null;
        return head;
    }
    public static Node deletionAtK(Node head,int k) {
        if(head == null)return null;
        if(k==1)return head.next;
        int count = 1;
        Node mover = head;
        while(mover!=null && count<k-1){
            mover = mover.next;
            count++;
        }
        if(mover!=null && mover.next!=null){
            mover.next = mover.next.next;
        }
        
        return head;
    }
    public static Node deletionByValue(Node head,int val) {
        if(head!=null && head.data == val)head = head.next;
        Node mover = head;
        while(mover != null && mover.next!=null){
            if(mover.next.data == val){
                mover.next = mover.next.next;
            }else{
                mover = mover.next;
            }
        }
        return head;
    }

    public static Node insertionAtStart(Node head,int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        return head;
    }
    public static Node insertionAtEnd(Node head,int data) {
        Node temp = new Node(data);
        if(head == null)return temp;
        Node mover = head;
        while(mover != null && mover.next!=null){
            mover = mover.next;
        }
        mover.next = temp;
        return head;
    }
    public static Node insertionAtK(Node head,int k,int data) {
        Node temp = new Node(data);
        // if(head == null)return temp;
        if(k==0){
            temp.next = head;
            head = temp;
        }
        Node mover = head;
        int count = 0;
        while(mover!=null && count<k-1){
            mover = mover.next;
            count++;
        }
        temp.next = mover.next;
        mover.next = temp;
        return head;
    }
    public static Node insertionBeforeEle(Node head,int data,int ele) {
        if(head == null)return null;
        Node temp = new Node(data);
        if(head.data == ele){
            temp.next = head;
            head = temp;
        }
        Node mover = head;
        while(mover!=null && mover.next!=null){
            if(mover.next.data == ele){
                temp.next = mover.next;
                mover.next = temp;
                return head;
            }
            mover = mover.next;
        } 
        return head;
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
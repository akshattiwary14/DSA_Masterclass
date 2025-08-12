package LinkedLists.singleL;

public class sortLLZerosOnesTwos {
    public static void main(String[] args) {
        //CREATE A LL AND THEN SEND IT TO GET SORTED 
    }
    public static Node sortLLZerosOnesTwosSolver(Node head) {
        if(head == null || head.next == null)return head;
        Node dummy0 = new Node(-1);
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);
        Node mover0 = dummy0;
        Node mover1 = dummy1;
        Node mover2 = dummy2;
        Node mover = head;
        while(mover!=null){
            if(mover.data == 0){
                mover0.next = mover;
                mover0 = mover0.next;
            }
            else if(mover.data == 1){
                mover1.next = mover;
                mover1 = mover1.next;
            }
            else if(mover.data == 2){
                mover2.next = mover;
                mover2 = mover2.next;
            }
            mover = mover.next;
        }
        mover0.next = (dummy1.next!=null)?dummy1.next:dummy2.next;
        mover1.next = dummy2.next;
        mover2.next = null;
        return dummy0.next;
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
//FIRST APPROACH    

        // if(head==null || head.next == null)return head;
        // ArrayList<Integer> arr = new ArrayList<>();
        // Node mover = head;
        // while(mover!=null){
        //     arr.add(mover.data);
        //     mover = mover.next;
        // }
        // Collections.sort(arr);
        // mover = head;
        // for(Integer i : arr){
        //     mover.data = i;
        //     mover = mover.next;
        // }
        // return head;
        
//SECOND APPROACH

        // if(head == null || head.next == null)return head;
        // int count0 = 0 , count1 = 0 , count2 = 0;
        // Node mover = head;
        // while(mover!=null){
        //     if(mover.data == 0)count0++;
        //     else if(mover.data == 1)count1++;
        //     else count2++;
        //     mover = mover.next;
        // }
        // mover = head;
        // while(mover!=null){
        //     if(count0 > 0){
        //         mover.data = 0;
        //         count0--;
        //     }
        //     else if(count0 == 0 && count1 > 0){
        //         mover.data = 1;
        //         count1--;
        //     }
        //     else if(count0 == 0 && count1 == 0 && count2>0){
        //         mover.data = 2;
        //         count2--;
        //     }
        //     mover = mover.next;
        // }
        // return head;
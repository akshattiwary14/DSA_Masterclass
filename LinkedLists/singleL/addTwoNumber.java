package LinkedLists.singleL;

public class addTwoNumber {
    public static void main(String[] args) {
        //Declare an array and then convert it to a Single LinkedList.
        //Make two lists with digits odf the numbers in reverse order and then pass into the below func.
    }
    public static Node addTwoNumberSolver(Node l1,Node l2) {
        Node dummy = new Node();
        Node current = dummy;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int x = (l1!=null)?l1.data:0;
            int y = (l2!=null)?l2.data:0;
            int sum = x + y + carry;
            carry = sum/10;
            current.next = new Node(sum%10);
            current = current.next;
            if(l1!=null)l1 = l1.next;
            if(l2!=null)l2 = l2.next;
        }
        return dummy.next;
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
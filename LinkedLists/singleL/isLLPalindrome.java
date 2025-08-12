package LinkedLists.singleL;

public class isLLPalindrome {
    public static void main(String[] args) {
        
    }
    public static boolean isLLPalindromeSolver(Node head) {
        if(head == null || head.next == null)return true;
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node current = slow;
        Node prev = null;
        while(current!=null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        while(head!=null && prev!=null){
            if(head.data != prev.data)return false;
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}

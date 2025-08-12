package LinkedLists.singleL;
class Node<T>{
    T data;
    Node<T> next;
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
    public Node(T data) {
        this.data = data;
    }
}
public class middleOfLL {
    public static void main(String[] args) {
        //Declare an array and then convert it to a Single LinkedList And then find middle
    }
    public static Node<Integer> middleOfLLSolver(Node<Integer> head) {
        Node<Integer> hare = head;
        Node<Integer> tortoise = head;
        while(hare != null && hare.next!=null){
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        return tortoise;
    }
}

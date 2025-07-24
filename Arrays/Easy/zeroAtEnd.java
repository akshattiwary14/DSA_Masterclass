package Arrays.Easy;
import java.util.*;
public class zeroAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elemnets into the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeroAtEndOptimal(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();  
    }
    //Brute Force
    public static void moveZeroAtEnd(int[] arr,int size){
        int[] temp = new int[size];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                temp[j++] = arr[i];
            }
        }

        for (int i = j; i < arr.length; i++) {
            temp[i] = 0;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void moveZeroAtEndOptimal(int[] arr) {
    int j = 0; // index for placing the next non-zero element

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            // Only swap when i and j are different
            if (i != j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++; // move j to the next index
        }
    }
}

}

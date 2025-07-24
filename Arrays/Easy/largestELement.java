package Arrays.Easy;
import java.util.*;
class largestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Largest Element is : "+largestELE(arr));
        sc.close();
    }
    public static int largestELE(int[] arr){
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}

package Arrays.Easy;
import java.util.Scanner;
public class leftRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int[] arr = new int[(range)];
        System.out.println("Enter elements into the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int noOfRotations = 2;
        leftRotateArray(arr, noOfRotations);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        sc.close();
    }
    public static void reverse(int[] arr,int left,int right){
        int i = left;
        int j = right;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--; 
        }
    }
    public static void leftRotateArray(int[] arr,int n){
        int len = arr.length;
        n = n%len;
        reverse(arr, 0, n-1);
        reverse(arr, n, len-1);
        reverse(arr, 0, len-1);
    }
}

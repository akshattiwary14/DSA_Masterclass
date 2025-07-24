package Arrays.Easy;
import java.util.*;
public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The missing number = "+Better_missing_number(arr,size));
        sc.close();
    }

    public static int Brute_missing_number(int[] arr,int size){
        for (int i = 1; i <= arr.length+1; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }

    public static int Better_missing_number(int[] arr,int size){
        int n = size+1;
        int[] hashArray = new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            hashArray[arr[i]] = 1;
        }
        for (int i = 1; i <= n; i++) {
            if(hashArray[i] == 0){
                return i;
            }
        }
        return -1;
    }
//The Optimal is bad if number is beyond 10^7 so we use another optimal approach that is XOR1^XOR2
    public static int Optimal_missing_number(int[] arr,int size){
        int n = size+1;
        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;
        for (int j = 0; j < arr.length; j++) {
            actualSum+=arr[j];  
        }
        return (expectedSum-actualSum);
    }

}

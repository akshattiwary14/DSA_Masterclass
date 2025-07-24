package Arrays.Easy;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Second Largest Element is : "+optimalSecondLargest(arr));
        sc.close();
    }
    public static int optimalSecondLargest(int[] arr){
        int largest = arr[0];
        int secondLargest = -1; // make it INTEGER.MIN_VALUE only when there is negative value allowed
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }



    public static int secondLargestELE(int[] arr){
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
            largest = arr[i];
        }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secondLargest && arr[i]<largest){
                secondLargest = arr[i];
            }
        }


        return secondLargest;
    }
}

package Arrays.Easy;

import java.util.Scanner;

public class arraySortedCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Sorted : "+arraySortedChecker(arr));
        sc.close();
    }

    public static boolean arraySortedChecker(int[] arr){
        int rotationCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[(i+1)%arr.length]){
                rotationCount++;
            }    
        }
        if(rotationCount>1){
            return false;
        }else{
            return true;
        }
// The below checks array is sorted or not only when it is given that array has no rotations

        // for (int i = 1; i < arr.length; i++) {
        //     if(arr[i] > arr[i-1]){
                
        //     }else{
        //         return false;
        //     }
        // }
        // return true;
    }
}

//Search Element in a rotated sorted array 1
package BinarySearchTheory.oneDArray;
import java.util.Scanner;

public class searchEleFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = 0;
        int result = searchEleFirstSolver(arr,target);
        System.out.println(result);
        sc.close();
    }
    public static int searchEleFirstSolver(int[] arr,int target) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[left] <= arr[mid]){
                if(arr[left] <= target && target <=arr[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else if(arr[mid] <= arr[right]){
                if(arr[mid] <= target && target<=arr[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
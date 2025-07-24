package Arrays.Easy;

import java.util.*;

public class intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size for the two arrays! ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size1];
        System.out.print("Enter Elements into the first array: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter Elements into the second array: ");
        for (int i = 0; i < size1; i++) {
            arr2[i] = sc.nextInt();
        }
        intersectionArrays(arr1,arr2);
        sc.close();
    }
    public static void intersectionArrays(int[] arr1,int[] arr2){
        int i = 0;
        int j = 0;
        List<Integer> intersections = new ArrayList<>();
        while(i<=arr1.length-1 && j<=arr2.length-1){
            while (i > 0 && i < arr1.length && arr1[i] == arr1[i - 1]) {
                i++;
            }
            while (j > 0 && j < arr2.length && arr2[j] == arr2[j - 1]) {
                j++;
            }
            if(arr1[i] == arr2[j]){
                intersections.add(arr1[i]);
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else {
                j++;
            }
        }
        for (int num : intersections) {
            System.out.println(num+" ");
        }
    }
}

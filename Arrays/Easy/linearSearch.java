package Arrays.Easy;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elemnets into the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search Element: ");
        int searchEle = sc.nextInt();
        int idx = IsPresent(arr, searchEle);
        if(idx!=-1){
            System.out.println("Element is present at index : "+idx);
        }else{
            System.out.println("searchElement not Found!");
        }
        sc.close();
    }
    public static int IsPresent(int[] arr,int j){
        for (int i = 0; i < arr.length; i++) {
            if(j==arr[i]){
                return i;
            }
        }
        return -1;
    }
}

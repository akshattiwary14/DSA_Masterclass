package Arrays.Medium;

import java.util.Scanner;

public class alternatingPOS_NEG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Brute_alternatingPOS_NEG_Solver(arr);
        System.out.print("The Resultant Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    //Optimal if the size is not equal i.e: The Size of neg != pos
    public static void Brute_alternatingPOS_NEG_Solver(int[] arr){
        int[] pos = new int[arr.length];
        int[] neg = new int[arr.length];
        int idx1 = 0,idx2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0){
                pos[idx1++] = arr[i];
            }else{
                neg[idx2++] = arr[i];
            }
        }
        int p = 0,q = 0,n = 0;
        while (p < idx1 && n < idx2) {
            arr[q++] = pos[p++];
            arr[q++] = neg[n++];
        }
        while(p < idx1){
            arr[q++] = pos[p++];
        }
        while(n < idx2){
            arr[q++] = neg[n++];
        }
    }  



    public static void Optimal_alternatingPOS_NEG_Solver(int[] arr){
        int[] ans = new int[arr.length];
        int posIDX = 0;
        int negIDX = 1;
        for (int i = 0; i < ans.length; i++) {
            if(arr[i] > 0){
                ans[posIDX] = arr[i];
                posIDX +=2;
            }else{
                ans[negIDX] = arr[i];
                negIDX +=2;
            }
        }
        System.out.print("The Resultant Array: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}

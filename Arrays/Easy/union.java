package Arrays.Easy;
import java.util.*;
public class union {
    public static void Brute_findUnion(int[] arr1,int[] arr2){
        Set<Integer> hashSet = new TreeSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hashSet.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hashSet.add(arr2[i]);
        }
        int[] union = new int[hashSet.size()];
        int idx=0;
        for (int i : hashSet) {
            union[idx++] = i;
        }
        System.out.print("Union Set: ");
        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i]+" , ");
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the two arrays! ");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        System.out.print("Enter Elements into the first array: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter Elements into the second array: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        Optimal_findUnion(arr1,arr2);
        sc.close();
    }

    public static void Optimal_findUnion(int[] arr1, int[] arr2) {
    int i = 0, j = 0;
    List<Integer> union = new ArrayList<>();

    while (i < arr1.length && j < arr2.length) {

        while (i > 0 && i < arr1.length && arr1[i] == arr1[i - 1]) {
            i++;
        }

        while (j > 0 && j < arr2.length && arr2[j] == arr2[j - 1]) {
            j++;
        }
        if (i >= arr1.length || j >= arr2.length) break;

        if (arr1[i] < arr2[j]) {
            union.add(arr1[i++]);
        } else if (arr1[i] > arr2[j]) {
            union.add(arr2[j++]);
        } else {
            union.add(arr1[i]);
            i++;
            j++;
        }
    }


    while (i < arr1.length) {
        if (i == 0 || arr1[i] != arr1[i - 1]) {
            union.add(arr1[i]);
        }
        i++;
    }

    while (j < arr2.length) {
        if (j == 0 || arr2[j] != arr2[j - 1]) {
            union.add(arr2[j]);
        }
        j++;
    }


    for (int num : union) {
        System.out.print(num + " , ");
    }
}

}

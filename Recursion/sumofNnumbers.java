package Recursion;
import java.util.*;
public class sumofNnumbers {
    public static int summation(int n){
        if(n == 0){
            return 0;
        }
        return n+summation(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = sc.nextInt();
        System.out.println("The sum is == "+summation(range));
        sc.close();
    }
}

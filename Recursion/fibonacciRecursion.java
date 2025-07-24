package Recursion;
import java.util.*;
public class fibonacciRecursion {
    public static int fibonacccci(int n){
        if(n<=1){
            return n;
        }
        int last = fibonacccci(n-1);
        int secondlast = fibonacccci(n-2);
        return last + secondlast;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The fibonacci of "+n+" is : "+fibonacccci(n));
        sc.close();
    }
}

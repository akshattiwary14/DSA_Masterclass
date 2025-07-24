package Recursion;
import java.util.*;
public class factorial {
    public static int factor(int n){
        if(n==0)return 1;
        return n*factor(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be calculated: ");
        int n = sc.nextInt();
        System.out.println("The Factorial of "+n+" == "+factor(n));
        sc.close();
    }
}

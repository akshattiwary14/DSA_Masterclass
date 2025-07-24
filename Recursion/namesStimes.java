package Recursion;
import java.util.*;
public class namesStimes {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the times you want to print the name: ");
        int n = sc.nextInt();
        names(n);
        sc.close();
    }
    public static void names(int n){
        if(count >= n){
            return;
        }
        System.out.println("Shubhangi");
        count++;
        names(n);
    }
}

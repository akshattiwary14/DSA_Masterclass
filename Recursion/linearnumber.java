package Recursion;
import java.util.*;
public class linearnumber {
    static int count = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range 0-n : ");
        int range = sc.nextInt();
        linearity(range);
        sc.close();
    }
    public static void linearity(int n){
        if(n < count){
            return;
        }
        System.out.print(n-- +" , ");
        linearity(n);
    }
}

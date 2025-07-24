package Recursion;
import java.util.*;
public class linearnumberBacktrack {
    public static void linearity2(int i,int n){
        if(i<1){
            return;
        }
        linearity2(i-1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the final range: ");
        int rng = sc.nextInt();
        linearity2(rng, rng);
        sc.close();
    }
}

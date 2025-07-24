package Patterns;

public class M_pattern {
    public static void main(String[] args) {
        int n = 4;
        int space = 2*(n-1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = i+1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space = space-2;
        }
    }
}

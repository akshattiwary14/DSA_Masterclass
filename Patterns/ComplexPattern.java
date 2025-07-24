package Patterns;
public class ComplexPattern {
    public static void main(String[] args) {
        int n = 7; // Must be odd for concentric symmetry

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int layer = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                System.out.print((n / 2 + 1 - layer));
            }
            System.out.println();
        }
    }
}

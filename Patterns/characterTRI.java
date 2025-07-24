package Patterns;

public class characterTRI {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            char ab = 'A';
            int breakpoint = (2*i+1)/2;
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print(ab);
                if (j<=breakpoint) {
                    ab++;
                }else{ab--;}
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}

package Patterns;

public class reverseleftTRi {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int num = 0;
            for (int j = 4; j >= i; j--) {
                System.out.print((num++)+" ");
            }
            System.out.println();
        }
    }
    
}

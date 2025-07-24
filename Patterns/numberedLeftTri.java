/* 1
   12
   123
   1234
   12345
 */
package Patterns;

public class numberedLeftTri {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
    
}

public class Divisors {
    public static void main(String[] args) {
        int n = 36;
        for(int i = 1 ; i<=n ; i++){
            if(n%i == 0)System.out.print(i+" , ");
        }
        System.out.println(" ");
        anothermethod(n);
    }
    //More Optimal Approach
    public static void anothermethod(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                System.out.print(i+" , ");
                if(i!=(n/i))System.out.print(n/i+" , ");
            }     
        }
    }
}

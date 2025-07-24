public class armstrong {
    public static void main(String[] args) {
        int n = 1634;
        int digit = (int)Math.log10(n) + 1;
        int u = 0;
        int n1 = n;
        while(n>0){
            int rem = n%10;
            u = u + (int)Math.pow(rem,digit);
            n=n/10;
        }
        if(n1 == u){
            System.out.println("Armstrong No.");
        }else{
            System.out.println("Not a Armstrong nO ");
        }
    }
}

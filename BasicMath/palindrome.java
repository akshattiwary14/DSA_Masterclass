public class palindrome {
    public static void main(String[] args) {
        int n = 10011;
        int n1 = n;
        int u = 0;
        while(n>0){
            int rem = n%10;
            u = (u*10)+rem;
            n = n/10;
        }
        if(n1 == u){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("Number is a non palindrome number");
        }
    }
}

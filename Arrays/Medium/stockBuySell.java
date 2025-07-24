package Arrays.Medium;

import java.util.Scanner;

public class stockBuySell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The max profit is : "+stockBuySellSolver(arr));
        sc.close();
    }
    public static int stockBuySellSolver(int[] prices){
        int low = prices[0];
        int profit = 0;
        int max_profit = 0;
        for (int i = 1; i < prices.length; i++) {
            
            max_profit = prices[i] - low;  
            profit = Math.max(max_profit,profit);
            if(prices[i] < low)low = prices[i];
        }
        return profit;
    }
}

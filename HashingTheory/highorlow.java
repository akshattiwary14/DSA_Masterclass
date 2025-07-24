package HashingTheory;
import java.util.*;
public class highorlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //precompute
        HashMap<Integer,Integer> freqMAp = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            freqMAp.put(arr[i], freqMAp.getOrDefault(arr[i],0)+1);
        }
        int maxvalue = Integer.MAX_VALUE;
        int minvalue = Integer.MIN_VALUE;
        int maxvaluekey = -1;
        int minvaluekey = -1;
        for(Map.Entry<Integer, Integer> entry : freqMAp.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(val>maxvalue){
                maxvalue = val;
                maxvaluekey = key;
            }
            if(val<minvalue){
                minvalue = val;
                minvaluekey = key;
            }
        }
        System.out.println("Number with max frequency: " + maxvaluekey + " (Frequency: " + maxvalue + ")");
        System.out.println("Number with min frequency: " + minvaluekey + " (Frequency: " + minvalue + ")");
        sc.close();
    }
}
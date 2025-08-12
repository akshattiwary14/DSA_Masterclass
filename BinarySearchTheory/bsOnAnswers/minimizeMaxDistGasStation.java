package BinarySearchTheory.bsOnAnswers;

import java.util.PriorityQueue;

public class minimizeMaxDistGasStation {
    public static class Pair{
        double first;
        int second;
        public Pair(double first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int k = 4;
        System.out.println(Optimal_minimizeMaxDistGasStationSolver(arr,k));
    }
//Brute approach uses O(k*n) + O(n)
    public static double Brute_minimizeMaxDistGasStationSolver(int[] arr,int k) {
        int[] howMany = new int[arr.length-1];
        for (int i = 0; i < k; i++) {
            double maximumVal = -1;
            int maxFind = -1;
            for (int j = 0; j < arr.length-1; j++) {
                double diff = arr[j+1] - arr[j];
                double sectionLength = diff/(double)(howMany[j]+1.0);
                if(maximumVal < sectionLength){
                    maximumVal = sectionLength;
                    maxFind = j;
                }
            }
            howMany[maxFind]++;
        }
        double maxAns = -1;
        for (int i = 0; i < howMany.length; i++) {
            double diff = (arr[i+1] - arr[i]);
            double sectionLength = diff/(howMany[i]+1);
            maxAns = Math.max(maxAns,sectionLength);
        }
        return maxAns;
    }

    public static double Better_minimizeMaxDistGasStationSolver(int[] arr,int k){
       int[] howMany = new int[arr.length-1];
       PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Double.compare(b.first,a.first));
       for (int i = 0; i < arr.length-1; i++) {
            pq.add(new Pair(arr[i+1]-arr[i], i)); 
       }
       for (int gasStations = 0; gasStations < k; gasStations++) {
            Pair tp = pq.poll();
            int secInd = tp.second;
            howMany[secInd]++;
            double inidiff = arr[secInd+1]-arr[secInd];
            double newSeclen = inidiff/(double)(howMany[secInd]+1);
            pq.add(new Pair(newSeclen, secInd));
       }
       return pq.peek().first; 
    }

    public static double Optimal_minimizeMaxDistGasStationSolver(int[] arr,int k){
        double left = 0;
        double right = 0;
        for (int i = 0; i < arr.length-1; i++) {
            right = Math.max(right,(double)(arr[i+1]-arr[i]));
        }
        double diff = 1e-6;
        while(right-left>diff){
            double mid = (left+right)/2.0;
            int count = numberOfGasStationsRequired(mid, arr);
            if (count > k) {
                left = mid;
            }else {
                right = mid;
            }
        }
        return right;
    }
    public static int numberOfGasStationsRequired(double dist, int[] arr) {
        int cnt = 0;
        for (int i = 1; i < arr.length; i++) {
        cnt += (int)Math.ceil((arr[i] - arr[i-1]) / dist) - 1;
    }
        return cnt;
    }
}
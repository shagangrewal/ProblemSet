package GreedyAlgo;

import java.util.Arrays;

public class minMaxCandies {
    public static int minPrice(int a[], int k){
        int min = 0;
        Arrays.sort(a);
        for(int i=0;i<a.length && k>0;i++){
            min += a[i];
            k--;
        }
        return min;
    }
    
    public static int maxPrice(int a[], int k){
        int max = 0;
        for(int i=a.length-1;i>=0 && k>0;i--){
            max += a[i];
            k--;
        }
        return max;
    }
    
    public static void main(String[] args){
        int a[] = {3,2,1,4};
        int k=2;
        System.out.println("Min:"+ minPrice(a,k)+"  "+"Max:"+maxPrice(a,k));
    }
}

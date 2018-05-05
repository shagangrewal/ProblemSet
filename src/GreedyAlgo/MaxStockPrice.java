package GreedyAlgo;
import java.util.*;

public class MaxStockPrice {
    public static int Method1(int a[], int k){
        int count  =0;
        int m =0;
        for(int i=1;i<=a.length;i++){
            int j =1;
            while(j<=i && count+a[i-1]<=k){
                count += a[i-1];
                j++;
                m++;
            }
        }
        return m;
    }
    
    
    
    public static void main(String[] args){
        int a[] = {7,10,4};
        int k = 45;
        System.out.println(Method1(a,k));
    }
}

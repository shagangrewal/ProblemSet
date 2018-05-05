package GreedyAlgo;

import java.util.Arrays;

public class minMaxDiff {
    public static int maxDiff(int a[], int k){
        int ans = 0;
        Arrays.sort(a);
        int small = a[0];
        int big = a[a.length-1];
        ans = big-small;
        big -= k;
        small += k;
        int temp = 0;
        if(small>big){
            temp = small;
            small = big;
            big = temp;
        }
        for(int i=0;i<a.length;i++){
            int sub = a[i]-k;
            int add = a[i]+k;
            
            if(sub>=small && add<=big)
                continue;
            
            if(big-sub<=add-small)
                small = sub;
            else
                big = add;
        }
        return Math.min(ans, Math.abs(big-small));
    }
    
    public static void main(String[] args){
        int a[] = {1,15,10};
        int k = 6;
        System.out.println(maxDiff(a,k));
    }
}

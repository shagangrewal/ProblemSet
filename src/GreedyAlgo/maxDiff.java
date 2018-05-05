package GreedyAlgo;

import java.util.Arrays;

public class maxDiff {
    public static int diffMax(int a[],int k){
        Arrays.sort(a);
        int diff = 0;
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        int sum1 =0;
        int l = k<(a.length-k)?k:(a.length-k);
        for(int i=0;i<l;i++){
            sum1 += a[i];
        }
        diff = sum - 2*sum1;
        return diff;
    }
    
    public static void main(String[] args){
        int a[] = {1,1,1,1,1,1,1,1};
        int k =3;
        System.out.println(diffMax(a,k));
    }
}

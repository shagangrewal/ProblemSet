package GreedyAlgo;
import java.util.Arrays;

public class maxConsDiff {
    public static int maxDiff(int a[]){
        int res = 0;
        Arrays.sort(a);
        for(int i=0;i<a.length/2;i++){
            res -= 2*a[i];
            res += 2*a[a.length-i-1];
        }
        return res;
    }
    
    public static void main(String[] args){
        int a[] = {4,2,1,8};
        System.out.println(maxDiff(a));
    }
}

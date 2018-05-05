package GreedyAlgo;
import java.util.Arrays;

public class allEqual {
    
    public static int countEq(int a[], int k){
        int count = 0;
        Arrays.sort(a);
        int max = a[a.length-1];
        for(int i=0;i<a.length;i++){
            if((max-a[i])%k != 0)
                return -1;
            else
                count += (max-a[i])/k;
        }
        return count;
    }
    
    public static void main(String[] args){
        int a[] = {19,16,4,7,22};
        int k = 3;
        System.out.println(countEq(a,k));
    }
}

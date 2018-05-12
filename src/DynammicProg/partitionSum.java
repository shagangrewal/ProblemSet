package DynammicProg;
import java.util.Arrays;

public class partitionSum {
    public static boolean pSum(int a[]){
        boolean ans = false;
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        int i =0;
        int k = 0;
        Arrays.sort(a);
        while(sum>(sum)/2 && i<a.length-1){
            sum -= a[i];
            k += a[i];
            if(sum == k){
                ans = true;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int a[] = {1,5,11,5,23,1,15,15};
        System.out.println(pSum(a));
    }
}

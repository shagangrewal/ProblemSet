package DynammicProg;

public class maxSumNoCons3 {
    public static int maxSum(int a[]){
        int sum[] = new int[a.length];
        sum[0] = a[0];
        sum[1] = sum[0] + a[1];
        sum[2] = Math.max(sum[1],Math.max(sum[0]+a[2],a[1]+a[2]));
        for(int i=3;i<a.length;i++){
            sum[i] = Math.max(sum[i-2]+a[i],Math.max(sum[i-1]+a[i],a[i-2]+a[i-1]+a[i]));
        }
        return sum[a.length-1];
    }
    public static void main(String[] args){
        int a[] = {1,1,1,1,1};
        System.out.println(maxSum(a));
    }
}

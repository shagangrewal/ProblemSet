package DynammicProg;

public class lngSeqDiff1 {
    public static int lSeq(int a[]){
        int dp[] = new int[a.length];
        //dp[0] = 1;
        for(int i=1;i<a.length;i++){
            dp[i] = 0;
        }
        
        for(int i=1;i<a.length;i++){
            if(Math.abs(a[i]-a[i-1])==1)
                dp[i]=dp[i-1]+1;
            else
                dp[i] = dp[i-1];
        }
        return dp[a.length-1];
    }
    public static void main(String[] args){
        int a[] = {};
        System.out.println(lSeq(a));
    }
}

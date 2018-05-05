package DynammicProg;

public class binomailCoff {
    public static int coff(int n, int k){
        int res[][] = new int[n+1][k+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=Math.min(i,k);j++){
                if(j==0 || j==i)
                    res[i][j] = 1;
                else
                    res[i][j] = res[i-1][j-1] + res[i-1][j];
            }
        }
        return res[n][k];
    }
    
    public static void main(String[] args){
        int a = 5;
        int k =2;
        System.out.println(coff(a,k));
    }
}

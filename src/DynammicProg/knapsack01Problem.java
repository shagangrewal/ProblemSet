package DynammicProg;

public class knapsack01Problem {
    public static int optVal(int p[], int w[], int n){
        int op[] = new int[p.length];
        int count = 0;
        for(int i=0;i<p.length;i++){
            op[i] = p[i]/w[i];
        }
        int k = 0;
        for(int i=0; i<p.length && n>0 ;i++){
            int max = 0;
            for(int j=0;j<w.length;j++){
                if(max<op[j]){
                    max = op[j];
                    k = j;
                }
            }
            if(w[k]<n){
                count += w[k]*op[k];
                op[k] -= max;
                n -= w[k];
            }
            else{
                count += (n)*op[k];
                op[k] -= max;
                n -= n;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int a[] = {60,100,120};
        int b[] = {10,20,30};
        int w = 50;
        System.out.println(optVal(a,b,w));
    }
}

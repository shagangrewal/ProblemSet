package DynammicProg;

public class optimalCostBST {
    public static int optCost(int a[], int b[]){
        int cost[][] = new int[a.length][b.length];
        for(int i=0;i<a.length;i++){
            cost[i][i] = b[i];
        }
        for(int i=2;i<=a.length;i++){
            for(int j=0;j<=(a.length-i+1);j++){
                int k = j+i-1;
                cost[j][k] = Integer.MAX_VALUE;
                for(int r= j;r<=k;r++){
                    int c = ((r>j)?cost[j][r-1]:0)+((r<k)?cost[r+1][k]:0)+ sum(b,j,k);
                    if(c<cost[j][k])
                        cost[j][k] = c;
                }
            }
        }
        return cost[0][a.length-1];
    }
    public static int sum(int b[], int i, int j){
        int s = 0;
        for(int m=i;m<=j;m++){
            s += b[m];
        }
        return s;
    }
    public static void main(String[] args){
        int keys[] = {10,12,20};
        int freq[] = {34,8,50};
        System.out.println(optCost(keys,freq));
    }
}

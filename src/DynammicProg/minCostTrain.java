package DynammicProg;

public class minCostTrain {
    public static int minCost(int a[][], int m, int n){
        int cost = a[m][n-1];
        for(int i=m+1;i<n;i++){
            cost = Math.min(cost, a[m][i]+a[i][n-1]);
        }
        return cost;
    }
    public static void main(String[] args){
        int a[][] = {{0,15,80,90},
                     {Integer.MAX_VALUE,0,40,50 },
                     {Integer.MAX_VALUE,Integer.MAX_VALUE,0,70},
                     {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,0}};
        System.out.println(minCost(a,0,a.length));
    }
}

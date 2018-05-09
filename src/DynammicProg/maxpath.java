package DynammicProg;

public class maxpath {
    public static int maxCostP(int a[][], int n){
        int cost[][] = new int[n][n];
        int max = 0;
        cost[0][0] = a[0][0];
        for(int i=1;i<n;i++){
            cost[i][0] = a[i][0] + cost[i-1][0];
        }
        
        for(int i=1;i<n;i++){
            for(int j=1;j<i+1 && j<n;j++){
                cost[i][j] = a[i][j] + Math.max(cost[i-1][j-1],cost[i-1][j]);
            }
        }
        for(int i=0;i<n;i++){
            if(max<cost[n-1][i])
                max = cost[n-1][i];
        }
        return max;
    }
    
    public static void main(String[] args){
        int a[][] = { { 4, 1 ,5 ,6 , 1 },{ 2 ,9 ,2 ,11 ,10 },{ 15,1 ,3 ,15, 2 },
        { 16, 92, 41,4,3},{ 8, 142, 6, 4, 8 }};
        System.out.println(maxCostP(a,5)); //(4,4) corresponding to bottom right
     }
    
}

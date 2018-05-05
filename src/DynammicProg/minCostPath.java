package DynammicProg;

public class minCostPath {
    public static int min(int a, int b, int c){
        if(a<b)
            return a<c?a:c;
        else
            return b<c?b:c;
    }
    
    public static int minCost(int a[][], int m, int n){
       if(m<0 || n<0)
           return 1;
            
       else if(m==0 && n==0)
           return a[0][0];
       else
           return a[m][n]+min(minCost(a,m-1,n),minCost(a,m,n-1),minCost(a,m-1,n-1));
    }
    
    public static void main(String[] args){
        int a[][] = { {2, 2, 3},{4, 8, 2},{1, 5, 3}};
        System.out.println(minCost(a,2,2));
    }
}

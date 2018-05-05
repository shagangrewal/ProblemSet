package GreedyAlgo;

public class minCashFlow {
    public static int getMin(int a[]){
        int m = 0;
        for(int i=1;i<a.length;i++){
            if(a[i]<a[m])
                m = i;
        }
        return m;
    }
    public static int getMax(int a[]){
        int m = 0;
        for(int i=1;i<a.length;i++){
            if(a[i]>a[m])
                m = i;
        }
        return m;
    }
    
    public static void minCash(int a[]){
        int mxCredit = getMin(a);
        int mnCredit = getMax(a);
        if(a[mxCredit]==0 && a[mnCredit]==0)
            return;
        
        int m = Math.min(a[mnCredit], a[mxCredit]);
        a[mxCredit] -= m;
        a[mnCredit] += m;
        System.out.println(mxCredit +" pays "+ Math.abs(m) +" to "+mnCredit);
        
        minCash(a);
    }
    
    public static void minFlow(int g[][]){
        int a[] = new int[g.length];
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g.length;j++){
                a[i] += (g[j][i]-g[i][j]);
            }
        }
        minCash(a);
    }
    
    public static void main(String[] args){
        int g[][] = {{0,1000,2000},{0,0,5000},{0,0,0}};
        minFlow(g);
    }
}

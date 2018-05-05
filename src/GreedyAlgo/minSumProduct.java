package GreedyAlgo;

public class minSumProduct {
    public static int minSum(int a[], int b[], int k){
        int result = 0;
        int temp = 0;
        int diff = 0;
        for(int i=0;i<a.length;i++){
            int p = a[i]*b[i];
            result += p;
            if(p<0 && b[i]<0){
                temp = (a[i]+2*k)*b[i];
            }
            else if(p<0 && a[i]<0)
                temp = (a[i]-2*k)*b[i];
            else if(p>0 && a[i]<0)
                temp = (a[i]+2*k)*b[i];
            else if(p>0 && a[i]>0)
                temp = (a[i]-2*k)*b[i];
            
            int d = Math.abs(p-temp);
            if(d>diff)
                diff=d;
        }
        return result-diff;
    }
    
    public static void main(String[] args){
        int a[] = {2,3,4,5,4};
        int b[] = {3,4,2,3,2};
        int k = 3;
        System.out.println(minSum(a,b,k));
    }
}

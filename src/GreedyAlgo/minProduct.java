package GreedyAlgo;

public class minProduct {
    public static int minProduct(int a[], int n){
        if(n==1)
            return a[0];
        
        int countZero = 0;
        int countNeg = 0;
        int prod = 1;
        int minNeg = a[0];
        int minPos = a[0];
        for(int i=0;i<n;i++){
            if(a[i]==0)
                countZero++;
            
            if(a[i]<0){
                countNeg++;
                if(a[i]>minNeg)
                    minNeg = a[i];
            }
            
            if(a[i]>0 && a[i]<minPos){
                minPos = a[i];
            }
            
            prod = prod*a[i];
        }
        
        if(countNeg == 0 && countZero>0)
            return 0;
        if(countNeg==0)
            return minPos;
        if(countNeg%2==0 && countNeg!=0)
            return prod/minNeg;
        return prod;
    }
    
    public static void main(String[] args){
        int a[] = {-1,1,-2,4,3};
        int n = a.length;
        System.out.println(minProduct(a,n));
    }
}

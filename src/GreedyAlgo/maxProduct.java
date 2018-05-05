package GreedyAlgo;

public class maxProduct {
    public static int maxProduct(int a[], int n){
        if(n==1)
            return a[0];
        int maxNeg = a[0];
        int product = 1;
        int countZero = 0;
        int countNeg = a[0];
        for(int i=0;i<n;i++){
            if(a[i]==0){
                countZero++;
                continue;
            }
            
            
            if(a[i]<0 && a[i]>maxNeg){
                maxNeg = a[i];
                countNeg++;
            }
            product *= a[i];
            
        }
        
        if(countZero==n || (countZero==n-1 && countNeg==1) )
            return 0;
        
        
        if(countNeg%2 !=0)
             product /= maxNeg;
        
        return product;
    }
    
    public static void main(String[] args){
        int a[] = {-1,-1,-2,4,3,0};
        System.out.println(maxProduct(a, a.length));
    }
}

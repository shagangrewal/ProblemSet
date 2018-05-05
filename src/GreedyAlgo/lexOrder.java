package GreedyAlgo;

public class lexOrder {
    public static void maxSwap(int a[], int k){
        for(int i=0;i<a.length && k>0;i++){
            int indexPos = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[indexPos])
                    indexPos = j;
            }
            
            if(indexPos != i){
                int temp = a[i];
                a[i] = a[indexPos];
                a[indexPos] = temp;
                k--;
            }
        }
    }
    
    public static void main(String[] args){
        int a[] = {3,5,4,1,2,6,7};
        int k = 3;
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
        maxSwap(a,k);
        System.out.println();
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}

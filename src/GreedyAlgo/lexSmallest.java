package GreedyAlgo;

public class lexSmallest {
    public static void small(int a[], int k){
        
        for(int i=0;i<a.length-1 && k>0;i++){
            int pos = i;
            for(int j=i+1;j<a.length;j++){
                if(j-i>k)
                    break;
                else{
                    if(a[j]<a[pos])
                        pos = j;
                }
            }
            int temp = 0;
            for(int j=pos;j>i;j--){
                temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
            k -= pos-i;
        }
    }
    
    public static void main(String[] args){
        int a[] = {7,6,9,2,1};
        int k =4;
        small(a,k);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

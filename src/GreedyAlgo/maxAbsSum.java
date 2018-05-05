package GreedyAlgo;

public class maxAbsSum {
    public static void sort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
    public static int maxSum(int a[], int n){
        int seq[] = new int[n];
        sort(a);
        for(int i=0;i<n/2;i++){
            seq[2*i] = a[i];
            seq[2*i+1] = a[n-i-1];
        }
        int sum = 0;
        for(int i=0;i<n-1;i++){
            sum += Math.abs(seq[i]-seq[i+1]);
        }
        sum += Math.abs(seq[n-1]-seq[0]);
        
        return sum;
    }
    
    public static void main(String[] args){
        int a[] = {1,2,4,8};
        System.out.println(maxSum(a,a.length));
    }
}

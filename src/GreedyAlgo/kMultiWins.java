package GreedyAlgo;

public class kMultiWins {
    public static int wins(int a[], int k){
        int best = 0;
        if(a.length==1)
            return a[0];
        
        for(int i=0;i<a.length;i++){
            int times = 0;
            if(a[i]>best){
                best = a[i];
                if(i==1)
                    times = 1;
            }
            else{
                times+=1;
                if(times>=k)
                    return best;
            }
        }
        
        return best;
    }
    
    public static void main(String[] args){
        int a[] = {1,2,3,8,5,9,6,4};
        int k = 3;
        System.out.println(wins(a,k));
    }
}

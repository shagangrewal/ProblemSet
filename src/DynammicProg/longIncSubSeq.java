package DynammicProg;

public class longIncSubSeq {
    public static int maxSeq(int a[], int n){
        int count = 1;
        int res;
        int max = 1;
        for(int i=1;i<n;i++){
            res = maxSeq(a,i);
            if(a[i-1]<a[n-1] && res+1 >max)
                max  = res+1;
        }
        if(max>count)
            count = max;
        return count;
    }
    
    
    public static void main(String[] args){
        int a[] = {50, 3, 10, 7, 40, 80};
        System.out.println(maxSeq(a,a.length));
    }
}

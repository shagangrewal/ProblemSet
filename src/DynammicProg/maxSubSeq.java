package DynammicProg;

public class maxSubSeq {
    public static int maxSub(int a[]){
        int max_so_far = 0;
        int max_here = 0;
        for(int i=0;i<a.length;i++){
            max_here += a[i];
            if(max_here<0)
                max_here = 0;
            if(max_so_far<max_here)
                max_so_far = max_here;
        }
        return max_so_far;
    }
    
    public static void main(String[] args){
        int a[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSub(a));
    }
}

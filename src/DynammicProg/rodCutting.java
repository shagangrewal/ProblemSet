package DynammicProg;

public class rodCutting {
    public static int maxRod(int a[], int n){
        
        int m = 0;
        for(int i=0;i<n;i++){
            m = Math.max(m, a[i]+ maxRod(a, n-1-i));
        }
        return m;
    }
    public static void main(String[] args){
        int a[] = {1,5,8,9,10,17,17,20};
        System.out.println(maxRod(a,a.length));
    }
}

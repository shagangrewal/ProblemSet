package DynammicProg;

public class maxProfit {
    public static int max2(int a[]){
        int p[] = new int[a.length];
        
        for(int i=0;i<a.length;i++){
            p[i] = 0;
        }
        
        int maxp = a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            if(maxp < a[i])
                maxp = a[i];
            p[i] = Math.max(p[i+1], maxp-a[i]);
        }
        
        int minp = a[0];
        for(int i=1;i<a.length;i++){
            if(minp > a[i])
                minp = a[i];
            p[i] = Math.max(p[i-1],p[i]+a[i]-minp);
        }
        
        int r = p[a.length-1];
        return r;
    }
    public static void main(String[] args){
        int a[] = {2,30,15,10,8,25,80};
        System.out.println(max2(a));
    }
}

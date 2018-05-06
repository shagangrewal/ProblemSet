package DynammicProg;

public class permCoff {
    public static int coff(int p, int r){
        int a[] = new int[p+1];
        a[0] = 1;
        for(int i=1;i<=p;i++){
            a[i] = i*a[i-1];
        }
        return a[p]/a[p-r];
    }
    
    public static int Method2(int p, int r){
        int fp = 1;
        int fr = 1;
        for(int i=1;i<=p;i++){
            fp *= i;
            if(i == (p-r))
                fr= fp;
        }
        return fp/fr;
    }
    
    public static void main(String[] args){
        int p = 10;
        int r = 1;
        System.out.println(coff(p,r));
        System.out.println(Method2(p,r));
    }
}

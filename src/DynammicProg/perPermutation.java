package DynammicProg;

public class perPermutation {
    public static int perm(int a, int b){
        int n[] = new int[a+1];
        n[0] = 1;
        for(int i=1;i<(a+1);i++){
            n[i] = i*n[i-1];
        }
        return n[a]/(n[b]*n[a-b]);
    }
    public static void main(String[] args){
        int n = 10;
        int r = 2;
        int p = 6;
        int k = perm(n,r);
        System.out.println(k);
        System.out.println(k%p);
    }
}

package DynammicProg;

public class minSquares {
    public static int m1(int n){
        int c[] = new int[n+1] ;
        c[0] = 0;
        c[1] = 1;
        c[2] = 2;
        c[3] = 3;
        for(int i=4;i<=n;i++){
            c[i] = i;
            for(int j=1;j<=i;j++){
                int temp = j*j;
                if(temp>n)
                    break;
                else
                    c[i] = Math.min(c[i],1+c[i-temp]);
            }
        }
        return c[n];
    }
    public static int m2(int n){
        if(n<=3)
            return n;
        int res = n;
        for(int i=1;i<=n;i++){
            int temp = i*i;
            if(temp>n)
                break;
            else
                res = Math.min(res,1+m2(n-temp));
        }
        return res;
    }
    public static void main(String[] args){
        int n  = 8;
        System.out.println(m1(n));
        System.out.println(m2(n));
    }
}

package DynammicProg;

public class longComSubSeq {
    public static int lcs(char a[], char b[], int m, int n){
        
        if(m==0 || n==0)
            return 0;
        if(a[m-1]==b[n-1])
            return 1 + lcs(a,b,m-1,n-1);
        else
            return Math.max(lcs(a,b,m-1,n), lcs(a,b,m,n-1));
        
    }
    
    public static void main(String[] args){
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        char x[] = s1.toCharArray();
        char y[] = s2.toCharArray();
        System.out.println(lcs(x,y,x.length,y.length));
    }
}

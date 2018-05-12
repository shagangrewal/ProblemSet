package DynammicProg;

public class evenLenSubStr {
    public static int evnLen(String a){
        int n = a.length();
        int m = 0;
        int sum[][] = new int[n][n];
        for(int i=0;i<n;i++){
            sum[i][i] = a.charAt(i)-'0';
        }
        //for substrings from len 2 to max n
        for(int len=2;len<=n;len++){
            for(int i=0;i<n-len+1;i++){
                int j = i+len-1;
                int k = len/2;
                sum[i][j] = sum[i][j-k]+sum[j-k+1][j];
                if(len%2==0 && sum[i][j-k]==sum[j-k+1][j] && len>m)
                    m = len;
            }
        }
        return m;
    }
    public static void main(String[] agrs){
        String a = "153803";
        System.out.println(evnLen(a));
    }
}

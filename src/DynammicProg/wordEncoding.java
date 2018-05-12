package DynammicProg;

public class wordEncoding {
    public static int ways(char a[], int n){
        int count[] = new int[n+1];
        if(n==1 || n==0)
            return 1;
        count[0] = 1;
        count[1] = 1;
        for(int i=2;i<=n;i++){
            count[i] = 0;
            if(a[i-1]=='0')
                count[i] = count[i-1];
            if(a[i-2]=='1' || (a[i-2]=='2' && a[i-1]<'7'))
                count[i] += count[i-2];
        }
        
        return count[n];
    }
    public static int method2(char a[], int n){
        int count = 0;
        if(n==1 || n==0)
            return 1;
        
        if(a[n-1]=='0')
            count = method2(a,n-1);
        if((a[n-2]=='1' || a[n-2]=='2') && a[n-1]<'7')
            count += method2(a,n-2);
        return count;
    }
    public static void main(String[] args){
        char[] digits = {'1','2','3','4'};
        System.out.println(ways(digits,4));
        System.out.println(method2(digits,4));
    }
    
}

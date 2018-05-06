package DynammicProg;

public class subSetSum {
    public static int subSum(int a[], int sum, int k){
        int q = 0;
        if(k==0 && sum!=0)
            return q;
        
        if(a[k-1]>sum)
            return subSum(a,sum,k-1);
        else
            return  a[k-1]+subSum(a,sum,k-1);
        
        
    }
    
    public static void main(String[] args){
        int a[] = {3,34,4,12,5,2};
        int sum = 9;
        if(subSum(a,sum,a.length) != 0)
            System.out.println("True");
        else
            System.out.println("False");
    }
}

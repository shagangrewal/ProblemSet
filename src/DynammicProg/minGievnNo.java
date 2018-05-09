package DynammicProg;

public class minGievnNo {
    public static int steps(int n){
        if(n==1)
            return 0;
        if(n%2==0)
            return 1 + steps(n/2);
        else if(n%3==0)
            return 1+steps(n/3);
        else
            return steps(n-1);
        
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(steps(n));
    }
}

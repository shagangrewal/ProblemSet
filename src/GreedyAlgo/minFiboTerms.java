package GreedyAlgo;

public class minFiboTerms {
    public static int term(int a){
        if(a==0 || a==1)
            return a;
        
        while(a>0){
            int f1 = 0;
            int f2 = 1;
            int f3 = 1;
            while(f3<a){
                f1 = f2;
                f2= f3;
                f3 = f1 + f2;
            }
            return f2;
        }
        return 1;
    }
    
    public static int numTerms(int a){
        int count = 0;
        
        while(a>0){
            int k = term(a);
            if(k>0){
                count++;
            }
            a-=k;
        }
        
        return count;
    }
    
    public static void main(String[] args){
        int a = 17;
        System.out.println(numTerms(a));
    }
}

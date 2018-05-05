package GreedyAlgo;

public class numInFibo {
    public static void fiboNum(int a){
        if(a==0 || a==1)
            System.out.print(a+" ");
        
        while(a>0){
            int f1 = 0;
            int f2 = 1;
            int f3 = 1;
            while(f3<=a){
                f1=f2;
                f2=f3;
                f3 = f1+f2;
            }
            System.out.print(f2+" ");
            a = a-f2;
        }
    }
    
    
    
    public static void main(String[] args){
        int a = 121;
        fiboNum(a);
    }
}

package GreedyAlgo;

public class cuboidToCube {
    public static int gcd(int m, int n){
        if(n==0)
            return m;
        else if(n>m)
            return gcd(n,m);
        else
            return gcd(n,m%n);
    }
    
    public static void  maxVol(int l, int b, int h){
        int side = gcd(l, gcd(b,h));
        
        int num  = l/side;
        num = (num*b)/side;
        num = (num*h)/side;
        
        System.out.println(side +" "+ num);
    }
    
    public static void main(String[] args){
        int l=1,b=2,h=3;
        maxVol(l,b,h);
    }
}

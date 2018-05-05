package GreedyAlgo;

import java.util.HashSet;
import java.util.Iterator;

public class minDiffGroup {
    public static void printGroups(HashSet<Integer> a){
        Iterator<Integer> e = a.iterator();
        while(e.hasNext()){
            System.out.print(e.next()+" ");
        }
        System.out.println();
        
    }
    
    public static void Method1(int n){
        HashSet<Integer> g1 = new HashSet<Integer>();
        HashSet<Integer> g2 = new HashSet<Integer>();
        int gsum = (n*(n+1))/2;
        
        int sum1 = gsum/2;
        int i=1;
        while(sum1>0){
            if(sum1-i>=0)
                g1.add(i);
            sum1-=i;
            i++;
        }
        
        while(i<=n){
            g2.add(i);
            i++;
        }
        
        printGroups(g1);
        printGroups(g2);
    }
    
    public static void Method2(int n){
        HashSet<Integer> g1 = new HashSet<Integer>();
        HashSet<Integer> g2 = new HashSet<Integer>();
        int sum = (n*(n+1))/2;
        int gsum = sum/2;
        for(int i=n;i>0;i--){
            if((gsum-i)>=0){
                g1.add(i);
                gsum-=i;
            }
            else{
                g2.add(i);
            }
        }
        printGroups(g1);
        printGroups(g2);
    }
    
    public static void main(String[] args){
        Method1(6);
        Method2(6);
    }
}

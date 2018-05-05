package GreedyAlgo;
import java.util.*;

public class blncBrckts {
    public static int swaps(String s){
        int count=0;
        int sum =0;
        int p = 0;
        Vector<Integer> hs = new Vector<Integer>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='[')
                hs.add(i);
                
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                ++count;
                ++p;
            }
            if(s.charAt(i)==']'){
                --count;
            }
            if(count<0){
                sum += hs.get(p)-i;
                ++p;
                count = 1;
            }
        }
        return sum;
    }
    
    public static void main(String[] args){
        String s = "[]][][";
        System.out.println(swaps(s));
    }
}

package GreedyAlgo;

import java.util.ArrayList;

public class PoliceThieves {
    public static int catchThieves(char a[], int k){
        int count = 0;
        ArrayList<Integer> p = new ArrayList<Integer>();
        ArrayList<Integer> t = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            if(a[i] == 'P')
                p.add(i);
            else if(a[i]=='T')
                t.add(i);
        }
        int l=0,r=0;
        while(l<t.size() && r<p.size()){
            if(Math.abs(t.get(l)-p.get(r))<=k){
                count++;
                l++;
                r++;
            }
            else if(t.get(l)<p.get(r))
                l++;
            else
                r++;
        }
        return count;
    }
    
    public static void main(String[] args){
        char a[] = {'P','T','T','P','T'};
        int k =2;
        System.out.println(catchThieves(a,k));
    }
}

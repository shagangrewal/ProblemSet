package GreedyAlgo;

import java.util.Arrays;

public class miceToHoles {
    public static int minTime(int a[], int b[]){
        int t = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(t<Math.abs(a[i]-b[i]))
                t = Math.abs(a[i]-b[i]);
        }
        return t;
    }
    
    public static void main(String[] args){
        int a[] = {-10,-79,-79,67,93,-85,-28,-94};
        int b[] = {-2,9,69,25,-31,23,50,78};
        System.out.println(minTime(a,b));
    }
}

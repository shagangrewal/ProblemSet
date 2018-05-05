package GreedyAlgo;
import java.util.Arrays;

public class highPyramid {
    public static int maxH(int a[]){
        int h = 1;
        Arrays.sort(a);
        int prev_w = a[0];
        int curr_w = 0;
        int p_count = 1;
        int c_count = 0;
        for(int i=1;i<a.length;i++){
            curr_w += a[i]; 
            c_count++;
            if(curr_w>prev_w && c_count>p_count){
                p_count = c_count;
                prev_w = curr_w;
                 
                h++;
                curr_w = 0;
                c_count = 0;
            }
        }
        return h;
    }
    
    public static void main(String[] args){
        int a[] = {10,70,20,50,30,60,40,200,1,2};
        System.out.println(maxH(a));
    }
}

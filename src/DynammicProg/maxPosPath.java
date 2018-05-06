package DynammicProg;

public class maxPosPath {
    public static int maxPaths(int m, int n){
        if(m==1 || n==1)
            return 1;
        
        return maxPaths(m-1,n) +maxPaths(m,n-1) ;
    }
    
    public static void main(String[] args){
        System.out.println(maxPaths(3,3));
    }
}

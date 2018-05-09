package DynammicProg;

public class maxSumTriangle {
    public static int maxP(int a[][]){
        for(int i=a.length-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                if(a[i+1][j]>a[i+1][j+1])
                    a[i][j] += a[i+1][j];
                else
                    a[i][j] += a[i+1][j+1];
            }
        }
        return a[0][0];
    }
    
    public static void main(String[] args){
        int a[][] = {{3,0,0,0},{7,4,0,0},{2,4,6,0},{8,5,9,3}};
        System.out.println(maxP(a));
    }
}

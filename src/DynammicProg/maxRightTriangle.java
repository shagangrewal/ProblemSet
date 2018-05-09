package DynammicProg;

public class maxRightTriangle {
    public static int sum(int a[][]){
        for(int i=1;i<a.length;i++){
            for(int j=0;j<=i;j++){
                if(j==0)
                    a[i][j] += a[i-1][j];
                else
                    a[i][j] += Math.max(a[i-1][j], a[i-1][j-1]);
            }
        }
        int max = 0;
        for(int i=0;i<a[0].length;i++){
            if(max < a[a.length-1][i])
                max = a[a.length-1][i];
        }
        return max;
    }
    public static void main(String[] args){
        int a[][] = {{2,0,0},{4,1,0},{1,2,7}};
        System.out.println(sum(a));
    }
}

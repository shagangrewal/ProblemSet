package DynammicProg;

public class maxSizeMat {
    public static void maxSize(int a[][]){
        int s[][] = new int[a.length][a[0].length];
        for(int i=0;i<a[0].length;i++){
            s[0][i] = a[0][1];
        }
        
        for(int i=0;i<a.length;i++){
            s[i][0] = a[i][0];
        }
        int r=0,c=0;
        
        for(int i=1;i<a.length;i++){
            for(int j=1;j<a[0].length;j++){
                if(a[i][j]==1)
                    s[i][j] = Math.min(s[i-1][j],Math.min(s[i][j-1], s[i-1][j-1]))+1;
                else
                    s[i][j] = 0;
            }
        }
        int max = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(s[i][j]>max){
                    max = s[i][j];
                    r = i;
                    c = j;
                }
            }
        }
        for(int i=r;i>(r-max);i--){
            for(int j=c;j>(c-max);j--){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        int m[][] = {{0, 1, 1, 0, 1}, 
                      {1, 1, 0, 1, 0}, 
                      {0, 1, 1, 1, 0},
                      {1, 1, 1, 1, 0},
                      {1, 1, 1, 1, 1},
                      {0, 0, 0, 0, 0}};
        maxSize(m);
    }
}

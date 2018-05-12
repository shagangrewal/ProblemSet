package DynammicProg;

public class maxDecimal {
    public static int maxCost(int a[][]){
        
        for(int i=1;i<a[0].length;i++){
            if(a[0][i]==1)
                a[0][i] = a[0][i-1] + pow(2,i);
            else
                a[0][i] = a[0][i-1];
        }
        for(int i=1;i<a.length;i++){
            if(a[i][0]==1)
                a[i][0] = a[i-1][0] + pow(2,i);
            else
                a[i][0] = a[i-1][0];
        }
        for(int i=1;i<a.length;i++){
            for(int j=1;j<a[0].length;j++){
                if(a[i][j]==1)
                    a[i][j] = Math.max(a[i][j-1],a[i-1][j]+pow(2,i+j));
                else
                    a[i][j] = Math.max(a[i-1][j], a[i][j-1]);
            }
        }
        return a[a.length-1][a[0].length-1];
    }
    public static int pow(int i,int j){
        int m = i;
        while(j>1){
            m = m*i;
            j--;
        }
        return m;
    }
    public static void main(String[] args){
        int a[][] = {{1,1,0,1},{0,1,1,0},{1,0,0,1},{1,0,1,1}};
        System.out.println(maxCost(a));
    }
}

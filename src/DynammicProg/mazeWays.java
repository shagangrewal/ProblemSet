package DynammicProg;

public class mazeWays {
    public static int ways(int a[][]){
        for(int i=0;i<a.length;i++){
            if(a[i][0] == 0)
                a[i][0] = 1;
            else
                break;
        }
        
        for(int j=0;j<a[0].length;j++){
            if(a[0][j] == 0)
                a[0][j] = 1;
            else
                break;
        }
        
        for(int i=1;i<a.length;i++){
            for(int j=1;j<a[0].length;j++){
                if(a[i][j]==-1)
                    continue;
                
                if(a[i-1][j]>0)
                    a[i][j] += a[i-1][j];
                
                if(a[i][j-1]>0)
                    a[i][j] += a[i][j-1];
            }
        }
        return a[a.length-1][a[0].length-1];
    }
    public static void main(String[] args){
        int a[][] = {{0,0,0,0},{0,-1,0,0},{-1,0,0,0},{0,0,0,0}};
        System.out.println(ways(a));
    }
}

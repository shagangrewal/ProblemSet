package DynammicProg;

public class maxPath1Tolast {
    public static int maxCost(int a[][]){
        
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<=(i+1) && j<a[0].length-1;j++){
                if(j==0)
                    a[i+1][j] += Math.max(a[i][j+1], a[i][j]);
                else
                    a[i+1][j] += Math.max(a[i][j-1], Math.max(a[i][j], a[i][j+1]));
            }
        }
        
        int max = 0;
        for(int i=0;i<a[0].length;i++){
            if(max<a[a.length-1][i])
                max = a[a.length-1][i];
        }
        return max;
    }
    public static void main(String[] args){
        int a[][] = {{4,2,3,4},{2,9,1,10},{15,1,3,0},{16,92,41,44}};
        System.out.println(maxCost(a));
    }
}

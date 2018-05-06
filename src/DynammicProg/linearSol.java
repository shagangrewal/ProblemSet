package DynammicProg;

public class linearSol {
    public static int noSol(int coff[], int h){
        int res = 0;
        if(h==0)
            return 1;
        for(int i=0;i<coff.length;i++){
            if(coff[i]<=h)
                res += noSol(coff, h-coff[i]);
        }
        return res;
    }
    
    public static void main(String[] args){
        int coff[] = {2,2,5};
        int rhs = 4;
        System.out.println(noSol(coff,rhs));
    }
}

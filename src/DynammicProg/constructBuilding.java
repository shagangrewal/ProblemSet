package DynammicProg;

public class constructBuilding {
    public static int noB(int k){
        if(k==1)
            return 4;
        
        int countS=1, countB = 1, prev_S = 0, prev_B =0;
        for(int i=2;i<=k;i++){
            prev_S = countS;
            prev_B = countB;
            
            countS = prev_B+prev_S;
            countB = countS;
        }
        int result = countS + countB;
        return result*result;
    }
    public static void main(String[] args){
        int a = 3;
        System.out.println(noB(a));
    }
}

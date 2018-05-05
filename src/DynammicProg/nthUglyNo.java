package DynammicProg;

public class nthUglyNo {
    
    public static int nUgly(int k){
        int count = 1;
        int i = 1;
        while(count<k){
            i++;
            if(isugly(i))
                count++;
        }
        return i;
    }
    
    public static boolean isugly(int a){
        a = div(a,2);
        a = div(a,3);
        a = div(a,5);
        
        return a==1?true:false;
    }
    
    public static int div(int a, int b){
        while(a%b==0){
            a = a/b;
        }
        return a;
    }
    
    public static void main(String[] args){
        int k = 7;
        System.out.println(nUgly(k));
    }
}

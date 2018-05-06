package DynammicProg;

public class maxSumIncSubSeq {
    public static int maxVal(int a[]){
        int m = 0;
        int b[] = new int [a.length];
        for(int i=0;i<a.length;i++){
            b[i] = a[i];
        }
        for(int i=1;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[i]>a[j]){
                    b[i]+=a[j];
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(m<b[i])
                m = b[i];
        }
        return m;
    }
    
    public static void main(String[] args){
        int a[] = {1,101,2,3,100,4,5};
        System.out.println(maxVal(a));
    }
}

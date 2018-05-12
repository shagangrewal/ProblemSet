package DynammicProg;

public class optGameStratgy {
    public static int maxMoney(int a[]){
        int l = a[0];
        int r = a[a.length-1];
        int i = 0;
        int j = a.length-1;
        int cost = 0;
        int m = Math.max(a[i+2], a[j]);
        int n = Math.max(a[i], a[j-2]);
        if(m>n){
            cost = m;
        }
        else{
            cost = n;
        }
        i++;
        j--;
        for(int k=0;k<a.length/2&& i<a.length &&(i-2)<a.length && j-2>=0 && j>=0&& i<j;k++){
            m = Math.max(a[i+2], a[j]);
            n = Math.max(a[i], a[j-2]);
            if(m>n){
                cost += m;
                i+=2;
                j--;
            }
            else{
                cost += r;
                j --;
                i++;
            }
        }
        return cost;
    }
    public static void main(String[] args){
    int a[] = {8,15,3,7};
    int b[] = {2,2,2,2};
    int c[] = {20,30,2,2,2,10};
    System.out.println(maxMoney(a));
    System.out.println(maxMoney(b));
    System.out.println(maxMoney(c));
    }
}

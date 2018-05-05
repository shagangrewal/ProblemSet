package GreedyAlgo;

public class unlockLock {

    
    public static int minRotations(int input, int output){
        int count = 0;
        while(input>0 || output>0){
            count += Math.abs((input%10)-(output%10))<(10-Math.abs((input%10)-output%10))?Math.abs((input%10)-(output%10)):(10-Math.abs((input%10)-output%10));
            input/=10;
            output/=10;
        }
        return  count;
    }
    
    public static void main(String[] args){
        int input = 28756;
        int output = 98234;
        System.out.println(minRotations(input, output));
    }
}

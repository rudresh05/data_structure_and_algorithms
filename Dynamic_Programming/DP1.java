package Dynamic_Programming;

public class DP1 {
    public static int fiboNumber(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        int fib1 =fiboNumber(n-1);
        int fibo2 = fiboNumber(n-2);
        return fib1+fibo2; 
    }
    public static void main(String[] args){
        int n = 8;
        System.out.println(fiboNumber(n)); 
    }
}

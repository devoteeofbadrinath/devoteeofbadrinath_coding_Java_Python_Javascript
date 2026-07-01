package Day1.Java.DynamicProgramming.FibonacciSeries;

public class FibonacciSeriesBottomUpApproach {

    public static void main(String[] args) {
        FibonacciSeriesBottomUpApproach fibonacciSeriesBottomUpApproach = new FibonacciSeriesBottomUpApproach();
        System.out.println("Shreeman Narayan Narayan Hari Hari");
        System.out.println(fibonacciSeriesBottomUpApproach.fibonacciBottomUpApproach(50));
    }

    int fibonacciBottomUpApproach(int n) {
        if(n<=1)
            return n;
        int fib[] = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i<=n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
}

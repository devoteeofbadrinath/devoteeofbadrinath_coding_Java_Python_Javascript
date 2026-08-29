package Day1.Java.DynamicProgramming.FibonacciSeries;

public class FibonacciSeriesTopDownImprovedApproach {

    int[] fib = new int[100];

    public static void main(String[] args) {

    }

    int fibonacciSeriesTopDownImprovedApproach(int n) {
        if (n <= 1)
            return n;
        else fib[n] = fibonacciSeriesTopDownImprovedApproach(n - 1) + fibonacciSeriesTopDownImprovedApproach(n - 2);
            return fib[n]
    }

}

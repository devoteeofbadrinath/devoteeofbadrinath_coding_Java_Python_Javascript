package Day1.Java.DynamicProgramming.FibonacciSeries;

public class FibonacciSeriesTopDownImprovedApproach {

    int[] fib = new int[100];
    int functionCallCountImproved = 0;
    int functionCallCount = 0;

    public static void main(String[] args) {
        int fibonacciNumber = 6;
        FibonacciSeriesTopDownImprovedApproach fibonacciSeriesTopDownImprovedApproach = new FibonacciSeriesTopDownImprovedApproach();
        System.out.println(
                fibonacciSeriesTopDownImprovedApproach.fibonacciSeriesTopDownFurtherImprovedApproach(fibonacciNumber));
        System.out.println(fibonacciSeriesTopDownImprovedApproach.functionCallCountImproved);

        System.out.println(
                fibonacciSeriesTopDownImprovedApproach.fibonacciSeriesTopDownImprovedApproach(fibonacciNumber));
        System.out.println(fibonacciSeriesTopDownImprovedApproach.functionCallCountImproved);

        System.out.println(fibonacciSeriesTopDownImprovedApproach.fibonacciSeriesTopDownApproach(fibonacciNumber));
        System.out.println(fibonacciSeriesTopDownImprovedApproach.functionCallCount);

    }

    int fibonacciSeriesTopDownApproach(int n) {
        functionCallCount++;
        if (n <= 1)
            return n;
        else
            return fibonacciSeriesTopDownApproach(n - 1) + fibonacciSeriesTopDownApproach(n - 2);
    }

    int fibonacciSeriesTopDownImprovedApproach(int n) {
        functionCallCountImproved++;
        if (n <= 1)
            return n;
        else if (fib[n] == 0)
            fib[n] = fibonacciSeriesTopDownImprovedApproach(n - 1) + fibonacciSeriesTopDownImprovedApproach(n - 2);
        else
            return fib[n];
        return fib[n];
    }

    int fibonacciSeriesTopDownFurtherImprovedApproach(int n) {
        if (n <= 1)
            return n;
        int first = 0;
        int second = 1;
        int fibonacciNumber = 0;
        for (int i = 2; i <= n; i++) {
            fibonacciNumber = first + second;
            first = second;
            second = fibonacciNumber;
        }
        return fibonacciNumber;
    }
}

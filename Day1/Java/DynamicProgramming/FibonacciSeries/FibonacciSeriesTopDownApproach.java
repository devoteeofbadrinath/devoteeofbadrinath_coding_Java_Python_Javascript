package Day1.Java.DynamicProgramming.FibonacciSeries;

public class FibonacciSeriesTopDownApproach {

    public static void main(String[] args) {
        System.out.println("Narayan Narayan Hari");
        FibonacciSeriesTopDownApproach fibonacciSeriesTopDownApproach = new FibonacciSeriesTopDownApproach();
        System.out.println(fibonacciSeriesTopDownApproach.fibonacciSeriesTopDownApproach(50));
    }

    int fibonacciSeriesTopDownApproach(int n){
        if (n <= 1)
            return n;
        else return fibonacciSeriesTopDownApproach(n-1) + fibonacciSeriesTopDownApproach(n-2);
    }
}

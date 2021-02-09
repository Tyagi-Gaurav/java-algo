package algo.nthFib;

public class NthFibonacciNumber {
    public long compute(int n) {
        if (n <= 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return compute(n -1 ) + compute(n - 2);
    }
}

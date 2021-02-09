package algo.nthFib;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NthFibonacciNumberTest {

    @Test
    public void computeNthFibonacci() {
        NthFibonacciNumber nthFibonacciNumber = new NthFibonacciNumber();

        assertThat(nthFibonacciNumber.compute(1)).isEqualTo(0);
        assertThat(nthFibonacciNumber.compute(2)).isEqualTo(1);
        assertThat(nthFibonacciNumber.compute(3)).isEqualTo(1);
        assertThat(nthFibonacciNumber.compute(4)).isEqualTo(2);
        assertThat(nthFibonacciNumber.compute(5)).isEqualTo(3);
        assertThat(nthFibonacciNumber.compute(6)).isEqualTo(5);
    }
    //0 1 1 2 3
}
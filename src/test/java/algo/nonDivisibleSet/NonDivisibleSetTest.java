package algo.nonDivisibleSet;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class NonDivisibleSetTest {

    @Test
    public void test() {
        NonDivisibleSet nonDivisibleSet = new NonDivisibleSet();

        assertThat(nonDivisibleSet.findLength(4, Arrays.asList(19, 10, 12, 10, 24, 25, 22))).isEqualTo(3);
        assertThat(nonDivisibleSet.findLength(3, Arrays.asList(1, 7, 2, 4))).isEqualTo(3);
        assertThat(nonDivisibleSet.findLength(5, Arrays.asList(770528134, 663501748, 384261537, 800309024, 103668401, 538539662, 385488901, 101262949, 557792122, 46058493))).isEqualTo(6);
    }
}

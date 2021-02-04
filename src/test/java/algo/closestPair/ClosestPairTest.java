package algo.closestPair;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class ClosestPairTest {

    private ClosestPair closestPair = new ClosestPair();

    @ParameterizedTest
    @MethodSource("testDataStream")
    void test1(TestData testData) {
        assertThat(closestPair.find(testData.testData)).isEqualTo(testData.expectedOutput, within(0.01));
    }

    static Stream<TestData> testDataStream() {
        return Stream.of(
                new TestData(new double[] {1.2, 1.0, 3.5, 5.8, 0.4, 10.8, 1.3, 6.4}, 0.1),
                new TestData(new double[] {6.2, 8.34, 3.5, 15.8, 9.4, 10.8, 1.3, 6.4}, 0.2)
        );
    }

    private static class TestData {
        private double[] testData;
        private double expectedOutput;

        public TestData(double[] testData, double expectedOutput) {
            this.testData = testData;
            this.expectedOutput = expectedOutput;
        }
    }
}
package algo.closestPair;

import java.util.Arrays;

public class ClosestPair {

    public double find(double[] data) {
        double[] sorted = Arrays.stream(data)
                .sorted()
                .toArray();

        double elem1 = sorted[0];
        double elem2 = sorted[1];
        double min = Math.abs(elem1 - elem2);

        for (int i = 1; i < sorted.length - 1; ++i) {
            double diff = Math.abs(sorted[i] - sorted[i + 1]);
            if (diff < min) {
                min = diff;
                elem1 = sorted[i];
                elem2 = sorted[i + 1];
            }
        }

        System.out.printf("Closest Pair was %.2f, %.2f", elem1, elem2);

        return min;
    }
}

package algo.queensAttack;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class QueensAttack {
    public int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        Set<String> obstacleSet =
                Arrays.stream(obstacles).map(x -> x[0] + "," + x[1]).collect(Collectors.toSet());

        return find(r_q, c_q, -1, -1, obstacleSet, n)
                + find(r_q, c_q, 0, -1, obstacleSet, n)
                + find(r_q, c_q, 1, -1, obstacleSet, n)
                + find(r_q, c_q, 1, 0, obstacleSet, n)
                + find(r_q, c_q, 1, 1, obstacleSet, n)
                + find(r_q, c_q, 0, 1, obstacleSet, n)
                + find(r_q, c_q, -1, 1, obstacleSet, n)
                + find(r_q, c_q, -1, 0, obstacleSet, n);
    }

    private int find(int r_q, int c_q, int rowAdder, int columnAdder, Set<String> obstacles, int n) {
        int total = 0;
        int row = r_q + rowAdder;
        int column = c_q + columnAdder;
        while (isValid(n, row, column)) {
            if (!obstacles.contains(row + "," + column))
                total++;
            else {
                break;
            }

            row += rowAdder;
            column += columnAdder;
        }

        return total;
    }

    private boolean isValid(int n, int row, int column) {
        return row > 0 && row <= n && column > 0 && column <= n;
    }
}

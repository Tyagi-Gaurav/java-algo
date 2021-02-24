package algo.queensAttack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QueensAttackTest {

    @Test
    public void queensTest() {
        QueensAttack queensAttack = new QueensAttack();

        assertThat(queensAttack.queensAttack(4, 0, 4, 4, new int[][]{})).isEqualTo(9);
        assertThat(queensAttack.queensAttack(5, 3, 4, 3, new int[][]{{5, 5}, {4, 2}, {2, 3}})).isEqualTo(10);
        assertThat(queensAttack.queensAttack(1, 0, 1, 1, new int[][]{})).isEqualTo(0);
    }
}
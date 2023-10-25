package baseball.util;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class BallCounterTest {
    final Counter ballCounter = new BallCounter();

    @Test
    void 볼이_없다() {
        assertThat(ballCounter.count(List.of(1, 2, 3), List.of(7, 8, 9)))
                .isEqualTo(0);
    }

    @Test
    void 볼이_1개_존재한다() {
        assertThat(ballCounter.count(List.of(1, 2, 3), List.of(2, 8, 9)))
                .isEqualTo(1);
    }
}
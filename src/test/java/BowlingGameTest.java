import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    void should_return_300_when_all_frames_pin() {
        int[] record = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int score = 300;
        Bowling bowling = new Bowling();
        int result = bowling.Computing(record);
        assertEquals(score, result);
    }

    @Test
    void should_return_score_when_has_spare_pin() {
        int[] record = new int[]{10, 10, 10, 8, 2, 5, 4, 10, 10, 10, 10, 10, 10, 10};
        int score = 249;
        Bowling bowling = new Bowling();
        int result = bowling.Computing(record);
        assertEquals(score, result);
    }


}

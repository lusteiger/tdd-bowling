import org.junit.jupiter.api.Assertions;
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

    @Test
    void should_return_score_when_all_lose_pin() {
        int[] record = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int score = 0;
        Bowling bowling = new Bowling();
        int result = bowling.Computing(record);
        assertEquals(score, result);
    }

    @Test
    void should_return_score_when_all_spare_pin() {
        int[] record = new int[]{0, 3, 5, 0, 8, 0, 0, 0, 2, 0, 8, 0, 0, 4, 0, 3, 0, 4, 0, 0};
        int score = 37;
        Bowling bowling = new Bowling();
        int result = bowling.Computing(record);
        assertEquals(score, result);
    }

    @Test
    void should_throw_exception_when_long_array() {
        int[] record = new int[]{0, 3, 5, 0, 8, 2,0, 0, 8,0, 2, 0, 8, 0, 0, 4, 0, 3, 0, 4, 0, 0};

        Bowling bowling = new Bowling();

        Assertions.assertThrows(IllegalArgumentException.class,()->{
            bowling.Computing(record);
        });
    }

    @Test
    void should_throw_exception_when_short_array() {
        int[] record = new int[]{0, 3, 5,  4, 0, 0};

        Bowling bowling = new Bowling();

        Assertions.assertThrows(IllegalArgumentException.class,()->{
            bowling.Computing(record);
        });
    }
}

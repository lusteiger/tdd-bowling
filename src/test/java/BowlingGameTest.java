import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    void should_return_300_when_all_pin() {
        int[]  record = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int score = 300;
        Bowling bowling = new Bowling();
        int result = bowling.computing(record);
        assertEquals(score,result);
    }



}

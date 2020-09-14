import java.util.Arrays;

public class Bowling {


    public int computing(int[] record) {
        int score = 0;
        if (record.length == 12) {
            for (int i = 0; i < record.length - 2; i++) {
                score += record[i] + record[i + 1] + record[i + 2];
            }
            return score;
        }

        return 0;
    }
}

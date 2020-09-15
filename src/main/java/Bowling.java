public class Bowling {


    public int Computing(int[] record) {
        int score = 0;
        int frame = 0;

        if (record.length> 20 || record.length < 11)
            throw new IllegalArgumentException();

        for (int i = 0; i < record.length; i++) {
            if (record[i] == 10) {
                score += record[i] + record[i + 1] + record[i + 2];
                frame++;
            } else if (record[i] + record[i + 1] == 10) {
                score += 10 + record[i + 1];
                i++;
                frame++;
            } else {
                score += record[i] + record[i + 1];
                i++;
                frame++;
            }
            if (frame == 10)
                break;
        }

        return score;
    }


}

package au.adelaide.edu.au;

public class Player {

    private int roll1 = 0;
    private int roll2 = 0;

//    private int frameWithScore = new int[10][];


    public void setThrow(int i) {
    }

    public int getScore() {

        return 0;
    }

    public int getNumberOfFrames() {

        return 10;
    }

    public void setScores(int roll1, int roll2) {
        this.roll1 = roll1;
        this.roll2 = roll2;

    }

    public int addScore() {
        return this.roll1 + this.roll2;
    }

    public void setFrameWithScore(int frame, int roll1, int roll2) {

    }
}

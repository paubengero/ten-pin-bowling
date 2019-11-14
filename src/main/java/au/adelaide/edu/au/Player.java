package au.adelaide.edu.au;

public class Player {

    private int roll1 = 0;
    private int roll2 = 0;

//    private int frameWithScore = new int[10][];
    private int[][] frameWithScore = new int[10][1];

    private int NUMBER_OF_FRAMES = 10;
    private int SCORE_INDEX = 0;


    public void setThrow(int i) {
    }

    public int getScore() {
        return this.addScore();
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

    public void setFrameWithScore(int frameNumber, int roll1, int roll2) {
        this.setScores(roll1, roll2);
        frameWithScore[frameNumber][SCORE_INDEX] =  this.getScore();
    }

    public int getScoreForFrame(int frameNo) {
        return frameWithScore[frameNo][SCORE_INDEX];
    }

    public int getRunningScore() {
        int score = 0;

        for (int frameNo = 0 ; frameNo < NUMBER_OF_FRAMES; frameNo ++){
            score = score + frameWithScore[frameNo][SCORE_INDEX];
        }

        return score;
    }
}

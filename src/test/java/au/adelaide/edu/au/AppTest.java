package au.adelaide.edu.au;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
//    @Test
//    public void shouldAnswerWithTrue() {
//        assertTrue( true );
//    }
//
//    @Test
//    public void testHelloWorld(){
//        App app = new App();
//        assertEquals("Hello World", app.getText() );
//    }

    @Test
    public void testNumberOfPlayers(){
        App app = new App();
        assertEquals(2, app.getNumberOfPlayers());
    }

    @Test
    public void testScore(){
        Player player1 = new Player();
        player1.setThrow(2);
        player1.setThrow(7);
        assertEquals(9 , player1.getScore() );
    }


    @Test
    public void testNumberOfFramesForPlayer(){
        Player player1 = new Player();

        assertEquals(10, player1.getNumberOfFrames());
    }

    @Test
    public void testAddScore(){
        Player player1 = new Player();
        player1.setScores(1,7);
        assertEquals(8, player1.addScore());

        player1.setScores(0, 6);
        assertEquals(6, player1.addScore());

    }


    @Test
    public void testFrameWithScore(){
        Player player1 = new Player();
        player1.setFrameWithScore(0,1,7);
        assertEquals(8, player1.getScoreForFrame(0));

        player1.setFrameWithScore(1,9,0);
        assertEquals(9, player1.getScoreForFrame(1));
    }

    @Test
    public void testRunningScore(){
        Player player1 = new Player();
        player1.setFrameWithScore(0,1,7);
        player1.setFrameWithScore(1,0,7);
        player1.setFrameWithScore(2,2,5);

        assertEquals(22, player1.getRunningScore());
    }


}

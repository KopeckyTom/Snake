import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @org.junit.jupiter.api.Test
    void update() {

        Game game = new Game();
        game.head.setLocation(0,0);
        game.myKeyListener.setRight(true);
        game.update();
        assertEquals(50,game.head.getX());

    }

    @org.junit.jupiter.api.Test
    void newApple() {

        Game game = new Game();
        game.setScorePoints(15);
        game.newApple();
        assertEquals(16,game.getScorePoints());

    }
}
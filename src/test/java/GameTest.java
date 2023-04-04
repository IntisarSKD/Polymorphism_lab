import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class GameTest {

    Game game;

    @BeforeEach
    public void setUp(){
        game = new Game("GTAV", "Rockstar Games", "Action", 2013, 18);
    }


    @Test
    public void hasMultiplayer(){
        assertThat(game.hasMultiplayer()).isEqualTo("Of course! It's the reason why this game is still alive after 10 years!");
    }


}
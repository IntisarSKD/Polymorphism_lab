import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class FilmTest {
    Film film;

    @BeforeEach
    public void setUp() {
        film = new Film("The Shawshank Redemption", "Frank Darabont", "Drama", 1994, 9);
    }

    @Test
    public void hasSubtitles(){
        assertThat(film.countSubtitles()).isEqualTo("Yes, over 10 different languages!");
    }

}

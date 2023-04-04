import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MediaTest {

    private Media media;

    @BeforeEach
    public void setUp() {
        media = new Media("The Lord of the Rings", "HarperCollins", "Fantasy", 1954, 10);
    }

    @Test
    public void testGetTitle() {
        assertThat(media.getTitle()).isEqualTo("The Lord of the Rings");
    }

    @Test
    public void testGetPublisher() {
        assertThat(media.getPublisher()).isEqualTo("HarperCollins");
    }

    @Test
    public void testGetGenre() {
        assertThat(media.getGenre()).isEqualTo("Fantasy");
    }

    @Test
    public void testGetYear() {
        assertThat(media.getYear()).isEqualTo(1954);
    }

    @Test
    public void testGetRating() {
        assertThat(media.getRating()).isEqualTo(10);
    }

    @Test
    public void testSetTitle() {
        media.setTitle("Harry Potter");
        assertThat(media.getTitle()).isEqualTo("Harry Potter");
    }

    @Test
    public void testSetPublisher() {
        media.setPublisher("Bloomsbury Publishing");
        assertThat(media.getPublisher()).isEqualTo("Bloomsbury Publishing");
    }

    @Test
    public void testSetGenre() {
        media.setGenre("Fantasy");
        assertThat(media.getGenre()).isEqualTo("Fantasy");
    }

    @Test
    public void testSetYear() {
        media.setYear(1997);
        assertThat(media.getYear()).isEqualTo(1997);
    }

    @Test
    public void testSetRating() {
        media.setRating(9);
        assertThat(media.getRating()).isEqualTo(9);
    }

    @Test
    public void testIsRecommended() {
        assertThat(media.isRecommended()).isEqualTo("Yes! It's really good.");
    }

}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShopTest {

    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
    }

    @Test
    public void testCountMedia() {
        assertThat(shop.countMedia()).isEqualTo(0);
    }

    @Test
    public void testAddMedia() {
        Media media1 = new Book("A Game of Thrones", "Bantam Spectra", "Fantasy", 1996, 9);
        Media media2 = new Film("Inception", "Warner Bros. Pictures", "Science fiction", 2010, 8);
        Media media3 = new Game("The Legend of Zelda: Breath of the Wild", "Nintendo", "Action-adventure", 2017, 10);

        shop.addMedia(media1);
        assertThat(shop.countMedia()).isEqualTo(1);

        shop.addMedia(media2);
        assertThat(shop.countMedia()).isEqualTo(2);

        shop.addMedia(media3);
        assertThat(shop.countMedia()).isEqualTo(3);
    }

    @Test
    public void testGetMediaCollection() {
        ArrayList<Media> testCollection = new ArrayList<>();
        testCollection.add(new Book("A Promised Land", "Crown", "Memoir", 2020, 8));
        testCollection.add(new Film("The Godfather", "Paramount Pictures", "Crime", 1972, 10));
        testCollection.add(new Game("The Last of Us Part II", "Sony Interactive Entertainment", "Action-adventure", 2020, 10));

        shop.setMediaCollection(testCollection);

        assertThat(shop.getMediaCollection()).isEqualTo(testCollection);
    }

    @Test
    public void testSetMediaCollection() {
        ArrayList<Media> testCollection = new ArrayList<>();
        testCollection.add(new Book("A Promised Land", "Crown", "Memoir", 2020, 8));
        testCollection.add(new Film("The Godfather", "Paramount Pictures", "Crime", 1972, 10));
        testCollection.add(new Game("The Last of Us Part II", "Sony Interactive Entertainment", "Action-adventure", 2020, 10));

        shop.setMediaCollection(testCollection);

        assertThat(shop.getMediaCollection()).isEqualTo(testCollection);
    }


}

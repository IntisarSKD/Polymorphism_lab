import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class BookTest {
    private Book book;

    @BeforeEach
    public void setUp() {
        book = new Book("To Kill a Mockingbird", "HarperCollins", "Southern Gothic", 1960, 4);
    }

    @Test
    public void bookCover() {
        assertThat(book.hardCover()).isEqualTo(false);
    }
}

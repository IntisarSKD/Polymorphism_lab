public class Book extends Media {

    public Book(String title, String publisher, String genre, int year, int rating){
        super(title, publisher, genre, year, rating);

    }

    public boolean hardCover() {
        return false;
    }


}

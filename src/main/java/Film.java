public class Film extends Media {

    public Film(String title, String publisher, String genre, int year, int rating){
        super(title, publisher, genre, year, rating);
    }

    public String countSubtitles() {
        return "Yes, over 10 different languages!";
    }


}

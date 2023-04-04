public class Media{

    protected String title;
    protected String publisher;
    protected String genre;
    protected int year;
    protected int rating;

    public Media(String title, String publisher, String genre, int year, int rating) {
        this.title = title;
        this.publisher = publisher;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String isRecommended(){
        return "Yes! It's really good.";
    }

}

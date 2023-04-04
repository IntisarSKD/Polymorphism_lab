public class Game extends Media {


    public Game(String title, String publisher, String genre, int year, int rating){
        super(title, publisher, genre, year, rating);
    }

    public String hasMultiplayer() {
        return "Of course! It's the reason why this game is still alive after 10 years!";
    }

}

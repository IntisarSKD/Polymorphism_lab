import java.util.ArrayList;

public class Shop {
    private ArrayList<Media> mediaCollection;

    public Shop() {
        this.mediaCollection = new ArrayList<>();
    }

    public int countMedia(){
        return this.mediaCollection.size();
    }

    public void addMedia(Media newMedia) {
        this.mediaCollection.add(newMedia);
    }

    public ArrayList<Media> getMediaCollection() {
        return mediaCollection;
    }

    public void setMediaCollection(ArrayList<Media> mediaCollection) {
        this.mediaCollection = mediaCollection;
    }
}

import java.io.Serializable;
public class Album implements Serializable {
    private int id;
    private String artist;
    private String name;
    private String genre;
    private int releaseDate;
    private float sales;
    public Album() {  }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
    public float getSales() {
        return sales;
    }
    public void setSales(float sales) {
        this.sales = sales;
    }
}

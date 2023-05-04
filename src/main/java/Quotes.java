import java.io.Serializable;
public class Quotes implements Serializable {
    private int id;
    private int authorId;
    private String author;
    private String content;
    public Quotes(){}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAuthorId() {
        return authorId;
    }
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
    public String getAuthor() {
        return author;}
    public void setAuthor(String author) {
        this.author = author;}
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}

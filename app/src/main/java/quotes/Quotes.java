package quotes;

public class Quotes {
    private String author;
    private String text;

    public Quotes(String author, String quote) {
        this.author = author;
        this.text = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "author='" + author + '\'' +
                ", quote='" + text + '\'' +
                '}';
    }


}

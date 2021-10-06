package quotes;

import java.util.Objects;

public class API {
    public String quoteText;
    public  String quoteAuthor;
    public String senderName;
    public String senderLink;
    public String quoteLink;




    @Override
    public String toString() {
        return "ApiQuote{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                ", senderName='" + senderName + '\'' +
                ", senderLink='" + senderLink + '\'' +
                ", quoteLink='" + quoteLink + '\'' +
                '}';
    }
}
package net.witr.wandroid;

/**
 * Created by witrdotnet <witr.net@gmail.com> on 03/05/15.
 */
public class ModelElement {

    public static final String ID = "_id";
    public static final String TITLE = "title";
    public static final String MODIFIED_DATE = "modified_date";
    public static final String URL = "url";
    public static final String CONTENT = "content";

    private String id;
    private String title;
    private String date;
    private String content;

    public ModelElement(String id, String title, String date, String content) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

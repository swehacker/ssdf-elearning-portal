package se.ssdf.elearning.web.news;

import se.ssdf.elearning.news.Message;

public class FeedMessage implements Message {
    private final String title;
    private final String description;
    private final String link;
    private final String author;
    private final String guid;

    FeedMessage(String title, String description, String link, String author, String guid) {
        this.title = title;
        this.description = description;
        this.link = link;
        this.author = author;
        this.guid = guid;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getAuthor() {
        return author;
    }

    public String getGuid() {
        return guid;
    }

    @Override
    public String toString() {
        return "FeedMessage [title=" + title + ", description=" + description
                + ", link=" + link + ", author=" + author + ", guid=" + guid
                + "]";
    }
}

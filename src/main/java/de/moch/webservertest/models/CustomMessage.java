package de.moch.webservertest.models;

public class CustomMessage {
    private final String title;
    private final String content;

    public CustomMessage(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}

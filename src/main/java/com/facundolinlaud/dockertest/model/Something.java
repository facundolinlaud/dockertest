package com.facundolinlaud.dockertest.model;

public class Something {
    private final long id;
    private final String content;

    public Something(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}

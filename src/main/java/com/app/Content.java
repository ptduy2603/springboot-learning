package com.app;

public class Content {
    private String message;
    private String name;

    public Content(String message, String name) {
        this.message = message;
        this.name = name;
    }

    public String getMessage() {
        return this.message;
    }

    public String getName() {
        return this.name;
    }
}

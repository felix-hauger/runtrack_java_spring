package com.example.demo.model;

import jakarta.validation.constraints.Min;

public class Message {
    private String author;

    @Min(value = 13, message = "Must be 13 years old or older to post")
    private Integer age;

    private String content;

    public Message(String author, Integer age,String content) {
        this.author = author;
        this.age = age;
        this.content = content;
    }

    public Message() {}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

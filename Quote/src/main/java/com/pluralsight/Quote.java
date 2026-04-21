package com.pluralsight;

public class Quote {

    private String author;
    private String text;
    private String category;
    private int year;

    public Quote(String author, String text, String category, int year) {
        this.author = author;
        this.text = text;
        this.category = category;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
//        this.author = author;
        if (author == null || author.length() < 2) {
            throw new IllegalArgumentException("Author name is too short");
        }
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                ", category='" + category + '\'' +
                ", year=" + year +
                '}';
    }
}

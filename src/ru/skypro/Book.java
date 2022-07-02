package ru.skypro;

public class Book {
    private String bookName;
    private String Author;
    private int publishingYear;

    public Book(String bookName, String Author, int publishingYear) {
        this.bookName = bookName;
        this.Author = Author;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}

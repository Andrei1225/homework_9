package ru.skypro;

public class Book {
    private String bookName;
    private String authorBook;
    private int publishingYear;

    public Book(String bookName, String authorBook, int publishingYear) {
        this.bookName = bookName;
        this.authorBook = authorBook;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}

package HW9;

import javax.print.DocFlavor;

public class Book {
    private final String bookName;
    private int publishingYear;
    Author author;

    public Book(String bookName, int publishingYear, Author author) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.author = author;
    }
    public String getBookName() {
        return bookName;
    }
    public int getPublishingYear () {
        return publishingYear;
    }
    public Author getAuthor() {
        return author;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}

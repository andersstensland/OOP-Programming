package oppgave1;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private String color;
    private boolean bookStatus;


    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book(String title, String author, int numberOfPages, String color, Boolean bookStatus) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.color = color;
        this.bookStatus = bookStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void openBook() {
        System.out.println("Opening book...");
        this.bookStatus = true;
    }

    public void closeBook() {
        System.out.println("Closing book...");
        this.bookStatus = false;
    }

    public boolean isBookStatus() {
        if (bookStatus == true) {
            System.out.println("Book is open");
        } else {
            System.out.println("Book is closed");
        }
        return bookStatus;
    }


    public void printBookInfo() {
        System.out.println("Printing book information: ");

        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Number of pages: " + getNumberOfPages());
        System.out.println("Color: " + getColor());
        System.out.println(isBookStatus());
    }

    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "JK Rowling", 100, "Red", false);
        Book test = new Book("Test", "Pelle", 50, "Pink", false);

        book.openBook();
        book.printBookInfo();
        test.printBookInfo();
    }

}

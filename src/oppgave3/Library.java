package oppgave3;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Author> authors = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void printBookInfo() {
        System.out.println("Printing book information: ");

        for (Book book : this.books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Number of pages: " + book.getNumberOfPages());
            System.out.println("Color: " + book.getColor());
            System.out.println(book.isBookStatus());
        }
    }

    public void printAuthorInfo() {
        System.out.println("Printing author information: ");

        for (Author author : this.authors) {
            System.out.println("Name: " + author.getName());
            System.out.println("Birthdate: " + author.getBirthdate());
            System.out.println("Number of books: " + author.getAge());
            System.out.println("Age: " + author.getAge());

        }
    }

    public static void main(String[] args) {
        Library library = new Library();


        oppgave3.Book book = new oppgave3.Book(
                "Harry Potter",
                "JK Rowling",
                100,
                "Red",
                false);

        oppgave3.Book test = new oppgave3.Book(
                "Test",
                "Pelle",
                50,
                "Pink",
                false);

        oppgave3.Author author1 = new oppgave3.Author(
                "JK. Rowling",
                "22/09/01",
                100,
                54
        );


        library.addBook(book);
        library.addBook(test);

        library.addAuthor(author1);

        library.printBookInfo();
        library.printAuthorInfo();

    }
}

package oppgave3;

class Book extends Library {

    private String title;
    private String author;
    private int numberOfPages;
    private String color;
    private boolean bookStatus;


    public Book(String title, String author, int numberOfPages, String color, Boolean bookStatus) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.color = color;
        this.bookStatus = bookStatus;
    }

    public String getTitle() {
        return this.title;
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




}

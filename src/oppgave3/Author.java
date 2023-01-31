package oppgave3;

public class Author extends Library {
    private String name;
    private String birthdate;
    private int numberOfBooks;
    private int age;

    public Author(String name, String birthdate, int numberOfBooks, int age) {
        this.name = name;
        this.birthdate = birthdate;
        this.numberOfBooks = numberOfBooks;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

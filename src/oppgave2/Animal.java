package oppgave2;

public class Animal {

    private String type;
    private String color;
    private String size;
    private int weight;
    private int height;

    public Animal(String type, String color, String size, int weight, int height) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.weight = weight;
        this.height = height;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("oppgave2.Tiger", "Blue", "Large", 12, 12);
        Elephant elephant = new Elephant("oppgave2.Elephant", "Grey", "XLL", 200, 200);
        Koala koala = new Koala("oppgave2.Koala", "Grey", "Small", 10, 20);


        tiger.setColor("Yellow");
        elephant.setSize("XLLLL");
        koala.setHeight(15);
        koala.setWeight(50);

        System.out.println(tiger);
        koala.climbing();
        tiger.rawr();
        elephant.eat();
    }
}

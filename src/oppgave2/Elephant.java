package oppgave2;

import oppgave2.Animal;

public class Elephant extends Animal {

    public Elephant(String type, String color, String size, int weight, int height) {
        super(type, color, size, weight, height);
    }

    public void eat() {
        System.out.print("Nom nom nom");
    }
}

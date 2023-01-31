package oppgave2;

import oppgave2.Animal;

public class Koala extends Animal {

    public Koala(String type, String color, String size, int weight, int height) {
        super(type, color, size, weight, height);
    }

    public void climbing() {
        System.out.println("A " + getType() + " is climbing");
    }
}

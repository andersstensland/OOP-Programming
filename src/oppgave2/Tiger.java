package oppgave2;

import oppgave2.Animal;

public class Tiger extends Animal {
    public Tiger(String type, String color, String size, int weight, int height) {
        super(type, color, size, weight, height);
    }

    public void rawr() {
        System.out.println("Rawr " + getSize() + " " + getColor() + " " + getType() + " " + getWeight() + " " + getHeight());
    }


}

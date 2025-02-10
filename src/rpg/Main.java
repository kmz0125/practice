package rpg;

public class Main {

    public static void main(String[] args) {
        Hero h = new Hero("HERO", 50, 5, 3);

        Matango ma = new Matango("MatangoA", 20, 5, 3);
        Matango mb = new Matango("MatangoB", 30, 6, 4);

        h.attack(ma);
        ma.attack(h);
        mb.attack(h);
        h.sit(5);
        ma.gas(h);
        h.slip();
        h.sit(25);
        h.run();

    }
}

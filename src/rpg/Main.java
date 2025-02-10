package rpg;

public class Main {

    public static void main(String[] args) {
        Hero h = new Hero("HERO", 100, 50, 5, 3);
        Sword s = new Sword();
        s.name = "短剣";
        s.damage = 10;
        h.sword = s;
        System.out.println("現在の武器は" + h.sword.name);

        Matango ma = new Matango("MatangoA", 20, 5, 3);
        Matango mb = new Matango("MatangoB", 30, 6, 4);

        h.attack(ma);
        ma.attack(h);
        mb.attack(h);
        h.sit(5);
        ma.gas(h);
        h.slip();
        h.sit(25);
        h.selfAid();
        h.pray(5);
        h.run();

    }
}

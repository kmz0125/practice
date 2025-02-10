package rpg;

public class Main {

    public static void main(String[] args) {
        Hero h1 = new Hero("HERO1", 100, 50, 5, 3);
        Hero h2 = new Hero("HERO2", 200, 40, 4, 1);

        Wizard w = new Wizard();
        w.name = "Wizard";

        Sword s = new Sword();
        s.name = "短剣";
        h1.sword = s;
        System.out.println("現在の武器は" + h1.sword.name);

        Matango ma = new Matango("MatangoA", 20, 5, 3);
        Matango mb = new Matango("MatangoB", 30, 6, 4);

        h1.attack(ma);
        h2.attack(mb);
        ma.attack(h1);
        mb.attack(h2);
        ma.gas(h1);
        mb.gas(h2);
        h1.sit(25);
        h1.selfAid();
        w.heal(h1, w);
        w.heal(h2, w);
        h1.pray(5);
    }
}

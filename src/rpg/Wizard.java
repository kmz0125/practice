package rpg;

public class Wizard {
    public String name;
    public int hp;

    public void heal(Hero h, Wizard w) {
        System.out.println(w.name + "はヒールを唱えた！");
        h.hp +=10;
        System.out.println(h.name + "のHPを10回復した！");
    }
}

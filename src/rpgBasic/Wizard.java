package rpgBasic;

public class Wizard {
    public String name;
    public int hp;

    public void heal(Hero h) {
        System.out.println(this.name + "はヒールを唱えた！");
        h.hp +=10;
        System.out.println(h.name + "のHPを10回復した！");
    }
}

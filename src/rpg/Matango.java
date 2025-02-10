package rpg;

public class Matango {
    public String name;
    public int hp;
    public int offense;
    public int defense;
    final int LEVEL =10;

    public Matango() {

    }

    public Matango(String name, int hp, int offense, int defense) {
        this.name = name;
        this.hp=hp;
        this.offense = offense;
        this.defense = defense;
    }


    public void attack(Hero opponent) {
        int damage = this.offense - opponent.defense;
        if(damage>0) {
            opponent.hp = opponent.hp-damage;
            System.out.println(this.name + "は" + opponent.name + "に" +damage + "のダメージを与えた！");
        }else {
            System.out.println("miss!" + this.name + "は" + opponent.name + "にダメージを与えられなかった");
        }
    }

    public void gas(Hero opponent) {
        System.out.println("お化けキノコ" + this.name + "は毒ガスをだした！");
        opponent.hp =-2;
        System.out.println("2のダメージ！");

    }

    public void run() {
        System.out.println("お化けキノコ" + this.name + "は逃げだした！");
    }
}

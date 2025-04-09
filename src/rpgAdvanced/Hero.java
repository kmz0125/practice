package rpgAdvanced;

import rpgBasic.Matango;

public class Hero {
    String name = "HERO1";
    int hp = 100;
    public int offense;
    public int defense;
    final int LEVEL =10;

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた！");
    }

    public final void slip() {
        this.hp -=5;
        System.out.println(this.name + "は転んだ！");
        System.out.println("5のダメージ");
    }

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }
}

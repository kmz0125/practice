package rpg;

public class Main {

    public static void main(String[] args) {
        //名前、HP、MP、攻撃力、防御力
        //HERO作成
        Hero h1 = new Hero("HERO1", 100, 50, 5, 3);
        Hero h2 = new Hero("HERO2", 200, 40, 4, 1);

        //武器作成
        Sword s1 = new Sword();
        s1.name = "短剣";
        h1.sword = s1;
        Sword s2 = new Sword();
        s2.name = "小刀";
        h2.sword = s2;
        System.out.println(h1.name + "の現在の武器は" + h1.sword.name);
        System.out.println(h2.name + "の現在の武器は" + h2.sword.name);

        //Wizard作成
        Wizard w = new Wizard();
        w.name = "Wizard";

        //名前、HP、攻撃力、防御力
        //お化けキノコ作成
        Matango ma = new Matango("MatangoA", 20, 5, 3);
        Matango mb = new Matango("MatangoB", 30, 6, 4);

        //HEROの攻撃
        h1.attack(ma);
        h2.attack(mb);

        //お化けキノコの攻撃
        ma.attack(h1);
        mb.attack(h2);
        ma.gas(h1);
        mb.gas(h2);

        //HEROの行動
        h1.pray(5);
        h1.slip();
        h2.slip();
        h1.sit(25);
        h1.selfAid();

        //Wizardの行動
        w.heal(h1);
        w.heal(h2);

    }
}

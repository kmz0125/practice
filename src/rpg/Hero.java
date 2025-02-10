package rpg;

public class Hero {
    public String name;
    public int hp;
    public int offense;
    public int defense;
    final int level = 10;

    public Hero() {

    }

    public Hero(String name, int hp, int offense, int defense) {
        this.name = name;
        this.hp = hp;
        this.offense =offense;
        this.defense =defense;
    }

    public void attack(Matango opponent) {
        int damage = this.offense - opponent.defense;
        if(damage>0) {
            opponent.hp = opponent.hp-damage;
            System.out.println(this.name + "は" + opponent.name + "に" +damage + "のダメージを与えた！");
        }else {
            System.out.println("miss!" + this.name + "は" + opponent.name + "にダメージを与えられなかった");
        }
    }

    public void sleep() {
        this.hp = 100;
        System.out.print(this.name + "は、眠って回復した！");
    }

    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }

    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ！");
    }

    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}

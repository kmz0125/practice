package rpgBasic;

public class Hero {
    public String name;
    public int hp;
    final int MAX_HP = 100;
    public int mp;
    final int MAX_MP = 50;
    public int offense;
    public int defense;
    final int level = 10;
    public Sword sword;

    public Hero() {

    }

    public Hero(String name, int hp, int mp, int offense, int defense) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.offense = offense;
        this.defense = defense;
    }

    public void attack(Matango opponent) {
        int damage = this.offense - opponent.defense;
        if (damage > 0) {
            opponent.hp = opponent.hp - damage;
            System.out.println(this.name + "は" + opponent.name + "に" + damage + "のダメージを与えた！");
        } else {
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

    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた！");
        this.mp -= 5;
        this.hp = MAX_HP;
        System.out.println("HPが最大まで回復した");
    }

    public int pray(int sec) {
        System.out.println(this.name + "は" + sec + "秒天に祈った！");
        int recover = new java.util.Random().nextInt(3) + sec;

        //小さいほうの値を選択して最大MPを超えないようにする
        int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

        this.mp += recoverActual;
        System.out.println("MPが" + recoverActual + "回復した");
        return recoverActual;
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
        System.out.println("最終MPは" + this.mp + "でした");
    }
}

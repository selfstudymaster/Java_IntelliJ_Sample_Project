package cleric;

public class Cleric {
    String name = "聖職者";
    int hp = 50;
    static final int MAX_HP = 50;
    int mp = 10;
    static final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(this.name + "は魔法を唱えた");
        this.mp -= 5;
        this.hp = this.MAX_HP;
        System.out.println(this.name + "のHPが50まで回復した");
    }

    public int pray(int sec) {
        System.out.println(this.name + "は" + sec + "秒祈った");
        int recover = new java.util.Random().nextInt(3);
        int recoverActual = Math.min(this.MAX_HP - this.mp, recover);
        this.mp += recoverActual;
        System.out.println("MPが" + recoverActual + "回復した");
        return recoverActual;
    }

    public Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Cleric(String name, int hp) {
        this(name, hp, Cleric.MAX_MP);
    }

    public Cleric(String name) {
        this(name, Cleric.MAX_HP);
    }
}

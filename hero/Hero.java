package hero;
import sword.Sword;
import matango.Matango;

public class Hero implements Cloneable{
    public int hp;
    public String name;
    public static int money;
    public static void setRandomMoney() {
        Hero.money = (int) (Math.random() * 1000);
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name == null) {
            throw new IllegalArgumentException("名前がnull");
        }
        if(name.length() <= 3) {
            throw new IllegalArgumentException("名前が短すぎる");
        }
        if(name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎ");
        }
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public Sword sword; // Swordクラス型のフィールドsword

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }


    void bye() {
        System.out.println("勇者は別れを告げた");
    }

    private void die() {
        System.out.println(this.name + "は死んでしまった");
        System.out.println("GAMEOVER");
    }

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した");
    }

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("お化けきのこ" + m.suffix + "に5ポイントのダメージを与えた！");
        this.hp -= 5;
        if(this.hp <= 0) {
            this.die();
        }
    }

    // 引数リストにnameをもつコンストラクタで初期値を定義
    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }

    // 引数リストをもたないコンストラクタの初期値を定義
    public Hero() {
        this.hp = 100;
        this.name = "ダミー";
    }

    public Hero clone() {
        Hero result = new Hero();
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword.clone();

        return result;
    }

    public String toString() {
        return this.name + "のHPは" + this.hp;
    }

    public boolean equals(Object o) {
        return true;
    }

    public int hashCode() {
        int result = 37;
        result = result * 31 + name.hashCode();
        result = result * 31 + hp;
        return result;
    }

}

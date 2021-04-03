package wizard;
import hero.Hero;

public class Wizard {
    public String name;
    public int hp;

    public void heal (Hero h1) {
        h1.hp += 10;
        h1 = h1;
        System.out.println(h1.name + "のHPを10回復した！");
    }
}

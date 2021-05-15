package sword;

public class Sword {

    public String name;
    public int damage;

    public Sword(String name) {
        this.name = name;
    }

    public Sword clone() {
        Sword result = new Sword(name);
        return result;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

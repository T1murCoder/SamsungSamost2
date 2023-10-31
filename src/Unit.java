public class Unit {
    private String name;
    private int health;

    public Unit() {
        name = "Hero";
        health = 100;
    }

    public Unit(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Unit(Unit unit) {
        this.name = unit.name;
        this.health = unit.health;
    }

    public void printInfo() {
        System.out.println("=======================");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > 0) this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }
}

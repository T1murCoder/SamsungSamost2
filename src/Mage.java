public class Mage extends Unit {

    private int mana;

    public Mage() {
        super();
        mana = 100;
    }

    public Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    public Mage(Mage mage) {
        super(mage.getName(), mage.getHealth());
        this.mana = mage.mana;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mana: " + mana);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana > 0) this.mana = mana;
    }
}

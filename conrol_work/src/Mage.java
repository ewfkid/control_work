public class Mage extends Unit {
    private int mana;

    public Mage(int health, String name, int mana) {
        super(health, name);
        if (mana > 0) {
            this.mana = mana;
        } else {
            this.mana = 0;
        }
    }

    public Mage(Mage mage){
        this(mage.health, mage.name, mage.mana);
    }
    @Override

    public void printInfo() {
        super.printInfo();
        System.out.println("Mage’s mana = " + mana);
    }
}

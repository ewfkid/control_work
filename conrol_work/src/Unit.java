public class Unit {
    protected int health;
    protected String name;

    public Unit(int health, String name) {
        if (health > 0) {
            this.health = health;
        } else {
            this.health = 0;
        }
        this.name = name;
    }
    public void printInfo(){
        System.out.println("Health = " + health);
        System.out.println("Name : " + name);
    }

    public Unit(Unit unit){
        this(unit.health, unit.name);
    }
}

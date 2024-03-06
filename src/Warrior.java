import java.util.concurrent.ThreadLocalRandom;

public class Warrior extends Character{

    private int stamina;
    private int strength;

    public Warrior() {
    }

    public Warrior(int id, String name, int hp, boolean isAlive, int stamina, int strength) {
        super(ThreadLocalRandom.current().nextInt(1, 100),
                Method.randomeName(),ThreadLocalRandom.current().nextInt(100, 200), isAlive);
        this.stamina = ThreadLocalRandom.current().nextInt(10, 50);
        this.strength = ThreadLocalRandom.current().nextInt(1, 10);
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return super.toString() +

                getName() + "'s Stats:" + "\n" +
                "Stamina= " + stamina + "\n"+
                "Strength= " + strength + "\n" +
                "--------------------------------"
                ;
    }
}

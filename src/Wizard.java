import java.util.concurrent.ThreadLocalRandom;

public class Wizard extends Character{

    private int mana;
    private int intelligence;

    public Wizard() {
    }

    public Wizard(int id, String name, int hp, boolean isAlive, int mana, int intelligence) {
        super(ThreadLocalRandom.current().nextInt(1, 100), Method.randomeName(),
                ThreadLocalRandom.current().nextInt(100, 200), isAlive);
        this.mana = ThreadLocalRandom.current().nextInt(10, 50);
        this.intelligence = ThreadLocalRandom.current().nextInt(10, 50);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return super.toString() +

                getName() + "'s Stats:" + "\n" +
                "Mana= " + mana + "\n" +
                "Intelligence= " + intelligence + "\n" +
                "--------------------------------"
                ;
    }


}

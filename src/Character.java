import java.util.concurrent.ThreadLocalRandom;

public class Character {

    private int id;
    private String name;
    private int hp;
    private boolean isAlive;

    public Character() {
    }

    public int getId() {
        return id;
    }

    public Character(int id, String name, int hp, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    //each character will fight in a certain way ?¿
    public void fight(){

    }

    @Override
    public String toString() {
        return
                "\n" + "Id Number= " + id + "\n" +
                "Name= " + name + "\n" +
                "Health Point= " + hp + "\n"  /*
                ", isAlive=" + isAlive -------don´t need now to show at the beguining */
                ;
    }
}

















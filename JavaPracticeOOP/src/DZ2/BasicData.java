package DZ2;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BasicData implements Heal {
    private String name;
    private int attack;
    private int protection;
    private int[] damage;
    private int maxHealth;
    private int health;
    private int speed;

    public BasicData(String name, int attack, int protection, int[] damage, int health, int speed) {
        this.name = name;
        this.attack = attack;
        this.protection = protection;
        this.damage = damage;
        this.maxHealth = health;
        this.health = maxHealth - ((int) (Math.random() * maxHealth));
        this.speed = speed;
    }

    public BasicData() {
    }

    public String getInfo() {
        return String.valueOf(Math.round((health * 1.0 / maxHealth * 100) * 100.0 / 100.0));
    }

    public void heal(ArrayList<BasicData> list) {

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int[] getDamage() {
        return damage;
    }


    @Override
    public String toString() {
        return "Имя=" + name +
                ", Атака=" + attack +
                ", Защита=" + protection +
                ", Урон=" + Arrays.toString(damage) +
                ", Здоровье=" + health + "/" + maxHealth + " (" + getInfo() + "%)" +
                ", Скорость=" + speed;
    }
}

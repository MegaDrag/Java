package DZ5.unit;

import DZ5.Vector2;

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
    private Vector2 position;
    private ArrayList<BasicData> array;

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

    public BasicData(String name,ArrayList<BasicData> array,int x, int y, int attack, int protection, int[] damage, int health, int speed) {
        this.name = name;
        this.array = array;
        this.position = new Vector2(x,y);
        this.attack = attack;
        this.protection = protection;
        this.damage = damage;
        this.maxHealth = health;
        this.health = maxHealth - ((int) (Math.random() * maxHealth));
        this.speed = speed;
    }

    public String getInfo() {
        return String.valueOf(Math.round((health * 1.0 / maxHealth * 100) * 100.0 / 100.0));
    }

    public void step(ArrayList<BasicData> list) {

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

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getProtection() {
        return protection;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getSpeed() {
        return speed;
    }

    public Vector2 getPosition() {
        return position;
    }
    public  String getNameClass (){
        return  this.getClass().getSimpleName();
    }



    @Override
    public String toString() {
        return  "Класс=" + getNameClass()+
                ", Имя=" + getName() +
                ", "+ '\u2694'+" = " + getAttack() +
                ", "+ '\u26E8'+" = " + getProtection() +
                ", "+ '\u2694'+" = " + Arrays.toString(getDamage()) +
                ", "+ '\u2764'+" = " + getHealth() + "/" + getMaxHealth() + " (" + getInfo() + "%)" +
                ", "+ "\uD83E\uDDB6"+" = " + getSpeed();

    }
}

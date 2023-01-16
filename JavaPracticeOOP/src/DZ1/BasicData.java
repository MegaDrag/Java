package DZ1;

import java.util.Arrays;

public class BasicData {
    private String name;
    private int attack;
    private int protection;
    private int[] damage;
    private int health;
    private  int speed;

    public BasicData(String name, int attack, int protection, int[] damage, int health, int speed) {
        this.name = name;
        this.attack = attack;
        this.protection = protection;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
    }

    public BasicData() {
    }

    @Override
    public String toString() {
        return "Имя=" + name +
                ", Атака=" + attack +
                ", Защита=" + protection +
                ", Урон=" + Arrays.toString(damage) +
                ", Здоровье=" + health +
                ", Скорость=" + speed ;
    }
}

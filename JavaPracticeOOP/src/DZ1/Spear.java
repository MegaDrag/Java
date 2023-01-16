package DZ1;

public class Spear extends BasicData {
    public Spear(String name, int attack, int protection, int[] damage, int health, int speed) {
        super(name, attack, protection, damage, health, speed);
    }

    public Spear(String name) {
        super(name,4,5,new int[] {1,3},10,4);
    }
    public Spear() {
    }
}

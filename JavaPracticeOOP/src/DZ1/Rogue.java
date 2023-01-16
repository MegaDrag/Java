package DZ1;

public class Rogue extends BasicData {
    public Rogue(String name, int attack, int protection, int[] damage, int health, int speed) {
        super(name, attack, protection, damage, health, speed);
    }

    public Rogue(String name) {
        super(name,8,3,new int[] {2,4},10,6);
    }
    public Rogue() {
    }
}

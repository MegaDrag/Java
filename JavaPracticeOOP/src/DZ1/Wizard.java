package DZ1;

public class Wizard extends BasicData {
    private int magic;

    public Wizard(String name, int attack, int protection, int[] damage, int health, int speed, int magic) {
        super(name, attack, protection, damage, health, speed);
        this.magic = magic;
    }

    public Wizard(String name) {
        super(name,17,12,new int[] {-5,0},30,9);
        this.magic = 1;
    }
    public Wizard() {
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Магия=" + magic;
    }
}

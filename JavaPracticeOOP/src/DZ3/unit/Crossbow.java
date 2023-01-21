package DZ3.unit;

public class Crossbow extends BasicData {
    private int shot;

    public Crossbow(String name, int attack, int protection, int[] damage, int health, int speed, int shot) {
        super(name, attack, protection, damage, health, speed);
        this.shot = shot;
    }

    public Crossbow(String name) {
        super(name,6, 3,new int[] {2,3},10,4);
        this.shot = 16;
    }
    public Crossbow() {
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", Стрелы=" + shot;
    }
}

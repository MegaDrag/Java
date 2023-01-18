package DZ2;

public class Sniper extends BasicData {
    private int shot;

    public Sniper(String name, int attack, int protection, int[] damage, int health, int speed, int shot) {
        super(name, attack, protection, damage, health, speed);
        this.shot = shot;
    }

    public Sniper(String name) {
        super(name,12,10,new int[] {8,10},15,9);
        this.shot = 32;
    }
    public Sniper(){

    }

    @Override
    public String toString() {
        return super.toString()+
                ", Выстрел=" + shot;
    }
}

package DZ3.unit;

public class Peasant extends BasicData {
    private int delivery;

    public Peasant(String name, int attack, int protection, int[] damage, int health, int speed, int delivery) {
        super(name, attack, protection, damage, health, speed);
        this.delivery = delivery;
    }

    public Peasant(String name) {
        super(name, 1, 1, new int[]{1, 0}, 1, 3);
        this.delivery = 1;
    }

    public Peasant() {
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Доставка=" + delivery;
    }
}

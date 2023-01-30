package DZ5.unit;

import java.util.ArrayList;

public class Peasant extends BasicData {
    private int delivery;

    public Peasant(String name, ArrayList<BasicData> array, int x, int y) {
        super(name, array, x, y, 1, 1, new int[]{1, 0}, 1, 3);
        this.delivery = 1;

    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return super.toString(); /*+
               ", Доставка=" + delivery;*/


    }
}

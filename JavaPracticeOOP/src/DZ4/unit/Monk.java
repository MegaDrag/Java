package DZ4.unit;

import java.util.ArrayList;

public class Monk extends BasicData {
    private int magic;

    public Monk(String name, ArrayList<BasicData> array, int x, int y) {
        super(name, array, x, y, 12, 7, new int[]{-4, 0}, 30, 5);
        this.magic = 1;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Магия=" + magic;
    }
}

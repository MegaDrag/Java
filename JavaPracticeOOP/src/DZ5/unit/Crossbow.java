package DZ5.unit;

import java.util.ArrayList;

public class Crossbow extends BasicData {
    private int shot;

    public Crossbow(String name, ArrayList<BasicData> array, int x, int y) {
        super(name, array, x, y,6, 3,new int[] {2,3},10,4);
        this.shot = 16;
    }


    @Override
    public String toString() {
        return  super.toString()+
                ", "+ '\u27B9'+" = " + shot;
    }
}

package DZ4.unit;

import java.util.ArrayList;

public class Wizard extends BasicData {
    private int magic;


    public Wizard(String name, ArrayList<BasicData> array, int x, int y) {
        super(name, array, x, y, 17, 12, new int[]{-5, 0}, 30, 9);
        this.magic = 1;
    }


    @Override
    public void step(ArrayList<BasicData> list) {
        int min = Integer.parseInt(list.get(0).getInfo());
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (Integer.parseInt(list.get(i).getInfo()) < min) {
                min = Integer.parseInt(list.get(i).getInfo());
                index = i;
            }
        }
        if (min==100) {
            System.out.println("Колдун " + this.getName() + " никого не вылечил, все здоровы");
        }
        else if (list.get(index).getMaxHealth()-list.get(index).getHealth()>=5) {
            list.get(index).setHealth(list.get(index).getHealth() + getDamage()[0] * -1);
            System.out.println("Колдун " + this.getName() + " подлечил бойца " + list.get(index));
        }
        else {list.get(index).setHealth(list.get(index).getMaxHealth());
            System.out.println("Колдун " + this.getName() + " подлечил бойца " + list.get(index));
        }
    }

    @Override
    public String toString() {
        return super.toString(); /*+
                ", Магия=" + magic;*/
    }
}

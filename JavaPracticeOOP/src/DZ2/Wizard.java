package DZ2;

import java.util.ArrayList;

public class Wizard extends BasicData  {
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
    public void heal(ArrayList<BasicData> list) {
        int min = Integer.parseInt(list.get(0).getInfo());
        int index = 0;
        int indexWizard = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) instanceof Wizard){
                indexWizard = i;
            }
            if (Integer.parseInt(list.get(i).getInfo())<min) {
                min = Integer.parseInt(list.get(i).getInfo());
                index = i;
            }
        }
        System.out.println();
        list.get(index).setHealth(list.get(index).getHealth()+list.get(indexWizard).getDamage()[0]*-1);
        System.out.println("Подлечили бойца "+list.get(index));
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Магия=" + magic;
    }
}

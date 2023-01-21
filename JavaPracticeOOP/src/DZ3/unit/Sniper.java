package DZ3.unit;

import java.util.ArrayList;

public class Sniper extends BasicData {
    private int shot;

    public Sniper(String name, int attack, int protection, int[] damage, int health, int speed, int shot) {
        super(name, attack, protection, damage, health, speed);
        this.shot = shot;
    }

    public Sniper(String name) {
        super(name, 12, 10, new int[]{8, 10}, 15, 9);
        this.shot = 32;
    }

    public Sniper() {

    }

    @Override
    public void step(ArrayList<BasicData> list) {
     if (shot>0) {
         shot--;
         System.out.println("Снайпер "+this.getName()+ " совершил выстрел. "+"Оставшиеся стрелы="+shot);
         for (int i = 0; i < list.size(); i++) {
             if (list.get(i) instanceof  Peasant && ((Peasant) list.get(i)).getDelivery()==1) {
                 shot++;
                 ((Peasant) list.get(i)).setDelivery(0);
                 System.out.println("Крестьянин "+list.get(i).getName()+" пополнил запасы стрел снайпера "+this.getName());
                 System.out.println(this.toString());
                 break;

             }
         }
         System.out.println("=========");
     }

         else System.out.println("У снайпера "+this.getName()+" кончились стрелы кончились");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Стрелы=" + shot;
    }
}

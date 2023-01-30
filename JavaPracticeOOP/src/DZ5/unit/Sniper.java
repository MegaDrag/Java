package DZ5.unit;

import DZ5.Main;

import java.util.ArrayList;

public class Sniper extends BasicData {
    private int shot;
    static int enemy = Main.GANG_SIZE;

    public Sniper(String name, ArrayList<BasicData> array, int x, int y) {
        super(name, array, x, y, 12, 10, new int[]{8, 10}, 15, 9);
        this.shot = 32;
    }


    @Override
    public void step(ArrayList<BasicData> list) {
        double minDistance = Double.MAX_VALUE;
        int indexUnit = 0;
        for (int i = 0; i < list.size(); i++) {
            double temp = this.getPosition().getDistance(this,list.get(i));
            if (minDistance>temp && list.get(i).getHealth()>0) {
                minDistance = temp;
                indexUnit = i;
            }
        }
        if (shot>0) {
            if (enemy>0) {
                shot--;
                if (minDistance>2.5) {
                    System.out.println("Снайпер "+this.getName()+ " совершил выстрел по "+ list.get(indexUnit).getName()+" и нанес урон "+this.getDamage()[0]+ ". Оставшиеся стрелы="+shot);
                    if (list.get(indexUnit).getHealth()-this.getDamage()[0]<=0) {
                        list.get(indexUnit).setHealth(0);
                        enemy--;
                    }
                    else {
                        list.get(indexUnit).setHealth(list.get(indexUnit).getHealth()-this.getDamage()[0]);
                    }
                }
                else {
                    System.out.println("Снайпер "+this.getName()+ " совершил выстрел по "+ list.get(indexUnit).getName()+" и нанес урон "+this.getDamage()[1]+ ". Оставшиеся стрелы="+shot);
                    if (list.get(indexUnit).getHealth()-this.getDamage()[1]<=0) {
                        list.get(indexUnit).setHealth(0);
                        enemy--;
                    }
                    else {
                        list.get(indexUnit).setHealth(list.get(indexUnit).getHealth()-this.getDamage()[1]);
                    }
                }

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) instanceof  Peasant && ((Peasant) list.get(i)).getDelivery()==1) {
                        shot++;
                        ((Peasant) list.get(i)).setDelivery(0);
                        System.out.println("Крестьянин "+list.get(i).getName()+" пополнил запасы стрел снайпера "+this.getName());
                        break;
                    }
                }
            } else {
                System.out.println("Снайпер "+this.getName()+" прекратил стрельбу. Все враги убиты");
            }

        }

         else System.out.println("У снайпера "+this.getName()+" кончились стрелы кончились");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", "+ '\u27B9'+" = " + shot;
    }
}

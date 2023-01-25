package DZ4;


import DZ4.unit.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static String[] namePerson = new String[]{"Алексей", "Александр", "Владимир", "Михаил", "Сергей", "Павел", "Игорь", "Ашот", "Георгий", "Роман"};
    public static final int GANG_SIZE = 5;
    public static ArrayList<BasicData> whiteSide;
    public static ArrayList<BasicData> darkSide;

    public static void main(String[] args) {
        init();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (line.isEmpty()){
            ConsoleView.view();
            whiteSide.forEach(n -> n.step(whiteSide));
            darkSide.forEach(n -> n.step(darkSide));
            updatePeasantDelivery(whiteSide);
            updatePeasantDelivery(darkSide);
            line=scanner.nextLine();
            System.out.println("Press Enter");
        }

    }

        public static String getRandomName() {
        int number = (int) (Math.random() * namePerson.length);
        return namePerson[number];
    }

    public static int getRandomNumber() {
        int number = (int) (Math.random() * 7) + 1;
        return number;
    }

    public static void updatePeasantDelivery(ArrayList<BasicData> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Peasant){
                ((Peasant) list.get(i)).setDelivery(1);
            }
        }
    }

    private static void init(){
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();

        int x = 1;
        int y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0: whiteSide.add(new Peasant(getRandomName(),whiteSide, x, y++)); break;
                case 1: whiteSide.add(new Rogue(getRandomName(),whiteSide, x, y++)); break;
                case 2: whiteSide.add(new Sniper(getRandomName(),whiteSide, x, y++)); break;
                default: whiteSide.add(new Monk(getRandomName(),whiteSide, x, y++)); break;
            }

            }

        x = GANG_SIZE;
        y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {

            switch (new Random().nextInt(4)) {
                case 0: darkSide.add(new Peasant(getRandomName(),darkSide, x, y++)); break;
                case 1: darkSide.add(new Spear(getRandomName(),darkSide, x, y++)); break;
                case 2: darkSide.add(new Crossbow(getRandomName(),darkSide, x, y++)); break;
                default: darkSide.add(new Wizard(getRandomName(),darkSide, x, y++)); break;

            }
        }
        }
    }





package DZ3;


import DZ3.unit.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static String[] namePerson = new String[]{"Алексей", "Александр", "Владимир", "Дмитрий", "Михаил", "Андрей", "Евгений", "Ашот", "Антон", "Виктор"};

    public static void main(String[] args) {
        ArrayList<BasicData> team1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            createPerson(team1);
        }
        getListPersons(team1);
        System.out.println("===============");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (line.isEmpty()) {
            for (int i = 0; i < team1.size(); i++) {
                team1.get(i).step(team1);
            }
            updatePeasantDelivery(team1);
            line=scanner.nextLine();
        }

    }

    /**
     * Создание персонажа каждого типа
     */
    public static void createPersonAll(ArrayList<BasicData> list) {
        list.add(new Peasant(getRandomName()));
        list.add(new Rogue(getRandomName()));
        list.add(new Sniper(getRandomName()));
        list.add(new Wizard(getRandomName()));
        list.add(new Spear(getRandomName()));
        list.add(new Crossbow(getRandomName()));
        list.add(new Monk(getRandomName()));

    }

    /**
     * Создание персонажа со случайным типом
     */
    public static void createPerson(ArrayList<BasicData> list) {
        int number = getRandomNumber();
        switch (number) {
            case (1):
                list.add(new Peasant(getRandomName()));
                break;
            case (2):
                list.add(new Rogue(getRandomName()));
                break;
            case (3):
                list.add(new Sniper(getRandomName()));
                break;
            case (4):
                list.add(new Wizard(getRandomName()));
                break;
            case (5):
                list.add(new Spear(getRandomName()));
                break;
            case (6):
                list.add(new Crossbow(getRandomName()));
                break;
            case (7):
                list.add(new Monk(getRandomName()));
                break;
        }

    }

    /**
     * Генерация случайного имени из списка namePerson
     *
     * @return
     */
    public static String getRandomName() {
        int number = (int) (Math.random() * namePerson.length);
        return namePerson[number];
    }

    public static int getRandomNumber() {
        int number = (int) (Math.random() * 7) + 1;
        return number;
    }

    public static String getObjectType(Object o) {
        if (o instanceof Peasant)
            return "Крестьянин";
        if (o instanceof Rogue)
            return "Разбойник";
        if (o instanceof Sniper)
            return "Снайпер";
        if (o instanceof Wizard)
            return "Колдун";
        if (o instanceof Spear)
            return "Копейщик";
        if (o instanceof Crossbow)
            return "Арбалетчик";
        if (o instanceof Monk)
            return "Монах";
        else return "Неизвестный";
    }

    /**
     * Вывод всех персонажей
     *
     * @param list
     */
    public static void getListPersons(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
           System.out.println("Класс=" + getObjectType(list.get(i)) + ", " + list.get(i));
        }


    }

    /**
     * Вывод персонажей определенного типа
     *
     * @param list
     */
    public static void getListPersonsObjectType(ArrayList list, Object o) {
        for (int i = 0; i < list.size(); i++) {
            if (o.getClass().getSimpleName() == (list.get(i)).getClass().getSimpleName()) {
                System.out.println("Класс=" + getObjectType(list.get(i)) + ", " + list.get(i));
            }

        }

    }
    public static void updatePeasantDelivery(ArrayList<BasicData> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Peasant){
                ((Peasant) list.get(i)).setDelivery(1);
            }
        }
    }

}



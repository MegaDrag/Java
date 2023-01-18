package DZ2;


import java.util.ArrayList;
import java.util.Arrays;

/**
 Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo();
 Реализовать имнтерфейс в абстрактном классе.
 Создать два списка в классе main. В каждый из списков добавить по десять экземнляров наследников BaseHero.
Реализовать метод step() для магов таким образом, чтобы они могли лечить самого повреждённого из своих однополчан!) Удалить ненужные методы из абстрактного класса, если такие есть.
 */
public class Main {
    static String[] namePerson = new String[]{"Алексей", "Александр", "Владимир", "Дмитрий", "Михаил", "Андрей", "Евгений", "Ашот", "Антон", "Виктор"};
    //static ArrayList<BasicData> persons = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<BasicData> team1 = new ArrayList<>();
        ArrayList<BasicData> team2 = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            createPersonAll(team1);
            createPersonAll(team2);
        }
        getListPersons(team1);
        for (int i = 0; i < team1.size(); i++) {
            team1.get(i).heal(team1);
        }
        System.out.println("=============");
        getListPersons(team2);
        for (int i = 0; i < team2.size(); i++) {
            team2.get(i).heal(team2);
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

}



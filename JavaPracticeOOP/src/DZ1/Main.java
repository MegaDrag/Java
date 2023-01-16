package DZ1;


import java.util.ArrayList;

/**
 * Разработать иерархию классов персонажей описанных в таблице. Провести анализ(абстракция) полей необходимых данных и перенести обьщие в базовый класс.
 * Так же в базовом классе переопределить метод toString для вывода подробной информации о персонаже.
 * Описать удобный конструктор базового класса и классов наследников так, чтобы необходимые параметры передавались вызовом пустого конструктора класса наследника.
 * В основном классе создать список и заполнить его экземплярами каждого нового класса.
 * Вывести в консоль содержание списка переопределённым иетодом toString().
 * *Создать список из 50 персонажей выбранных случайным числом и статический метод выбирающий из списка только элементы конкретного, переданного в параметре класса и выводящий их описание в консоль!
 */
public class Main {
    static String[] namePerson = new String[]{"Алексей", "Александр", "Владимир", "Дмитрий", "Михаил", "Андрей", "Евгений", "Ашот", "Антон", "Виктор"};
    static ArrayList<BasicData> persons = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            createPersonAll();
        }
        /*for (int i = 0; i < 10; i++) {
            createPerson();
        }*/
        getListPersons(persons);
        System.out.println("==========");
        getListPersonsObjectType(persons,new Wizard());




    }

    /**
     * Создание персонажа каждого типа
     */
    public static void createPersonAll() {
        persons.add(new Peasant(getRandomName()));
        persons.add(new Rogue(getRandomName()));
        persons.add(new Sniper(getRandomName()));
        persons.add(new Wizard(getRandomName()));
        persons.add(new Spear(getRandomName()));
        persons.add(new Crossbow(getRandomName()));
        persons.add(new Monk(getRandomName()));

    }

    /**
     * Создание персонажа со случайным типом
     */
    public static void createPerson() {
        int number = getRandomNumber();
        switch (number) {
            case (1):
                persons.add(new Peasant(getRandomName()));
                break;
            case (2):
                persons.add(new Rogue(getRandomName()));
                break;
            case (3):
                persons.add(new Sniper(getRandomName()));
                break;
            case (4):
                persons.add(new Wizard(getRandomName()));
                break;
            case (5):
                persons.add(new Spear(getRandomName()));
                break;
            case (6):
                persons.add(new Crossbow(getRandomName()));
                break;
            case (7):
                persons.add(new Monk(getRandomName()));
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
            if (o.getClass().getSimpleName() ==(list.get(i)).getClass().getSimpleName()) {
                System.out.println("Класс=" + getObjectType(list.get(i)) + ", " + list.get(i));
            }

        }
    }
}



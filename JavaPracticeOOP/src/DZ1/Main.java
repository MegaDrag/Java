package DZ1;


import java.util.ArrayList;

/**
 * ����������� �������� ������� ���������� ��������� � �������. �������� ������(����������) ����� ����������� ������ � ��������� ������ � ������� �����.
 * ��� �� � ������� ������ �������������� ����� toString ��� ������ ��������� ���������� � ���������.
 * ������� ������� ����������� �������� ������ � ������� ����������� ���, ����� ����������� ��������� ������������ ������� ������� ������������ ������ ����������.
 * � �������� ������ ������� ������ � ��������� ��� ������������ ������� ������ ������.
 * ������� � ������� ���������� ������ ��������������� ������� toString().
 * *������� ������ �� 50 ���������� ��������� ��������� ������ � ����������� ����� ���������� �� ������ ������ �������� �����������, ����������� � ��������� ������ � ��������� �� �������� � �������!
 */
public class Main {
    static String[] namePerson = new String[]{"�������", "���������", "��������", "�������", "������", "������", "�������", "����", "�����", "������"};
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
     * �������� ��������� ������� ����
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
     * �������� ��������� �� ��������� �����
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
     * ��������� ���������� ����� �� ������ namePerson
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
            return "����������";
        if (o instanceof Rogue)
            return "���������";
        if (o instanceof Sniper)
            return "�������";
        if (o instanceof Wizard)
            return "������";
        if (o instanceof Spear)
            return "��������";
        if (o instanceof Crossbow)
            return "����������";
        if (o instanceof Monk)
            return "�����";
        else return "�����������";
    }

    /**
     * ����� ���� ����������
     * @param list
     */
    public static void getListPersons(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("�����=" + getObjectType(list.get(i)) + ", " + list.get(i));
        }


    }

    /**
     * ����� ���������� ������������� ����
     *
     * @param list
     */
    public static void getListPersonsObjectType(ArrayList list, Object o) {
        for (int i = 0; i < list.size(); i++) {
            if (o.getClass().getSimpleName() ==(list.get(i)).getClass().getSimpleName()) {
                System.out.println("�����=" + getObjectType(list.get(i)) + ", " + list.get(i));
            }

        }
    }
}



package DZ5;

import java.util.*;

/**
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 * */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        people.add("Светлана Петрова");
        people.add("Кристина Белова");
        people.add("Анна Мусина");
        people.add("Анна Крутова");
        people.add("Иван Юрин");
        people.add("Петр Лыков");
        people.add("Павел Чернов");
        people.add("Петр Чернышов");
        people.add("Мария Федорова");
        people.add("Марина Светлова");
        people.add("Мария Савина");
        people.add("Мария Рыкова");
        people.add("Марина Лугова");
        people.add("Анна Владимирова");
        people.add("Иван Мечников");
        people.add("Петр Петин");
        people.add("Иван Ежов");
        for (int i = 0; i < people.size(); i++) {
            String name = people.get(i).substring(0, people.get(i).indexOf(" ")); /**Вычисляем имя*/
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }
        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);


    }
}

package DZ5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        System.out.println("Введите данные в формате: имя номер");
        System.out.println("Выход через exit");
        while(true){
            String name = sc.next();
            if (name.equals("exit")){
                break;
            }
            String telephone = sc.next();
        ArrayList<String> list = map.get(name);

        if (list == null) {
            list = new ArrayList<>();
            map.put(name, list);
        }
            list.add(telephone);
        }
            /**Вывод HashMap*/
        for (Map.Entry map1: map.entrySet()
             ) {
            System.out.println(map1);
        }



    }
}
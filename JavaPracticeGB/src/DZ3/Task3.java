package DZ3;

import java.util.ArrayList;


/**
 * «адан целочисленный список ArrayList. Ќайти минимальное, максимальное и среднее из этого списка.
 */
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random()*10));
        }
        for (int in: list
        ) {
            System.out.print(in+" ");
        }
        System.out.println();
        int min = list.get(0);
        int max = list.get(0);
        int middle = list.get(0);
        for (int i = 1; i < list.size(); i++) {

            min = Math.min(min, list.get(i));
            max = Math.max(max, list.get(i));
            middle = middle+ list.get(i);
        }
        System.out.println("min= "+min);
        System.out.println("max= "+max);
        System.out.println("middle= "+ middle / list.size());
    }
}

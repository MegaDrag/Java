package DZ3;

import java.util.ArrayList;
import java.util.Iterator;

/**Пусть дан произвольный список целых чисел, удалить из него четные числа
 *
 */
public class Task2 {
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
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if ((int) (iterator.next()) % 2 ==0)
                iterator.remove();
        }
        for (int in2: list
        ) {
            System.out.print(in2+" ");
        }
    }
}

package DZ4;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    Queue<Integer> list = new LinkedList<>();

    /** помещает элемент в конец очереди*/
    public void enqueue(int number) {
        list.add(number);
    }

    /** возвращает первый элемент из очереди и удаляет его*/
    public int dequeue() {
        return list.remove();
    }

    /**возвращает первый элемент из очереди, не удаляя*/
    public int first() {
        return list.peek();
    }

    /**Вывод текущей очереди*/
    public Queue getAllQueue(){
        return list;
    }


}

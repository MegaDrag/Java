package DZ4;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    Queue<Integer> list = new LinkedList<>();

    /** �������� ������� � ����� �������*/
    public void enqueue(int number) {
        list.add(number);
    }

    /** ���������� ������ ������� �� ������� � ������� ���*/
    public int dequeue() {
        return list.remove();
    }

    /**���������� ������ ������� �� �������, �� ������*/
    public int first() {
        return list.peek();
    }

    /**����� ������� �������*/
    public Queue getAllQueue(){
        return list;
    }


}

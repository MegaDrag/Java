package DZ4;


/**
 * ���������� ������� � ������� LinkedList �� ���������� ��������:
 * enqueue() - �������� ������� � ����� �������, dequeue() - ���������� ������ ������� �� ������� � ������� ���,
 * first() - ���������� ������ ������� �� �������, �� ������.
 */
public class Task2 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        System.out.println("������� ������� "+myQueue.getAllQueue());
        System.out.println("�������� ������� �������� ������� "+myQueue.dequeue());
        System.out.println("������� ������� "+myQueue.getAllQueue());
        System.out.println("������ ������� ������� "+myQueue.first());
        System.out.println("������� ������� "+myQueue.getAllQueue());

    }
}

package DZ4;


/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Task2 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        System.out.println("Текущая очередь "+myQueue.getAllQueue());
        System.out.println("Удаление первого элемента очереди "+myQueue.dequeue());
        System.out.println("Текущая очередь "+myQueue.getAllQueue());
        System.out.println("Первый элемент очереди "+myQueue.first());
        System.out.println("Текущая очередь "+myQueue.getAllQueue());

    }
}

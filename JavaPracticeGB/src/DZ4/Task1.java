package DZ4;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * ����� ��� LinkedList � ����������� ����������. ���������� �����, ������� ������ ������������� ������
 */
public class Task1 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        System.out.print("����������� ������ - ");
        for (Object o: list
             ) {
            System.out.print(o+" ");
        }
        System.out.println();
        System.out.print("������������ ������ - ");
        reverseList(list);

    }
    public static void reverseList(LinkedList<Object> list){
        Iterator<Object> iterator = list.descendingIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}

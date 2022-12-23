package DZ5;

import java.util.Arrays;

/**Реализовать алгоритм пирамидальной сортировки (HeapSort). (Можно использовать массивы)
 *
 */
public class Task3 {
    public static void main(String[] args) {
       int [] array = new int[] {1,12,9,5,6,10}; //12 6 10 5 1 9
        System.out.print("Начальный массив ");
        System.out.println(Arrays.toString(array));
        int length = array.length;
        for (int elem = length/2-1; elem >=0 ; elem--) {

            heap (array,elem,length);
        }

        for (int i = length-1; i >=0 ; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            heap(array,0,i);

        }
        System.out.print("Отсортированный массив ");
        System.out.println(Arrays.toString(array));

    }
    private static void heap(int[] array, int elem, int length) {
        int left = elem * 2 + 1;
        int right = elem * 2 + 2;
        int largest = elem;
        if (left < length && array[left]>array[largest])
            largest = left;
        if (right < length && array[right]>array[largest])
            largest = right;
        if (largest!=elem){
            int tmp = array[elem];
            array[elem] = array[largest];
            array[largest] =  tmp;
            heap(array,largest,length);
        }
    }
}

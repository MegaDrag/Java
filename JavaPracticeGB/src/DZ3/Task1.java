package DZ3;

import java.util.Arrays;

/**
 * Реализовать алгоритм сортировки слиянием
 */
public class Task1 {
    public static void main(String args[]) {
        int[] sortArr = {99, 5, 10, 3, 45, 97};
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] mergeSort(int[] sortArr) {
        int[] temp1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] temp2 = new int[sortArr.length];
        int[] result = mergeSortInner(temp1, temp2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] temp1, int[] temp2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return temp1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(temp1, temp2, startIndex, middle);
        int[] sorted2 = mergeSortInner(temp1, temp2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == temp1 ? temp2 : temp1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

}
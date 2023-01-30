package sorting_searching;

import java.util.Arrays;

public class MedianTwoSortedArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {100, 200, 300, 400};
        System.out.println(getMedian(array1, array2));
    }

    static double getMedian(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        Arrays.sort(mergedArray);

        double median = 0;
        if (mergedArray.length % 2 == 0) {
            int med1 = mergedArray[(mergedArray.length / 2) - 1];
            int med2 = mergedArray[(mergedArray.length / 2)];
            median = (med1 + med2) / 2.0;
        } else {
            median = mergedArray[(mergedArray.length / 2)];
        }

        return median;
    }
}

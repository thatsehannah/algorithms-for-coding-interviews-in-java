package sorting_searching;

import java.util.Arrays;

public class Helper {
    static int findMin(int[] arr, int start, int end) {
        if (end <= 0 || start < 0) {
            return 0;
        }

        int minIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    static int findMax(int[] arr, int start, int end) {
        if (end <= 0 || start < 0) {
            return 0;
        }

        int maxIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    static void printArray(int[] arr) {
        System.out.println("arr = " + Arrays.toString(arr));
    }

    static void swapElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

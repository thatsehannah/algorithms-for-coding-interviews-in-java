package sorting_searching;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 0, 5, 95, 4, -100, 200, 0};
        quickSort(arr, 0, arr.length - 1);
        Helper.printArray(arr);
    }

    static int choosePivot(int left, int right) {
        Random ran = new Random();

        // Pick 3 random numbers within the range of the array
        int i1 = left + (ran.nextInt(right - left + 1));
        int i2 = left + (ran.nextInt(right - left + 1));
        int i3 = left + (ran.nextInt(right - left + 1));

        // Return their median
        return Math.max(Math.min(i1,i2), Math.min(Math.max(i1,i2), i3));
    }

    static int partition(int[] arr, int left, int right) {
        int pivotInd = choosePivot(left, right);
        Helper.swapElements(arr, right, pivotInd);
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j <= right - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                Helper.swapElements(arr, i, j);
            }
        }
        Helper.swapElements(arr, i+1, right);
        return i + 1;
    }

    static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);

            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }
}

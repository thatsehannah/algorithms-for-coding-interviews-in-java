package sorting_searching;

public class BubbleSort {

    // This algorithm works by comparing adjacent pairs of elements
    // and swapping them if they are in the wrong order (depending on if sorting needs to be
    // in ascending or descending order). THis is repeated n times (i.e. the length of the array)
    // until the array is sorted.

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 0, 5, 95, 4, -100, 200, 0};
        bubbleSort(arr);
        Helper.printArray(arr);
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

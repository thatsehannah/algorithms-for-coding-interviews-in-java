package sorting_searching;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 0, 5, 95, 4, -100, 200, 0};
        insertionSort(arr);
    }

    static void insertionSort(int[] arr) {
        int pointer, element;
        for (int i = 1; i < arr.length; i++) {
            element = arr[i];
            pointer = i - 1;

            // shifts elements back to create space for the element to be inserted
            while (pointer >= 0 && arr[pointer] > element) {
                arr[pointer + 1] = arr[pointer];
                pointer--;
            }
            arr[pointer + 1] = element;
        }
    }
}

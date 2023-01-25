package sorting_searching;


public class SelectionSort {

    // This algorithm divides the input array into two parts: the sublist of already-sorted
    // elements, which is built up from left to right, and the sublist of the remaining elements
    // that occupy the rest of the list and need to be sorted.

    // Initially, the sorted sublist is empty and the unsorted sublist is the entire input list.
    // The algorithm process by finding the smallest (or largest) element in the unsorted sublist,
    // swapping it with the leftmost unsorted element (putting it in sorted order), and moving the
    // sublist boundaries one element to the right until the boundaries reaches the end of the array.

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 0, 5, 95, 4, -100, 200, 0};
        selectionSort(arr);
        Helper.printArray(arr);
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = Helper.findMin(arr, i, arr.length - 1);

            //Swap the found minimum element with the leftmost unsorted element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

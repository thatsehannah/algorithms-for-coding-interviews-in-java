package sorting_searching;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 0, 5, 95, 4, -100, 200, 0};
        mergeSort(arr, 0, arr.length - 1);
        Helper.printArray(arr);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        // Initializing the sizes of the temporary arrays
        int sizeLeft = mid - left + 1;
        int sizeRight = right - mid;

        // Initializing temporary arrays
        int leftArr[] = new int[sizeLeft];
        int rightArr[] = new int[sizeRight];

        //Copying the given array into the temporary arrays
        for (int i = 0; i < sizeLeft; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int j = 0; j < sizeRight; j++) {
            rightArr[j] = arr[mid + j + 1];
        }

        int i = 0; // Initial index of leftArr
        int j = 0; // Initial index of rightArr
        int k = left; // Initial index of the given array

        // This is the main part of the algorithm
        // Iterate over both arrays and copy the element that is smaller to
        // the given array
        while (i < sizeLeft && j < sizeRight) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copying the remaining elements of leftArr, if there are any
        while (i < sizeLeft) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < sizeRight) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

    }

    static void mergeSort(int[] arr, int leftIndex, int rightIndex) {
        // Sanity checks
        if (leftIndex < 0 || rightIndex < 0) {
            return;
        }

        //Base case
        if (rightIndex > leftIndex) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;

            // Sorting the first and second halves of the array
            mergeSort(arr, leftIndex, mid);
            mergeSort(arr, mid + 1, rightIndex);

            // Merging the array
            merge(arr, leftIndex, mid, rightIndex);
        }
    }
}

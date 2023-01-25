package sorting_searching;

public class BinarySearch {

    // Assuming that the input is sorted, compare the target element with the element
    // at the middle of the array. If the target element is greater than the element
    // at the middle of the array, recursively check for the target in the second half
    // of the given array. Otherwise, search for the target in the first half of the given
    // array.

    public static void main(String[] args) {
        int arr[] = {-100,0,0,1,4,4,5,5,95,200};
        int target = 1;
        System.out.println("Index of " + target + ": " + binarySearch(target, arr));
    }

    static int binarySearch(int target, int arr[]) {

        // Corner case if the array is empty
        if (arr.length == 0) {
            return -1;
        }

        // Corner case if there is only element in the given array
        if (arr.length == 1) {
            if (arr[0] == target) {
                return 0;
            }

            return -1;
        }

        int startIndex = 0; // Initial value for start index
        int endIndex = arr.length - 1; // Initial value for end index
        int midIndex;

        while (startIndex <= endIndex) {
            midIndex = (startIndex + endIndex) / 2;
            if (arr[midIndex] > target) { // If the element at the middle is greater than the target, then the target is in the initial half of the array
                endIndex = midIndex - 1;
            } else if (arr[midIndex] < target) { // If the element at the middle is less than the target, then the target is in the latter half of the array
                startIndex = midIndex + 1;
            } else { // The element at the middle index is equal to the target
                return midIndex;
            }
        }

        return -1;
    }
}

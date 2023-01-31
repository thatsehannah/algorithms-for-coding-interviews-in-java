package sorting_searching;

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 5, 6};
        System.out.println(insertPosition(arr, 4));
    }

    static int insertPosition(int[] arr, int target) {
        int startIndex = 0, endIndex = arr.length - 1, midIndex = 0, currentPos = 0;

        while (startIndex <= endIndex) {
            midIndex = startIndex + (endIndex - startIndex) / 2;
            if (arr[midIndex] == target) {
                return midIndex;
            }

            if (arr[midIndex] > target) { // if the value at midIndex is greater than the target, the target must be to the left of that value at midIndex
                endIndex = midIndex - 1; // change the endIndex to the midpoint of the array. startIndex will still be at 0
                currentPos = midIndex;
            } else { // if the value at midIndex is less than the target, the target must be to the right of that value at midIndex
                startIndex = midIndex + 1; // change the startIndex to the midpoint of the array. endIndex will still be at the end of the array
                currentPos = midIndex + 1;
            }
        }

        return currentPos;
    }
}

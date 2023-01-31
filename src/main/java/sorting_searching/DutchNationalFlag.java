package sorting_searching;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = {2, 0, 0, 1, 2, 1};
        dutchNationalFlag(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void dutchNationalFlag(int[] arr) {
        int leftIndex = 0, rightIndex = arr.length - 1, currentPos = 0;

        while (currentPos <= rightIndex) {
            if (arr[currentPos] == 0) {
                Helper.swapElements(arr, leftIndex, currentPos); // swap 0 (currentPos) with the element at the beginning
                leftIndex++;
                currentPos++;
            } else if (arr[currentPos] == 2) {
                Helper.swapElements(arr, rightIndex, currentPos); // swap 2 (currentPos) with the element at the end
                rightIndex--;
            } else if (arr[currentPos] == 1) {
                currentPos++; // swapping the 0s and 2s will ultimately push the 1s to the center
            }
        }
    }
}

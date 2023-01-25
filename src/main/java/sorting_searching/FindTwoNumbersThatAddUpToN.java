package sorting_searching;

import java.util.Arrays;
import java.util.HashSet;

public class FindTwoNumbersThatAddUpToN {
    static int[] findSum(int[] arr, int sum) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            int target = sum - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == target) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                    break;
                }
            }
        }

        return result;
    }

    static int[] findSumUsingBinarySearch(int[] arr, int sum) {
        int[] result = new int[2];

        return result;
    }

    static int[] findSumUsingHashing(int[] arr, int sum) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                result[0] = arr[i];
                result[1] = sum - arr[i];
                break;
            } else {
                set.add(sum - arr[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,21,3,14,5,60,7,6};
        int targetSum = 81;
        int[] result = findSumUsingHashing(arr, targetSum);
        System.out.println(Arrays.toString(result));
    }
}

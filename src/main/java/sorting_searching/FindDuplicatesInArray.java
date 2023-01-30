package sorting_searching;

import java.util.*;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {7, 5, 4, 3, 11, 5, 11, 9, 3, 11};
        System.out.println(findDuplicates(arr));

        int[] arr2 = {6, 5, 7};
        System.out.println(findDuplicates(arr2));

        int[] arr3 = {};
        System.out.println(findDuplicates(arr3));
    }


    // Using hashing
    static ArrayList<Integer> findDuplicates(int[] array) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        HashSet<Integer> dupSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (dupSet.contains(array[i])) {
                if (!duplicates.contains(array[i])) {
                    duplicates.add(array[i]);
                }
            } else {
                dupSet.add(array[i]);
            }
        }

        return duplicates;
    }
}

package sorting_searching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 3, 5, 4, 100, 100};
        System.out.println(findDuplicates(arr));

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

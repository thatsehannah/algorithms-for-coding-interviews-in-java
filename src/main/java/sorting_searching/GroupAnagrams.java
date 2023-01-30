package sorting_searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"cat", "dog", "tac", "god", "act", "tom marvolo riddle ", "abc", "def", "cab", "fed", "clint eastwood ", "i am lord voldemort", "elvis", "old west action", "lives"};
        System.out.println(groupAnagrams(arr));
    }

    static String groupAnagrams(String arr[]) {
        HashMap<String, ArrayList<String>> wordMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i]; // get the word at ith index
            char[] letters = word.toCharArray(); // convert the word into a char array
            Arrays.sort(letters); // sort the letters in the char array
            String sortedString = new String(letters); // convert the sorted char array into a new String

            if (wordMap.containsKey(sortedString)) {
                wordMap.get(sortedString).add(word); // if the sortedString exists in the map, add the word at the ith index to its ArrayList value
            } else {
                ArrayList<String> totalWords = new ArrayList<>(); // if the sortedString doesn't exist, create a new ArrayList
                totalWords.add(word); // add the word at the ith index to the newly created ArrayList
                wordMap.put(sortedString, totalWords); // add the sortedString as the key and the arrayList as its value to the map
            }
        }

        StringBuilder anagrams = new StringBuilder();
        for (String s : wordMap.keySet()) {
            ArrayList<String> values = wordMap.get(s);
            if (values.size() > 1) {
                anagrams.append(values);
            }
        }

        return anagrams.toString();
    }
}

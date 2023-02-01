package dynamic_programming;

// Given two strings, s1 and s2, write a function that finds and
// returns the length of the longest substring of s2 and s1 (if any
// exist)

import java.util.Arrays;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        System.out.println(lCSLength("www.educative.io/explore", "educative.io/edpresso"));
    }

    static int lCSLength(String s1, String s2) {
        int[][] lookupArray = new int[s1.length() + 1][]; // lookupArray to store the already computed subproblems' solutions

        for (int i = 0; i <= s1.length(); i++) {
            lookupArray[i] = new int[s2.length() + 1];
        }

        int maxLength = 0;
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                char s1Char = s1.charAt(i - 1);
                char s2Char = s2.charAt(j - 1);
                if (s1Char == s2Char) {
                    lookupArray[i][j] = 1 + lookupArray[i - 1][j - 1];
                    maxLength = Math.max(maxLength, lookupArray[i][j]);
                }
            }
        }

        return maxLength;
    }
}

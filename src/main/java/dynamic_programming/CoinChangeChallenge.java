package dynamic_programming;

// Given an infinite number of quarters, dimes, nickels, and pennies, write code
// to calculate the number of ways to represent n cents

public class CoinChangeChallenge {
    public static void main(String[] args) {
        int[] denoms = {25, 10, 5, 1};
        System.out.println(countChange(denoms, 10));

    }

    static int countChange(int[] denoms, int amount) {
        if (denoms.length == 0 || amount <= 0) {
            return 0;
        }

        // Each index in the lookup table represents an amount and the value at
        // that index will represent the number of ways to represent that amount
        // using the given denomination. So, for example, the value in lookupArray[3]
        // would have the number of ways to represent the amount 3.
        int[] lookupArray = new int[amount + 1];

        //Base case (if the given value is 0)
        lookupArray[0] = 1;

        for (int i = 0; i < denoms.length; i++) {
            for (int j = denoms[i]; j <= amount; j++) {
                lookupArray[j] += lookupArray[j - denoms[i]];
            }
        }

        return lookupArray[amount];
    }
}

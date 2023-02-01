package dynamic_programming;

public class KnapsackChallenge {
    public static void main(String[] args) {
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        System.out.println("Total knapsack profit: " + knapSack1(profits, weights, 7));
        System.out.println("Total knapsack profit: " + knapSack1(profits, weights, 6));
    }

    static int knapSack1(int[] profits, int[] weights, int capacity) {
        if (capacity <= 0 || profits.length == 0 || weights.length != profits.length) {
            return 0;
        }

        int[][] lookupArray = new int[profits.length + 1][capacity + 1];

        for (int i = 0; i <= profits.length; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    lookupArray[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    int includedItemProfit = profits[i - 1] + lookupArray[i - 1][w - weights[i - 1]];
                    int excludedItemProfit = lookupArray[i - 1][w];
                    lookupArray[i][w] = Math.max(includedItemProfit, excludedItemProfit);
                } else {
                    int excludedItemProfit = lookupArray[i - 1][w];
                    lookupArray[i][w] = excludedItemProfit;
                }
            }
        }

        return lookupArray[profits.length][capacity];
    }

    static int knapSack2(int[] profits, int[] weights, int capacity) {
        if (capacity <= 0 || profits.length == 0 || weights.length != profits.length) {
            return 0;
        }

        int[] lookupArray = new int[capacity + 1];
        for (int c = 0; c <= capacity; c++) {
            if (weights[0] <= c) {
                lookupArray[c] = profits[0];
            }
        }

        for (int i = 1; i < profits.length; i++) {
            for (int c = capacity; c >= 0; c--) {
                int profit1 = 0, profit2 = 0;
                if (weights[i] <= c) {
                    profit1 = profits[i] + lookupArray[c - weights[i]];
                }
                profit2 = lookupArray[c];
                lookupArray[c] = Math.max(profit1, profit2);
            }
        }
        return lookupArray[capacity];
    }
}

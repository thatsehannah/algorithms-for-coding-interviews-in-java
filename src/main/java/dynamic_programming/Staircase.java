package dynamic_programming;

public class Staircase {
    public static void main(String[] args) {
        System.out.println("Problem: A child is running up a staircase with n steps and can " +
                " hop either 1 step, 2 steps, or 3 steps at a time. Implement a function to count" +
                " the number of possible ways that the child can run up the stairs");
        System.out.println(countWays2(6));
    }


    // Using tabulation
    static int countWays(int numOfStairs) {
        int[] lookupArray = new int[numOfStairs + 1];
        lookupArray[0] = 1; // The total number of ways to reach the zero-step
        lookupArray[1] = 1; // The total number of ways to reach the first step
        lookupArray[2] = 2; // The total number of ways to reach the second step

        for (int i = 3; i <= numOfStairs; i++) {
            // calculates the total number of ways to reach the nth step by summing the ways to reach the previous 3 steps
            lookupArray[i] = lookupArray[i - 1] + lookupArray[i - 2] + lookupArray[i - 3];
        }

        return lookupArray[numOfStairs];
    }

    // Using tabulation but accounting for space complexity
    static int countWays2(int numOfStairs) {
        if (numOfStairs < 0) {
            return 0;
        }

        if (numOfStairs <= 2) {
            return 1;
        }

        int thirdLast = 1; // ways to reach the third last stair
        int secondLast = 1; // ways to reach the second last stair
        int last = 2; // ways to reach the last stair;
        int current = Integer.MIN_VALUE;

        for (int i = 3; i <= numOfStairs; i++) {
            current = last + secondLast + thirdLast; // ways to reach the current stair
            thirdLast = secondLast; // similar to i - 3
            secondLast = last; // similar to i - 2
            last = current; // similar to i - 1
        }

        return current;
    }
}

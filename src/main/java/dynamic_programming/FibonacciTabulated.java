package dynamic_programming;

public class FibonacciTabulated {
    public static void main(String[] args) {
        int n = 6;
        int[] lookupArray = new int[n + 1];
        System.out.println(fibTabulated1(n, lookupArray));
        System.out.println(fibTabulated2(n));
    }

    static int fibTabulated1(int target, int[] lookupArray) {

        // Initializes the first two values
        // Base cases
        lookupArray[0] = 0;
        lookupArray[1] = 1;

        for (int i = 2; i <= target; i++) { // Starting from the third element until target
            lookupArray[i] = lookupArray[i - 1] + lookupArray[i - 2]; // grab the previous 2 elements and add those elements together to get current element's value
        }

        return lookupArray[target];
    }

    // Since we only want to get the value at the target in the sequence,
    // we're not storing the values at each iteration until i equals the
    // target. This reduces space complexity as opposed to the solution above.
    // Actually, we can use this solution to print the sequence up to the
    // target as well
    static int fibTabulated2(int target) {
        if (target <= 1) {
            return target;
        }

        int secondLast = 0;
        int last = 1;
        int currentValue = Integer.MIN_VALUE;
        for (int i = 2; i <= target; i++) {
            currentValue = secondLast + last;
            secondLast = last; // equivalent to (i - 2)
            last = currentValue; // equivalent to (i - 1)
        }

        return currentValue;
    }
}

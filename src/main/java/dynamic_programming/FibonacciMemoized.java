package dynamic_programming;

public class FibonacciMemoized {
    public static void main(String[] args) {
        int target = 6;
        int[] lookupArray = new int[target + 1];
        for (int i = 0; i < target + 1; i++) {
            lookupArray[i] = -1;
        }

        System.out.println(fib(target, lookupArray));
    }

    static int fib(int target, int[] lookupArray) {
        if (lookupArray[target] == -1) { // check if value is already in the lookupArray. The index equals the target and the value will be what we are looking for
            if (target <= 1) { // base case
                lookupArray[target] = target;
            } else {
                lookupArray[target] = fib(target - 1, lookupArray) + fib(target - 2, lookupArray); // recursive case
            }
        }
        return lookupArray[target];
    }
}

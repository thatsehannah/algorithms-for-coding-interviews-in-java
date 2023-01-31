package sorting_searching;

public class CountElementOccurrence {
    public static void main(String[] args) {
        int[] arr = {-5, -3, 0, 1, 3, 3, 3, 4, 5};
        System.out.println(calcFreq(arr, 3));
    }

    static int calcFreq(int[] arr, int key) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        return count;
    }
}

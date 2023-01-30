package sorting_searching;

public class SearchMatrixForTarget {
    public static void main(String[] args) {
        int[][] matrix  = {{10, 11, 12, 13},
                {14, 15, 16, 17},
                {27, 29, 30, 31},
                {32, 33, 39, 80}};

        System.out.println(findKey2(matrix, 30));
    }

    //brute force (my solution, which is less efficient than the solution below)
    static boolean findKey(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    // This will only work if the matrix is sorted
    static boolean findKey2(int[][] matrix, int target) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int currentRow = numRows - 1; // the last row in the matrix
        int currentColumn = 0; // the first element in the last row's array

        while (currentRow >= 0 && currentColumn < numRows) {
            if (matrix[currentRow][currentColumn] == target) {
                return true;
            }

            if (target > matrix[currentRow][currentColumn]) {
                currentColumn++; // move over to the right in array at the current row
            } else {
                currentRow--; // move up a row while maintaining current column position
            }
        }

        return false;
    }
}

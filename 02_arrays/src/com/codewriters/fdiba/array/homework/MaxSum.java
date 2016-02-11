/**
 * Find the 3x3 matrix with the biggest sum.
 *
 * @author Aleksandar Savev <savevjr@gmail.com>
 * @since 11-Feb-2016
 */
public class MaxSum {

    public static void main(String[] args) {
        int[][] mat = {
            { 7, 1, 3, 3, 2, 1 },
            { 1, 3, 9 ,8, 5, 6 },
            { 4, 6, 7, 9, 1, 0 }
        };

        int rows = mat.length;
        int cols = mat[0].length;

        int maxSum = 0;
        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sum = 0;
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        sum += mat[i][j];
                    }
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("Max 3x3 sum: " + maxSum);
    }
}

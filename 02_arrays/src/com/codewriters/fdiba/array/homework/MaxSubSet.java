import java.util.Arrays;
import java.util.Scanner;


/**
 * Write a program that finds the sub-array with greatest sum within another array.
 * 
 * @author Aleksandar Savev <savevjr@gmail.com>
 * @since 11-Feb-16
 */
public class MaxSubSet {

    public static void main(String[] args) {
        // example input: 1,2,3,-1,-2,-3,0,4,5
        Scanner s = new Scanner(System.in);
        String[] setString = s.nextLine().split(",");
        s.close();

        int[] set = new int[setString.length];
        for (int i = 0; i < set.length; i++) {
            set[i] = Integer.parseInt(setString[i]);
        }
        Arrays.sort(set);
        for (int i = set.length - 1; i > set.length - 4 && i >= 0; i--) {
            System.out.print(set[i] + " ");
        }
    }
}

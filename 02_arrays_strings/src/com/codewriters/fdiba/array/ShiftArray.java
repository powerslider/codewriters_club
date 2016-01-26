package com.codewriters.fdiba.array;

/**
 * Shift a given array of integers by K elements.
 * <p>
 * Example: input = {1, 2, 3, 4, 5, 6}, K = 2, result = {5, 6, 1, 2, 3, 4}.
 * 
 * @author Aleksandar Savev <savevjr@gmail.com>
 * @since 25-Jan-16
 */
public class ShiftArray
{
    public static void main(String[] args)
    {
        int[] inputSet = new int[]{1, 2, 3, 4, 5, 6};
        int[] outputSet = new int[inputSet.length];
        int shiftBy = 2;
        for (int i = 0; i < inputSet.length; i++)
        {
            outputSet[(i + shiftBy) % inputSet.length] = inputSet[i];
        }

        for (int i = 0; i < inputSet.length; i++)
        {
            System.out.print(outputSet[i] + " ");
        }
    }
}

package com.codewriters.fdiba.array;


import java.util.Scanner;


/**
 * Find all subsets {a, b, c} in a given set of integers S that a + b + c = 0.
 * 
 * @author Aleksandar Savev <savevjr@gmail.com>
 * @since 25-Jan-16
 */
public class SubSets
{

    public static void main(String[] args)
    {
        // example input: 1,2,3,-1,-2,-3,0,4,5
        Scanner s = new Scanner(System.in);
        String[] setString = s.nextLine().split(",");
        s.close();

        int[] set = new int[setString.length];
        for (int i = 0; i < set.length; i++)
        {
            set[i] = Integer.parseInt(setString[i]);
        }

        for (int i = 0; i < set.length - 2; i++)
        {
            for (int j = i + 1; j < set.length - 1; j++)
            {
                for (int k = j + 1; k < set.length; k++)
                {
                    if (set[i] + set[j] + == -set[k])
                    {
                        System.out.println(set[i] + ", " + set[j] + ", " + set[k]);
                    }
                }
            }
        }
    }
}

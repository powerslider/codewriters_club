package com.fdiba.code.basics.homework;

import java.io.*;
import java.util.Scanner;

/**
 * Read an arithmethic expression from the console, write it into a file,
 * read it from that file, evaluate it and write the result to a different file.
 *
 * @author Tsvetan Dimitrov <tsvetan.dimitrov@ontotext.com>
 * @since 19-Jan-2016
 */
public class FileIoArithmetic {

    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        FileOutputStream fos = new FileOutputStream("file1.txt");
        fos.write(expression.getBytes());
        fos.close();

        int result = 0;
        Scanner reader = new Scanner(new File("file1.txt"));
        while (reader.hasNextLine()) {
            String readExpr = reader.nextLine();
            String[] exprParts = readExpr.split("\\s");
            int leftOperand = Integer.parseInt(exprParts[0]);
            int rightOperand = Integer.parseInt(exprParts[exprParts.length - 1]);
            String operation = exprParts[1];
            switch (operation) {
                case "+":
                    result = leftOperand + rightOperand;
                    break;
                case "-":
                    result = leftOperand - rightOperand;
                    break;
                case "*":
                    result = leftOperand * rightOperand;
                    break;
                case "/":
                    result = leftOperand / rightOperand;
                    break;
                default:
                    result = Integer.MAX_VALUE;
            }

        }

        FileOutputStream fos1 = new FileOutputStream("file2.txt");
        fos1.write(String.valueOf(result).getBytes());
        fos1.close();
    }
}

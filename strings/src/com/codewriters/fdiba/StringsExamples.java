package com.codewriters.fdiba

import java.util.Date;
import java.util.Scanner;

/**
 * @author Aleksandar Savev <savevjr@gmail.com>
 * @since 18-Feb-2016
 */
public class StringsExamples {

	public static void main(String[] args) {
		String myNameIs = "Aleksandar Savev";
		String lastName = myNameIs.substring("Aleksandar ".length(), myNameIs.length());
		System.out.println(lastName);

		String escaped = "To surround quoted text with \" use \\\" in your java code";
		System.out.println(escaped);

		String heart = "Heart = \u2665";

		System.out.println(heart);

		String a = new String("string 1");
		String b = new String("string 1");
		String c = "string 3";

		boolean f = a == b;
		boolean g = a.equals(b);
		boolean h = a.equals(c);

		String komshiqta = "Presko Peev";
		String komshiqtaA = komshiqta.concat(" - Komsho");
		System.out.println(komshiqtaA);

		long now = new Date().getTime();
		String bigString = "";
		for (int i = 0; i < 30000; i++)
			bigString += i;
		System.out.println((new Date().getTime() - now) + " milliseconds");

		now = new Date().getTime();
		StringBuilder builder = new StringBuilder(30000);
		for (int i = 0; i < 30000; i++)
			builder.append(i);
		System.out.println((new Date().getTime() - now) + " milliseconds");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age:");
		System.out.println(Integer.parseInt(scanner.nextLine()) + 10);
		scanner.close();

		String jungla = "In the  jungle the mighty jungle";
		String[] words = jungla.split(" ");

		for (String word : words)
			System.out.println(word);

		String input = "12\\22\\32\\12"; // actual string -> '12\22\32\12'
		String[] numbers = input.split("\\\\"); // split by '\'

		String palindrome = "азобичаммачибоза";
		boolean isPalindrome = true;
		for (int i = 0; i < input.length() / 2 && isPalindrome; i++) {
			if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - 1 - i)) {
				isPalindrome = false;
			}
		}
		System.out.println(isPalindrome);
	}
}

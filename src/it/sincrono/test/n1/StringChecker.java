package it.sincrono.test.n1;

import java.util.Arrays;
import java.util.List;

public class StringChecker {

	private String string;
	private static final List<Character> vowels = Arrays.asList(new Character[] { 'A', 'E', 'I', 'O', 'U' });

	public StringChecker(String string) {
		this.string = string;
	}

	public StringChecker check(String string) {
		this.string = string;
		return this;
	}

	public boolean isEven() {
		return string.length() % 2 == 0;
	}

	public boolean isOdd() {
		return string.length() % 2 != 0;
	}

	public boolean isPalindrome() {
		String reverse = new StringBuilder(string).reverse().toString();
		return string.contentEquals(reverse);
	}

	public static boolean isVowel(Character character) {
		return vowels.contains(character);
	}

}

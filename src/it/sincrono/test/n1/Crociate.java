package it.sincrono.test.n1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Crociate {

	private final Character[][] table;
	private final Set<String> words;
	private int palindrome;
	private int odd;
	private int even;
	private int vowels;
	private int consonants;

	public Crociate(Character[][] table) {
		this.table = table;
		palindrome = 0;
		odd = 0;
		even = 0;
		vowels = 0;
		consonants = 0;
		words = new HashSet<String>();

		StringBuilder stringBuilder = new StringBuilder();
		countAll();

		// Horizontal words
		for(int i = 0; i < table.length; i++) {
			for(Character character : table[i]) {
				if(character == null) {
					add(stringBuilder);
				} else {
					stringBuilder.append(character);
				}
			}
			add(stringBuilder);
		}

		// Vertical words
		for(int j = 0; j < table[0].length; j++) {
			for(int i = 0; i < table.length; i++) {
				Character character = table[i][j];
				if(character == null) {
					add(stringBuilder);
				} else {
					stringBuilder.append(character);
				}
			}
			add(stringBuilder);
		}

		// Oblique words (left top to right bottom)
		for(int j = table[0].length - 2; j >= 0; j--) {
			for(int i = 0; i < table.length && i + j < table[0].length; i++) {
				Character character = table[i][j + i];
				if(character == null) {
					add(stringBuilder);
				} else {
					stringBuilder.append(character);
				}
			}
			add(stringBuilder);
		}
		for(int i = 1; i < table.length - 1; i++) {
			for(int j = 0; j < table[0].length && i + j < table.length; j++) {
				Character character = table[i + j][j];
				if(character == null) {
					add(stringBuilder);
				} else {
					stringBuilder.append(character);
				}
			}
			add(stringBuilder);
		}

		// Oblique words (right top to left bottom)
		for(int j = table[0].length - 2; j >= 0; j--) {
			for(int i = table.length - 1; i >= 0 && j + table.length - i - 1 < table[0].length; i--) {
				// console.log(i);
				Character character = table[i][j + table.length - i - 1];
				if(character == null) {
					add(stringBuilder);
				} else {
					stringBuilder.append(character);
				}
			}
			add(stringBuilder);
		}
		for(int i = table.length - 2; i > 0; i--) {
			for(int j = 0; i - j >= 0; j++) {
				Character character = table[i - j][j];
				if(character == null) {
					add(stringBuilder);
				} else {
					stringBuilder.append(character);
				}
			}
			add(stringBuilder);
		}

	}

	private void add(StringBuilder stringBuilder) {
		if(stringBuilder.length() > 1) {
			StringChecker string = new StringChecker(stringBuilder.toString());
			
			// Add word and reverse to list
			words.add(stringBuilder.toString());
			words.add(stringBuilder.reverse().toString());

			// Even-odd check
			if(string.isEven())
				even++;
			else
				odd++;

			// Palindrome check
			if(string.isPalindrome())
				palindrome++;
		}
		stringBuilder.delete(0, stringBuilder.length());
	}

	private void countAll() {
		for(Character[] row : table)
			for(Character character : row)
				if(character != null)
					if(StringChecker.isVowel(character))
						vowels++;
					else
						consonants++;
	}

	public List<String> getSortedWords() {
		List<String> list = new ArrayList<String>(words);
		Collections.sort(list);
		return list;
	}

	public boolean containsWords(Collection<String> c) {
		return words.containsAll(c);
	}

	public Character[][] getTable() {
		return table;
	}

	public Set<String> getWords() {
		return words;
	}

	public int getPalindrome() {
		return palindrome;
	}

	public int getOdd() {
		return odd;
	}

	public int getEven() {
		return even;
	}

	public int getVowels() {
		return vowels;
	}

	public int getConsonants() {
		return consonants;
	}

}

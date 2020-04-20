package it.sincrono.vettori;

import java.util.Arrays;
import java.util.List;

public class Vettori {

	private final static List<Character> vocali = Arrays.asList(new Character[] { 'a', 'e', 'i', 'o', 'u' });

	public static void main(String[] args) {
		char[][] m = { { 'a', 'c', 'd', 'f' }, { 'g', 'm', 'l', 'k' } };
		printMatrice(m);
		scambiaVocali(m);
		printMatrice(m);
	}

	private static boolean isVocale(Character character) {
		return vocali.contains(character);
	}

	public static void scambiaVocali(char[][] m) {
		int counter = 0;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				boolean b = false;
				if(i > 0)
					b |= isVocale(m[i - 1][j]);
				if(i < m.length - 1)
					b |= isVocale(m[i + 1][j]);
				if(j > 0)
					b |= isVocale(m[i][j - 1]);
				if(j < m[i].length - 1)
					b |= isVocale(m[i][j + 1]);

				if(!b)
					m[i][j] = vocali.get(counter % 5);
			}
		}
	}
	
	public static void printMatrice(char[][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

}

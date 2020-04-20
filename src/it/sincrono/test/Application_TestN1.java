package it.sincrono.test;

import java.util.Arrays;
import java.util.List;

import it.sincrono.test.n1.Crociate;

public class Application_TestN1 {

	public static final Character[][] table = { { 'C', 'A', 'M', null, null, 'A', null, 'S', 'C', 'O', 'P', 'A' },
			{ 'A', 'M', 'B', 'I', 'E', 'N', 'T', 'A', 'R', 'S', 'I', null },
			{ 'N', 'P', null, 'N', null, 'T', 'E', null, 'I', 'S', 'E', 'R' },
			{ 'D', 'I', 'S', 'C', 'R', 'I', 'M', 'I', 'N', 'A', 'T', 'O' },
			{ 'I', null, 'C', 'R', 'A', 'T', 'E', 'R', 'E', null, 'R', 'S' },
			{ 'D', 'E', 'R', 'I', 'D', 'E', 'R', 'E', null, 'M', 'A', 'E' },
			{ 'C', 'R', 'E', 'M', 'O', 'S', 'A', null, 'R', 'E', 'F', 'E' },
			{ 'A', 'R', 'M', 'I', null, 'I', 'R', 'P', 'I', 'N', 'O', null },
			{ 'M', 'O', 'A', 'N', 'A', null, 'I', 'A', 'N', null, 'C', 'U' },
			{ 'E', 'R', 'T', 'A', null, 'C', 'A', 'R', 'A', 'V', 'A', 'N' },
			{ 'R', 'I', 'A', 'R', 'S', 'A', null, 'C', null, 'A', 'I', 'O' },
			{ 'A', null, null, 'E', 'S', 'T', 'R', 'A', 'T', 'T', 'A', null } };

	public static final List<String> words = Arrays.asList(new String[] { "AIO", "ANTITESI", "CANDIDCAMERA", "CRATERE",
			"CU", "ERRORI", "IAN", "IRPINO", "MB", "NP", "PIETRAFOCAIA", "RIARSA", "RS", "SCREMATA", "TEMERARIA",
			"AMBIENTARSI", "ARMI", "CARAVAN", "CREMOSA", "DERIDERE", "ERTA", "INCRIMINARE", "ISER", "MEN", "OSSA",
			"RADO", "RINA", "SA", "SS", "UNO", "AMPI", "CAM", "CAT", "CRINE", "DISCRIMINATO", "ESTRATTA", "IRE", "MAE",
			"MOANA", "PARCA", "REFE", "ROSEE", "SCOPA", "TE", "VAT" });

	public static void main(String[] args) {
		Crociate crociate = new Crociate(table);
//		crociate.sortWords();

		// Print all available words
		for(String word : crociate.getSortedWords()) {
			System.out.println(word);
		}

		// TODO: Implement Set instead of List
		System.out.println();
		System.out.println("Elenco contenuto: " + crociate.containsWords(words));
		System.out.println("Palindrome: " + crociate.getPalindrome());
		System.out.println("Pari: " + crociate.getEven());
		System.out.println("Dispari: " + crociate.getOdd());
		System.out.println("Consonanti: " + crociate.getConsonants());
		System.out.println("Vocali: " + crociate.getVowels());
	}

}

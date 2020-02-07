package it.sincrono.lettereefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LettereFile {

	// Throws perché non mi andava di gestire le eccezioni
	public static void main(String[] args) throws Exception {

		// Reader del file
		BufferedReader reader;
		reader = new BufferedReader(new FileReader(
				"C:\\Users\\Utente\\Desktop\\corso-workspace\\SincronoCorso\\src\\resources\\lettere.txt"));

		String s; // Linea
		Map<Character, Integer> map = new HashMap<Character, Integer>(); // HashMap <carattere letto, occorrenze>
		
		// Leggi più righe
		while((s = reader.readLine()) != null) {
			String[] values = s.split(",");
			for(String value : values) {
				Character c = Character.valueOf(value.charAt(0));

				// Prendi occorrenza carattere
				Integer i = map.get(c);
				if(i == null)
					map.put(c, 1); // Non ci sono occorrenze: imposta occorrenze a 1
				else
					map.put(c, i + 1); // Ci sono occorrenze: incrementa occorenze
				
				// Oppure: map.put(c, (i != null) ? i + 1 : 1);
			}
		}
		reader.close();

		// Printa occorrenze
		for(Entry<Character, Integer> entry : map.entrySet())
			System.out.println(entry.getKey() + ": " + entry.getValue());

	}

}

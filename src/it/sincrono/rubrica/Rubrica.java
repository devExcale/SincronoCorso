package it.sincrono.rubrica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Rubrica {

	private List<Contatto> elenco;

	public Rubrica() {
		elenco = new ArrayList<Contatto>();
	}

	public void aggiungiContatto(String nome, String cognome, String telefono) {
		elenco.add(new Contatto(nome, cognome, telefono));
	}

	public void rimuoviContatto(String nome, String cognome) {
		elenco.removeIf(contatto -> (contatto.getNome() == nome && contatto.getCognome() == cognome));
	}

	public String cerca(String nome, String cognome) {
		String numero = null;
		Contatto c = elenco.stream()
				.filter(contatto -> (contatto.getNome() == nome && contatto.getCognome() == cognome))
				.findFirst()
				.orElse(null);
		if (c != null)
			numero = c.getNome();
		return numero;
	}

	@Override
	public String toString() {
		return String.join("\n", elenco.stream().map(contatto -> contatto.toString()).collect(Collectors.toList()));
	}
}

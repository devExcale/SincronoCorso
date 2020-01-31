package it.sincrono.rubrica;

public class Contatto {

	private final String nome;
	private final String cognome;
	private final String telefono;

	public Contatto(String nome, String cognome, String telefono) {
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
	}
	
	public Contatto(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		telefono = null;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getTelefono() {
		return telefono;
	}

	@Override
	public String toString() {
		return String.format("%s %s [%s]", cognome, nome, telefono);
	}
}

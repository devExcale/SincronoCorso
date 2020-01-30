package it.sincrono.garage;

public abstract class Veicolo {

	enum Tipo {
		FURGONE, AUTO, MOTO
	}

	protected final Tipo tipo;
	protected final String marca;
	protected final int anno;
	protected final int cilindrata;

	@Override
	public abstract String toString();

	protected Veicolo(Tipo tipo, String marca, int anno, int cilindrata) {
		this.tipo = tipo;
		this.marca = marca;
		this.anno = anno;
		this.cilindrata = cilindrata;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public String getMarca() {
		return marca;
	}

	public int getAnno() {
		return anno;
	}

	public int getCilindrata() {
		return cilindrata;
	}

}

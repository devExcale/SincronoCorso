package it.sincrono.garage;

public class Furgone extends Veicolo {
	
	private double capacita;

	public Furgone(String marca, int anno, int cilindrata, double capacita) {
		super(Tipo.FURGONE, marca, anno, cilindrata);
		this.capacita = capacita;
	}

	public double getCapacita() {
		return capacita;
	}

	public void setCapacita(double capacita) {
		this.capacita = capacita;
	}

	@Override
	public String toString() {
		return "Furgone [Marca: " + marca
				+ "; Anno:" + anno
				+ "; Cilindrata:" + cilindrata
				+ "; Capacita': " + capacita + "]";
	}

}

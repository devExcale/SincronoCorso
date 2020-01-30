package it.sincrono.garage;

public class Auto extends Veicolo {

	public enum Alimentazione {
		DIESEL, BENZINA, GPL
	}

	private int porte;
	private Alimentazione alimentazione;

	// costuttore
	public Auto(String marca, int anno, int cilindrata, int porte, Alimentazione alimentazione) {
		super(Tipo.AUTO, marca, anno, cilindrata);
		this.porte = porte;
		this.alimentazione = alimentazione;
	}

	public Alimentazione getAlimentazione() {
		return alimentazione;
	}

	public void setAlimentazione(Alimentazione alimentazione) {
		this.alimentazione = alimentazione;
	}

	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}

	@Override
	public String toString() {
		return "Auto [Marca: " + marca
				+ "; Anno: " + anno
				+ "; Cilindrata: " + cilindrata
				+ "; Porte: " + porte
				+ "; Alimentazione: " + alimentazione.toString().toLowerCase() + "]";
	}

}

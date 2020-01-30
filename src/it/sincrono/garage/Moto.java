package it.sincrono.garage;

public class Moto extends Veicolo {

	private int tempi;
	
	// costruttore con attributi dalla classe veicoli
	public Moto(String marca, int anno, int cilindrata, int tempi) {
		super(Tipo.MOTO, marca, anno, cilindrata);
		this.tempi = tempi;
	}


	public double getTempi() {
		return tempi;
	}

	@Override
	public String toString() {
		return "Moto [Marca: " + marca
				+ "; Anno:" + anno
				+ "; Cilindrata:" + cilindrata
				+ "; Tempi: " + tempi + "]";
	}

}

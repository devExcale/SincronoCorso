package it.sincrono.garage;

public class Garage {

	public static int posti = 12;
	private final Veicolo[] veicoli;

	public Garage() {
		veicoli = new Veicolo[posti];
	}

	// True: Veicolo entrato | False: Garage pieno
	public boolean entraVeicolo(Veicolo veicolo) {
		boolean entrato = false;
		for (int i = 0; i < posti; i++)
			if (veicoli[i] == null) {
				veicoli[i] = veicolo;
				entrato = true;
				break;
			}
		return entrato;
	}

	public Veicolo esciVeicolo(int posto) {
		// TODO: ciclo dimenticato
		Veicolo v = null;
		if (posto >= 0 && posto < 15) {
			v = veicoli[posto];
			veicoli[posto] = null;
		}

		return v;
	}

	public String veicoloIn(int posto) {
		String s = null;
		try {
			s = veicoli[posto].toString();
		} catch (NullPointerException e) {
			s = "Posto libero";
		} catch (ArrayIndexOutOfBoundsException e) {
			s = "Posto inesistente";
		}

		return s;
	}

}

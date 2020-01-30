package it.sincrono;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import it.sincrono.garage.Auto;
import it.sincrono.garage.Auto.Alimentazione;
import it.sincrono.garage.Furgone;
import it.sincrono.garage.Garage;
import it.sincrono.garage.Moto;

public class Application_Garage {

	private static final class Menu {
		public static final String main = "\n[Garage]\n1. Entra un veicolo\n2. Esci un veicolo\n3. Controlla informazioni garage\n0. Esci\n";
		public static final String mezzo = "\n[Veicolo]\n F) Furgone\n A) Auto\n M) Moto\n";
		public static final String alimentazione = "\n[Alimentazione]\n - Diesel\n - Benzina\n - GPL\n";
	};

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(new Locale("it"));
		Garage.posti = 15;
		Garage garage = new Garage();
		int scelta; // Scelta azione
		boolean loop = true; // Variabile ciclo menu'

		do {
			// Stampa menu'
			System.out.println(Menu.main);
			try {
				scelta = in.nextInt();
				in.nextLine(); // Flush input buffer
			} catch (InputMismatchException e) {
				System.out.println("Input invalido!");
				continue;
			}

			// Scelta azione
			switch (scelta) {
			case 0:
				loop = false;
				break;

			case 1:
				// Stampa scelta mezzo
				System.out.println(Menu.mezzo);
				char tv; // tv [Tipo Veicolo]
				try {
					String s = in.nextLine().toUpperCase();
					tv = s.charAt(0);
				} catch (InputMismatchException e) {
					System.out.println("Input invalido!");
					continue;
				}

				String marca;
				int anno, cilindrata;
				switch (tv) {
				case 'F':
					double capacita;
					try {
						System.out.print("Inserire marca: ");
						marca = in.nextLine();
						System.out.print("Inserire anno: ");
						anno = in.nextInt();
						System.out.print("Inserire cilindrata: ");
						cilindrata = in.nextInt();
						System.out.print("Inserire capacita': ");
						capacita = in.nextDouble();
					} catch (InputMismatchException e) {
						System.out.println("Input invalido!");
						continue;
					}

					garage.entraVeicolo(new Furgone(marca, anno, cilindrata, capacita));
					break;

				case 'A':
					int porte;
					Alimentazione alimentazione;
					try {
						System.out.print("Inserire marca: ");
						marca = in.nextLine();
						System.out.print("Inserire anno: ");
						anno = in.nextInt();
						System.out.print("Inserire cilindrata: ");
						cilindrata = in.nextInt();
						System.out.print("Inserire numero porte: ");
						porte = in.nextInt();
						in.nextLine(); // Flush input buffer
						System.out.print(Menu.alimentazione + "Inserire alimentazione: ");
						alimentazione = Alimentazione.valueOf(in.nextLine().toUpperCase());
					} catch (InputMismatchException e) {
						System.out.println("Input invalido!");
						continue;
					} catch (IllegalArgumentException e) {
						System.out.println("Alimentazione non esistente.");
						continue;
					}

					garage.entraVeicolo(new Auto(marca, anno, cilindrata, porte, alimentazione));
					break;

				case 'M':
					int tempi;
					try {
						System.out.print("Inserire marca: ");
						marca = in.nextLine();
						System.out.print("Inserire anno: ");
						anno = in.nextInt();
						System.out.print("Inserire cilindrata: ");
						cilindrata = in.nextInt();
						System.out.print("Inserire tempi: ");
						tempi = in.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Input invalido!");
						continue;
					}

					garage.entraVeicolo(new Moto(marca, anno, cilindrata, tempi));
					break;

				default:
					System.out.println("Opzione inesistente!");
				}
				break;

			case 2:
				System.out.print("Inserire posto: ");
				int posto = in.nextInt();
				if (garage.esciVeicolo(posto) == null)
					System.out.println("Nessun veicolo in quel posto.");
				else
					System.out.println("Veicolo uscito!");
				break;

			case 3:
				for (int i = 0; i < Garage.posti; i++)
					System.out.println("[" + i + "] " + garage.veicoloIn(i));
				break;
			}

		} while (loop);
		
		in.close();
		System.out.println("Il garage chiude!");

	}

}

package it.sincrono;

import java.util.Scanner;

import it.sincrono.exceptions.FibonacciCalculator;
import it.sincrono.exceptions.NegativeNumberException;

public class Application_Exception {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		FibonacciCalculator fc = new FibonacciCalculator();

		System.out.println("[Fibonacci Computer]");
		System.out.print("Inserire indice del numero: ");
		int n = scan.nextInt();

		try {
			int risultato = fc.calcolaTermine(n);
			System.out.println("Sequenza di Fibonacci, posizione " + n + ": " + risultato);
		} catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
		
		scan.close();
	}

}

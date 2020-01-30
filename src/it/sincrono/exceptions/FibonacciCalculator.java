package it.sincrono.exceptions;

public class FibonacciCalculator {
	public int calcolaTermine(int indice) throws NegativeNumberException {
		
		if(indice < 0)
			throw new NegativeNumberException("Numeri negativi non accettati", indice);
		
		double rt5 = Math.sqrt(5);
		return (int) ((Math.pow(1 + rt5, indice) - Math.pow(1 - rt5, indice)) / (Math.pow(2, indice) * rt5));
	}
}

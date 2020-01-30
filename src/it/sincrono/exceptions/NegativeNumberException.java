package it.sincrono.exceptions;

@SuppressWarnings("serial")
public class NegativeNumberException extends Exception {

	private int number;

	public NegativeNumberException(int number) {
		super();
		this.number = number;
	}

	public NegativeNumberException(String message, int number) {
		super(message);
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}

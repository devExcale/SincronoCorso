package it.sincrono.geometry;

public class Application {

	public static void main(String[] args) {
		
		RegularPoligon rp = new Triangle(30D);
		System.out.println(rp.getArea());
	}

}

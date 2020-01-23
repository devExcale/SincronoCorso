package it.sincrono;

import it.sincrono.geometry.RegularPoligon;
import it.sincrono.geometry.Triangle;

public class Application_Geometric {

	public static void main(String[] args) {
		
		RegularPoligon rp = new Triangle(30D);
		System.out.println(rp.getArea());
	}

}

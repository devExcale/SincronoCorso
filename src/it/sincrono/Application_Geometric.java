package it.sincrono;

import it.sincrono.geometry.Pentagon;
import it.sincrono.geometry.RegularPoligon;
import it.sincrono.geometry.Square;
import it.sincrono.geometry.Triangle;

public class Application_Geometric {

	public static void main(String[] args) {
		
		RegularPoligon rp[] = {
			new Triangle(10D),
			new Square(10D),
			new Pentagon(10D)
		};
		for(int i=0; i<3; i++)
			System.out.println(rp[i].getArea());
	}

}

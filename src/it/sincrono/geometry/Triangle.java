package it.sincrono.geometry;

public class Triangle extends RegularPoligon {

	public static int sides = 3;
	
	public Triangle(Double sideLength) {
		super(sides);
		this.sideLength = sideLength;
		perimeter = sideLength * 3;
		area = computeArea(sideLength);
	}
	
	public static Double computeArea(Double side) {
		return side*side * Math.sqrt(3) / 2;
	}
	
	public static Double computeHeight(Double side) {
		return side * Math.sqrt(3) / 2;
	}

	@Override
	public Double getArea() {
		// TODO Auto-generated method stub
		return null;
	}

}

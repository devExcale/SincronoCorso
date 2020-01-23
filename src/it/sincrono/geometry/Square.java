package it.sincrono.geometry;

public class Square extends RegularPoligon {

	public static int sides = 4;
	
	
	public Square(Double sideLength) {
		super(sides, sideLength);
	}
	
	
	@Override
	protected Double computeHeight() {
		return sideLength;
	}

	@Override
	protected Double computeWidth() {
		return sideLength;
	}

	@Override
	protected Double computeArea() {
		return sideLength * sideLength;
	}

	@Override
	public void setSideLength(Double sideLength) {
		this.sideLength = sideLength;
		perimeter = sideLength * sides;
		height = sideLength;
		width = sideLength;
		area = sideLength * sideLength;
	}

}

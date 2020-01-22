package it.sincrono.geometry;

public class Triangle extends RegularPoligon {
	
	public static final int sides = 3;
	
	public Triangle(Double sideLength) {
		super(3, sideLength);
		this.sideLength = sideLength;
		perimeter = sideLength * 3;
		area = computeArea(sideLength);
	}
	
	
	public static final Double computeArea(Double side) {
		return side*side * Math.sqrt(3) / 2;
	}
	
	public static final Double computeHeight(Double side) {
		return side * Math.sqrt(3) / 2;
	}

	
	@Override
	public void setSideLength(Double sideLength) {
		this.sideLength = sideLength;
		perimeter = sideLength * sides;
		height = computeArea(sideLength);
		width = sideLength;
		area = computeArea(sideLength);
	}

	@Override
	protected Double computeHeight() {
		return sideLength * Math.sqrt(3) / 2;
	}

	@Override
	protected Double computeWidth() {
		return sideLength;
	}
	
	@Override
	protected Double computeArea() {
		return computeArea(sideLength);
	}
	
}

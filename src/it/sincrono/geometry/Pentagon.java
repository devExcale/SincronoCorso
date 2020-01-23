package it.sincrono.geometry;

public class Pentagon extends RegularPoligon {

	public static int sides = 5;

	
	public Pentagon(Double sideLength) {
		super(sides, sideLength);
	}
	

	public static final Double computeHeight(Double sideLength) {
		return sideLength * Math.sqrt(2*Math.sqrt(5) + 5) / 2;
	}

	public static final Double computeWidth(Double sideLength) {
		return sideLength * (1 + Math.sqrt(5)) / 2;
	}

	public static final Double computeArea(Double sideLength) {
		return Math.sqrt(10*Math.sqrt(5) + 25) * sideLength*sideLength / 4;
	}

	
	@Override
	protected Double computeHeight() {
		return computeHeight(sideLength);
	}

	@Override
	protected Double computeWidth() {
		return computeWidth(sideLength);
	}

	@Override
	protected Double computeArea() {
		return computeArea(sideLength);
	}

	@Override
	public void setSideLength(Double sideLength) {
		this.sideLength = sideLength;
		perimeter = sideLength * sides;
		height = computeHeight(sideLength);
		width = computeWidth(sideLength);
		area = computeArea(sideLength);
	}

}

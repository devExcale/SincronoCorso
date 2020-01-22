/**
 * 
 */
package it.sincrono.geometry;

/**
 * @author Excale
 *
 */
public abstract class RegularPoligon implements GeometricShape {
	
	protected final int sidesNumber;
	protected Double sideLength;
	protected Double perimeter;
	protected Double height;
	protected Double width;
	protected Double area;
	
	
	protected abstract Double computeHeight();
	protected abstract Double computeWidth();
	protected abstract Double computeArea();
	public abstract void setSideLength(Double sideLength);
	
	protected RegularPoligon(Integer sides, Double sideLength) {
		this.sidesNumber = sides;
		this.sideLength = sideLength;
		perimeter = sides * sideLength;
		height = computeHeight();
		width = computeWidth();
		area = computeArea();
	}
	
	public Double getSideLength() {
		return sideLength;
	};
	
	@Override
	public Double getPerimeter() {
		return perimeter;
	}
	
	@Override
	public Double getHeight() {
		return height;
	}
	
	@Override
	public Double getWidth() {
		return width;
	}
	
	@Override
	public Double getArea() {
		return area;
	}
	

}

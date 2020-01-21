/**
 * 
 */
package it.sincrono.geometry;

/**
 * @author Excale
 *
 */
public abstract class RegularPoligon implements GeometricShape {
	
	protected Double sideLength;
	protected Double height;
	protected Double perimeter;
	protected Double area;
	
	protected final int sides;
	
	public abstract Double getArea();
	
	protected RegularPoligon(int sides) {
		this.sides = sides;
	}
	
	public Double getSideLength() {
		return sideLength;
	};
	
	public Double getHeight() {
		return height;
	}
	
	@Override
	public Double getPerimeter() {
		return perimeter;
	}
	
	

}

/**
 * 
 */
package it.sincrono.geometry;

/**
 * @author Excale
 *
 */
public abstract class RegularPoligon implements GeometricShape {
	
	private Double side;
	private Double height;
	private Double perimeter;
	
	public Double getSide() {
		return side;
	};
	
	public Double getHeight() {
		return height;
	}
	
	@Override
	public Double getPerimeter() {
		return perimeter;
	}
	
	

}

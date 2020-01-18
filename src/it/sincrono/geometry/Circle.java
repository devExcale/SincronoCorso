package it.sincrono.geometry;

public class Circle implements GeometricShape {
	
	private Double radius;
	private Double circumference;
	private Double area;
	
	
	
	/**
	 * @return The radius
	 */
	public Double getRadius() {
		return radius;
	}

	/**
	 * @param Radius of the circumference
	 */
	public void setRadius(Double radius) {
		this.radius = radius;
		this.circumference = 2*Math.PI * radius;
		this.area = Math.PI * Math.pow(radius, 2);
	}

	/**
	 * @return The circumference
	 */
	public Double getCincumference() {
		return circumference;
	}
	
	/**
	 * @return The area of the circle
	 */
	@Override
	public Double getArea() {
		return area;
	}

	/**
	 * @return The circumference
	 */
	@Override
	public Double getPerimeter() {
		return getCincumference();
	}

}

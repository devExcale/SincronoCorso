package it.sincrono.geometry;

public class Circle implements GeometricShape {
	
	private Double radius;
	private Double diameter;
	private Double circumference;
	private Double area;
	
	
	public Circle(Double radius) {
		this.radius = radius;
		diameter = radius * 2;
		circumference = Math.PI * diameter;
		area = Math.PI * radius*radius;
	}
	

	public void setRadius(Double radius) {
		this.radius = radius;
		diameter = radius * 2;
		circumference = Math.PI * diameter;
		area = Math.PI * radius*radius;
	}

	public Double getRadius() {
		return radius;
	}
	public Double getCircumference() {
		return circumference;
	}

	public Double getDiameter() {
		return diameter;
	}
	
	@Override
	public Double getArea() {
		return area;
	}

	@Override
	public Double getPerimeter() {
		return circumference;
	}

	@Override
	public Double getWidth() {
		return diameter;
	}

	@Override
	public Double getHeight() {
		return diameter;
	}

}
